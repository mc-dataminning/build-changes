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

public class fsr {
   private static final fsr a = new fsr("") {
      @Override
      public void a(evi $$0) {
      }

      @Override
      public void a(fsr.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fsr.b e;

   fsr(String $$0) {
      this.d = evi.O().p.toPath().resolve($$0);
   }

   public static fsr a(@Nullable String $$0) {
      return $$0 == null ? a : new fsr($$0);
   }

   public void a(fsr.c $$0, String $$1, String $$2) {
      this.e = new fsr.b($$0, $$1, $$2);
   }

   public void a(evi $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fsr.a $$2 = new fsr.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fsr.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fsr.b b, Instant c, ctm d) {
      public static final Codec<fsr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fsr.b.a.forGetter(fsr.a::a), atw.m.fieldOf("lastPlayedTime").forGetter(fsr.a::b), ctm.f.fieldOf("gamemode").forGetter(fsr.a::c))
               .apply($$0, fsr.a::new)
      );

      public fsr.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public ctm c() {
         return this.d;
      }
   }

   static record b(fsr.c b, String c, String d) {
      public static final MapCodec<fsr.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fsr.c.d.fieldOf("type").forGetter(fsr.b::a), atw.o.fieldOf("id").forGetter(fsr.b::b), Codec.STRING.fieldOf("name").forGetter(fsr.b::c)
               )
               .apply($$0, fsr.b::new)
      );

      public fsr.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements avk {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fsr.c> d = avk.a(fsr.c::values);
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
