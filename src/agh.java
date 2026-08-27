import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record agh(vf b, Optional<agh.b> c, Optional<agh.c> d, Optional<agh.a> e, boolean f) {
   public static final Codec<agh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vh.a.optionalFieldOf("description", ve.a).forGetter(agh::a),
               agh.b.a.optionalFieldOf("players").forGetter(agh::b),
               agh.c.a.optionalFieldOf("version").forGetter(agh::c),
               agh.a.a.optionalFieldOf("favicon").forGetter(agh::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(agh::e)
            )
            .apply($$0, agh::new)
   );

   public vf a() {
      return this.b;
   }

   public Optional<agh.b> b() {
      return this.c;
   }

   public Optional<agh.c> c() {
      return this.d;
   }

   public Optional<agh.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<agh.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new agh.a($$2));
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
         $$0 -> $$0.group(ja.c.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<agh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(agh.b::a),
                  Codec.INT.fieldOf("online").forGetter(agh.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(agh.b::c)
               )
               .apply($$0, agh.b::new)
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
      public static final Codec<agh.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(agh.c::b), Codec.INT.fieldOf("protocol").forGetter(agh.c::c)).apply($$0, agh.c::new)
      );

      public static agh.c a() {
         ad $$0 = aa.b();
         return new agh.c($$0.c(), $$0.e());
      }
   }
}
