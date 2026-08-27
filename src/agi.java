import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record agi(vg b, Optional<agi.b> c, Optional<agi.c> d, Optional<agi.a> e, boolean f) {
   public static final Codec<agi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vi.a.optionalFieldOf("description", vf.a).forGetter(agi::a),
               agi.b.a.optionalFieldOf("players").forGetter(agi::b),
               agi.c.a.optionalFieldOf("version").forGetter(agi::c),
               agi.a.a.optionalFieldOf("favicon").forGetter(agi::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(agi::e)
            )
            .apply($$0, agi::new)
   );

   public vg a() {
      return this.b;
   }

   public Optional<agi.b> b() {
      return this.c;
   }

   public Optional<agi.c> c() {
      return this.d;
   }

   public Optional<agi.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<agi.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new agi.a($$2));
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
      public static final Codec<agi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(agi.b::a),
                  Codec.INT.fieldOf("online").forGetter(agi.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(agi.b::c)
               )
               .apply($$0, agi.b::new)
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
      public static final Codec<agi.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(agi.c::b), Codec.INT.fieldOf("protocol").forGetter(agi.c::c)).apply($$0, agi.c::new)
      );

      public static agi.c a() {
         ad $$0 = aa.b();
         return new agi.c($$0.c(), $$0.e());
      }
   }
}
