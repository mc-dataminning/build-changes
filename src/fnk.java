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

public class fnk {
   private static final fnk a = new fnk("") {
      @Override
      public void a(eqp $$0) {
      }

      @Override
      public void a(fnk.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fnk.b e;

   fnk(String $$0) {
      this.d = eqp.O().p.toPath().resolve($$0);
   }

   public static fnk a(@Nullable String $$0) {
      return $$0 == null ? a : new fnk($$0);
   }

   public void a(fnk.c $$0, String $$1, String $$2) {
      this.e = new fnk.b($$0, $$1, $$2);
   }

   public void a(eqp $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fnk.a $$2 = new fnk.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fnk.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fnk.b b, Instant c, cpy d) {
      public static final Codec<fnk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fnk.b.a.forGetter(fnk.a::a), arj.m.fieldOf("lastPlayedTime").forGetter(fnk.a::b), cpy.f.fieldOf("gamemode").forGetter(fnk.a::c))
               .apply($$0, fnk.a::new)
      );

      public fnk.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cpy c() {
         return this.d;
      }
   }

   static record b(fnk.c b, String c, String d) {
      public static final MapCodec<fnk.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fnk.c.d.fieldOf("type").forGetter(fnk.b::a), arj.o.fieldOf("id").forGetter(fnk.b::b), Codec.STRING.fieldOf("name").forGetter(fnk.b::c)
               )
               .apply($$0, fnk.b::new)
      );

      public fnk.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements asu {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fnk.c> d = asu.a(fnk.c::values);
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
