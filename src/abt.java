import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record abt(sw b, Optional<abt.b> c, Optional<abt.c> d, Optional<abt.a> e, boolean f) {
   public static final Codec<abt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aoi.b.optionalFieldOf("description", sv.a).forGetter(abt::a),
               abt.b.a.optionalFieldOf("players").forGetter(abt::b),
               abt.c.a.optionalFieldOf("version").forGetter(abt::c),
               abt.a.a.optionalFieldOf("favicon").forGetter(abt::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(abt::e)
            )
            .apply($$0, abt::new)
   );

   public sw a() {
      return this.b;
   }

   public Optional<abt.b> b() {
      return this.c;
   }

   public Optional<abt.c> c() {
      return this.d;
   }

   public Optional<abt.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<abt.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new abt.a($$2));
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
         $$0 -> $$0.group(hy.b.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<abt.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(abt.b::a),
                  Codec.INT.fieldOf("online").forGetter(abt.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(abt.b::c)
               )
               .apply($$0, abt.b::new)
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
      public static final Codec<abt.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(abt.c::b), Codec.INT.fieldOf("protocol").forGetter(abt.c::c)).apply($$0, abt.c::new)
      );

      public static abt.c a() {
         ad $$0 = aa.b();
         return new abt.c($$0.c(), $$0.e());
      }
   }
}
