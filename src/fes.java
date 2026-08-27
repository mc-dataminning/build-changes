import com.google.common.base.Strings;
import com.google.gson.JsonParser;
import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.InsecurePublicKeyException.MissingException;
import com.mojang.authlib.yggdrasil.response.KeyPairResponse;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.PublicKey;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fes implements ffc {
   private static final Logger b = LogUtils.getLogger();
   private static final Duration c = Duration.ofHours(1L);
   private static final Path d = Path.of("profilekeys");
   private final UserApiService e;
   private final Path f;
   private CompletableFuture<Optional<byq>> g;
   private Instant h = Instant.EPOCH;

   public fes(UserApiService $$0, UUID $$1, Path $$2) {
      this.e = $$0;
      this.f = $$2.resolve(d).resolve($$1 + ".json");
      this.g = CompletableFuture.<Optional<byq>>supplyAsync(() -> this.c().filter($$0x -> !$$0x.c().b().a()), ac.f()).thenCompose(this::a);
   }

   @Override
   public CompletableFuture<Optional<byq>> a() {
      this.h = Instant.now().plus(c);
      this.g = this.g.thenCompose(this::a);
      return this.g;
   }

   @Override
   public boolean b() {
      return this.g.isDone() && Instant.now().isAfter(this.h) ? this.g.join().<Boolean>map(byq::a).orElse(true) : false;
   }

   private CompletableFuture<Optional<byq>> a(Optional<byq> $$0) {
      return CompletableFuture.supplyAsync(() -> {
         if ($$0.isPresent() && !$$0.get().a()) {
            if (!aa.aS) {
               this.a(null);
            }

            return $$0;
         } else {
            try {
               byq $$1 = this.a(this.e);
               this.a($$1);
               return Optional.of($$1);
            } catch (aoa | MinecraftClientException | IOException var3) {
               b.error("Failed to retrieve profile key pair", var3);
               this.a(null);
               return $$0;
            }
         }
      }, ac.f());
   }

   private Optional<byq> c() {
      if (Files.notExists(this.f)) {
         return Optional.empty();
      } else {
         try {
            Optional var2;
            try (BufferedReader $$0 = Files.newBufferedReader(this.f)) {
               var2 = byq.a.parse(JsonOps.INSTANCE, JsonParser.parseReader($$0)).result();
            }

            return var2;
         } catch (Exception var6) {
            b.error("Failed to read profile key pair file {}", this.f, var6);
            return Optional.empty();
         }
      }
   }

   private void a(@Nullable byq $$0) {
      try {
         Files.deleteIfExists(this.f);
      } catch (IOException var3) {
         b.error("Failed to delete profile key pair file {}", this.f, var3);
      }

      if ($$0 != null) {
         if (aa.aS) {
            byq.a.encodeStart(JsonOps.INSTANCE, $$0).result().ifPresent($$0x -> {
               try {
                  Files.createDirectories(this.f.getParent());
                  Files.writeString(this.f, $$0x.toString());
               } catch (Exception var3x) {
                  b.error("Failed to write profile key pair file {}", this.f, var3x);
               }
            });
         }
      }
   }

   private byq a(UserApiService $$0) throws aoa, IOException {
      KeyPairResponse $$1 = $$0.getKeyPair();
      if ($$1 != null) {
         byr.a $$2 = a($$1);
         return new byq(anz.a($$1.getPrivateKey()), new byr($$2), Instant.parse($$1.getRefreshedAfter()));
      } else {
         throw new IOException("Could not retrieve profile key pair");
      }
   }

   private static byr.a a(KeyPairResponse $$0) throws aoa {
      if (!Strings.isNullOrEmpty($$0.getPublicKey()) && $$0.getPublicKeySignature() != null && $$0.getPublicKeySignature().array().length != 0) {
         try {
            Instant $$1 = Instant.parse($$0.getExpiresAt());
            PublicKey $$2 = anz.b($$0.getPublicKey());
            ByteBuffer $$3 = $$0.getPublicKeySignature();
            return new byr.a($$1, $$2, $$3.array());
         } catch (IllegalArgumentException | DateTimeException var4) {
            throw new aoa(var4);
         }
      } else {
         throw new aoa(new MissingException());
      }
   }
}
