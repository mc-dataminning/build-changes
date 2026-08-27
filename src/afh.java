import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record afh(ur b, Optional<afh.b> c, Optional<afh.c> d, Optional<afh.a> e, boolean f) {
   public static final Codec<afh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ut.a.optionalFieldOf("description", uq.a).forGetter(afh::a),
               afh.b.a.optionalFieldOf("players").forGetter(afh::b),
               afh.c.a.optionalFieldOf("version").forGetter(afh::c),
               afh.a.a.optionalFieldOf("favicon").forGetter(afh::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(afh::e)
            )
            .apply($$0, afh::new)
   );

   public ur a() {
      return this.b;
   }

   public Optional<afh.b> b() {
      return this.c;
   }

   public Optional<afh.c> c() {
      return this.d;
   }

   public Optional<afh.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<afh.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new afh.a($$2));
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
         $$0 -> $$0.group(iv.b.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<afh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(afh.b::a),
                  Codec.INT.fieldOf("online").forGetter(afh.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(afh.b::c)
               )
               .apply($$0, afh.b::new)
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
      public static final Codec<afh.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(afh.c::b), Codec.INT.fieldOf("protocol").forGetter(afh.c::c)).apply($$0, afh.c::new)
      );

      public static afh.c a() {
         ad $$0 = aa.b();
         return new afh.c($$0.c(), $$0.e());
      }
   }
}
