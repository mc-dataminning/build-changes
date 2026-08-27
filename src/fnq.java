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

public class fnq {
   private static final fnq a = new fnq("") {
      @Override
      public void a(eqx $$0) {
      }

      @Override
      public void a(fnq.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fnq.b e;

   fnq(String $$0) {
      this.d = eqx.O().p.toPath().resolve($$0);
   }

   public static fnq a(@Nullable String $$0) {
      return $$0 == null ? a : new fnq($$0);
   }

   public void a(fnq.c $$0, String $$1, String $$2) {
      this.e = new fnq.b($$0, $$1, $$2);
   }

   public void a(eqx $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fnq.a $$2 = new fnq.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fnq.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fnq.b b, Instant c, cpu d) {
      public static final Codec<fnq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fnq.b.a.forGetter(fnq.a::a), arh.m.fieldOf("lastPlayedTime").forGetter(fnq.a::b), cpu.f.fieldOf("gamemode").forGetter(fnq.a::c))
               .apply($$0, fnq.a::new)
      );

      public fnq.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cpu c() {
         return this.d;
      }
   }

   static record b(fnq.c b, String c, String d) {
      public static final MapCodec<fnq.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fnq.c.d.fieldOf("type").forGetter(fnq.b::a), arh.o.fieldOf("id").forGetter(fnq.b::b), Codec.STRING.fieldOf("name").forGetter(fnq.b::c)
               )
               .apply($$0, fnq.b::new)
      );

      public fnq.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements asr {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fnq.c> d = asr.a(fnq.c::values);
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
