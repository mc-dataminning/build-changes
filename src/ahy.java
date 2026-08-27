import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ahy(vq b, Optional<ahy.b> c, Optional<ahy.c> d, Optional<ahy.a> e, boolean f) {
   public static final Codec<ahy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vs.a.optionalFieldOf("description", vp.a).forGetter(ahy::a),
               ahy.b.a.optionalFieldOf("players").forGetter(ahy::b),
               ahy.c.a.optionalFieldOf("version").forGetter(ahy::c),
               ahy.a.a.optionalFieldOf("favicon").forGetter(ahy::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(ahy::e)
            )
            .apply($$0, ahy::new)
   );

   public vq a() {
      return this.b;
   }

   public Optional<ahy.b> b() {
      return this.c;
   }

   public Optional<ahy.c> c() {
      return this.d;
   }

   public Optional<ahy.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ahy.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ahy.a($$2));
            } catch (IllegalArgumentException var3) {
               return DataResult.error(() -> "Malformed base64 server icon");
            }
         }
      }, $$0 -> "data:image/png;base64," + new String(Base64.getEncoder().encode($$0.b), StandardCharsets.UTF_8));

      public byte[] a() {
         return this.b;
      }
   }

   public static record b(int b, int c, List<GameProfile> d) {
      private static final Codec<GameProfile> e = RecordCodecBuilder.create(
         $$0 -> $$0.group(jc.c.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<ahy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ahy.b::a),
                  Codec.INT.fieldOf("online").forGetter(ahy.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(ahy.b::c)
               )
               .apply($$0, ahy.b::new)
      );

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public List<GameProfile> c() {
         return this.d;
      }
   }

   public static record c(String b, int c) {
      public static final Codec<ahy.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ahy.c::b), Codec.INT.fieldOf("protocol").forGetter(ahy.c::c)).apply($$0, ahy.c::new)
      );

      public static ahy.c a() {
         ad $$0 = aa.b();
         return new ahy.c($$0.c(), $$0.e());
      }
   }
}
