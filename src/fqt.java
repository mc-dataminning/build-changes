import com.google.common.base.Strings;
import com.google.gson.JsonParser;
import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.InsecurePublicKeyException.MissingException;
import com.mojang.authlib.yggdrasil.response.KeyPairResponse;
import com.mojang.authlib.yggdrasil.response.KeyPairResponse.KeyPair;
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

public class fqt implements frl {
   private static final Logger b = LogUtils.getLogger();
   private static final Duration c = Duration.ofHours(1L);
   private static final Path d = Path.of("profilekeys");
   private final UserApiService e;
   private final Path f;
   private CompletableFuture<Optional<cic>> g;
   private Instant h = Instant.EPOCH;

   public fqt(UserApiService $$0, UUID $$1, Path $$2) {
      this.e = $$0;
      this.f = $$2.resolve(d).resolve($$1 + ".json");
      this.g = CompletableFuture.<Optional<cic>>supplyAsync(() -> this.c().filter($$0x -> !$$0x.c().b().a()), ac.f()).thenCompose(this::a);
   }

   @Override
   public CompletableFuture<Optional<cic>> a() {
      this.h = Instant.now().plus(c);
      this.g = this.g.thenCompose(this::a);
      return this.g;
   }

   @Override
   public boolean b() {
      return this.g.isDone() && Instant.now().isAfter(this.h) ? this.g.join().<Boolean>map(cic::a).orElse(true) : false;
   }

   private CompletableFuture<Optional<cic>> a(Optional<cic> $$0) {
      return CompletableFuture.supplyAsync(() -> {
         if ($$0.isPresent() && !$$0.get().a()) {
            if (!aa.aV) {
               this.a(null);
            }

            return $$0;
         } else {
            try {
               cic $$1 = this.a(this.e);
               this.a($$1);
               return Optional.of($$1);
            } catch (avl | MinecraftClientException | IOException var3) {
               b.error("Failed to retrieve profile key pair", var3);
               this.a(null);
               return $$0;
            }
         }
      }, ac.f());
   }

   private Optional<cic> c() {
      if (Files.notExists(this.f)) {
         return Optional.empty();
      } else {
         try {
            Optional var2;
            try (BufferedReader $$0 = Files.newBufferedReader(this.f)) {
               var2 = cic.a.parse(JsonOps.INSTANCE, JsonParser.parseReader($$0)).result();
            }

            return var2;
         } catch (Exception var6) {
            b.error("Failed to read profile key pair file {}", this.f, var6);
            return Optional.empty();
         }
      }
   }

   private void a(@Nullable cic $$0) {
      try {
         Files.deleteIfExists(this.f);
      } catch (IOException var3) {
         b.error("Failed to delete profile key pair file {}", this.f, var3);
      }

      if ($$0 != null) {
         if (aa.aV) {
            cic.a.encodeStart(JsonOps.INSTANCE, $$0).result().ifPresent($$0x -> {
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

   private cic a(UserApiService $$0) throws avl, IOException {
      KeyPairResponse $$1 = $$0.getKeyPair();
      if ($$1 != null) {
         cid.a $$2 = a($$1);
         return new cic(avk.a($$1.keyPair().privateKey()), new cid($$2), Instant.parse($$1.refreshedAfter()));
      } else {
         throw new IOException("Could not retrieve profile key pair");
      }
   }

   private static cid.a a(KeyPairResponse $$0) throws avl {
      KeyPair $$1 = $$0.keyPair();
      if (!Strings.isNullOrEmpty($$1.publicKey()) && $$0.publicKeySignature() != null && $$0.publicKeySignature().array().length != 0) {
         try {
            Instant $$2 = Instant.parse($$0.expiresAt());
            PublicKey $$3 = avk.b($$1.publicKey());
            ByteBuffer $$4 = $$0.publicKeySignature();
            return new cid.a($$2, $$3, $$4.array());
         } catch (IllegalArgumentException | DateTimeException var5) {
            throw new avl(var5);
         }
      } else {
         throw new avl(new MissingException("Missing public key"));
      }
   }
}
