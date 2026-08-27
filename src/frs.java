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

public class frs {
   private static final frs a = new frs("") {
      @Override
      public void a(euk $$0) {
      }

      @Override
      public void a(frs.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private frs.b e;

   frs(String $$0) {
      this.d = euk.N().p.toPath().resolve($$0);
   }

   public static frs a(@Nullable String $$0) {
      return $$0 == null ? a : new frs($$0);
   }

   public void a(frs.c $$0, String $$1, String $$2) {
      this.e = new frs.b($$0, $$1, $$2);
   }

   public void a(euk $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            frs.a $$2 = new frs.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(frs.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(frs.b b, Instant c, csv d) {
      public static final Codec<frs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frs.b.a.forGetter(frs.a::a), atg.m.fieldOf("lastPlayedTime").forGetter(frs.a::b), csv.f.fieldOf("gamemode").forGetter(frs.a::c))
               .apply($$0, frs.a::new)
      );

      public frs.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public csv c() {
         return this.d;
      }
   }

   static record b(frs.c b, String c, String d) {
      public static final MapCodec<frs.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  frs.c.d.fieldOf("type").forGetter(frs.b::a), atg.o.fieldOf("id").forGetter(frs.b::b), Codec.STRING.fieldOf("name").forGetter(frs.b::c)
               )
               .apply($$0, frs.b::new)
      );

      public frs.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements aut {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<frs.c> d = aut.a(frs.c::values);
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
