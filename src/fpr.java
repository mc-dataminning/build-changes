import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpr {
   private static final fpr a = new fpr("") {
      @Override
      public void a(esr $$0) {
      }

      @Override
      public void a(fpr.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fpr.b e;

   fpr(String $$0) {
      this.d = esr.N().p.toPath().resolve($$0);
   }

   public static fpr a(@Nullable String $$0) {
      return $$0 == null ? a : new fpr($$0);
   }

   public void a(fpr.c $$0, String $$1, String $$2) {
      this.e = new fpr.b($$0, $$1, $$2);
   }

   public void a(esr $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fpr.a $$2 = new fpr.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fpr.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
               try {
                  Files.createDirectories(this.d.getParent());
                  Files.writeString(this.d, c.toJson($$0xx));
               } catch (IOException var3x) {
                  b.error("Failed to write to quickplay log file {}", this.d, var3x);
               }
            });
         });
      } else {
         b.error("Failed to log session for quickplay. Missing world data or gamemode");
      }
   }

   static record a(fpr.b b, Instant c, crp d) {
      public static final Codec<fpr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fpr.b.a.forGetter(fpr.a::a), asq.m.fieldOf("lastPlayedTime").forGetter(fpr.a::b), crp.f.fieldOf("gamemode").forGetter(fpr.a::c))
               .apply($$0, fpr.a::new)
      );

      public fpr.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public crp c() {
         return this.d;
      }
   }

   static record b(fpr.c b, String c, String d) {
      public static final MapCodec<fpr.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fpr.c.d.fieldOf("type").forGetter(fpr.b::a), asq.o.fieldOf("id").forGetter(fpr.b::b), Codec.STRING.fieldOf("name").forGetter(fpr.b::c)
               )
               .apply($$0, fpr.b::new)
      );

      public fpr.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements aub {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fpr.c> d = aub.a(fpr.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
