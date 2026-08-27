import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ajg(wu b, Optional<ajg.b> c, Optional<ajg.c> d, Optional<ajg.a> e, boolean f) {
   public static final Codec<ajg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ww.a.optionalFieldOf("description", wt.a).forGetter(ajg::a),
               ajg.b.a.optionalFieldOf("players").forGetter(ajg::b),
               ajg.c.a.optionalFieldOf("version").forGetter(ajg::c),
               ajg.a.a.optionalFieldOf("favicon").forGetter(ajg::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(ajg::e)
            )
            .apply($$0, ajg::new)
   );

   public wu a() {
      return this.b;
   }

   public Optional<ajg.b> b() {
      return this.c;
   }

   public Optional<ajg.c> c() {
      return this.d;
   }

   public Optional<ajg.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ajg.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ajg.a($$2));
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
         $$0 -> $$0.group(jq.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<ajg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ajg.b::a),
                  Codec.INT.fieldOf("online").forGetter(ajg.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(ajg.b::c)
               )
               .apply($$0, ajg.b::new)
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
      public static final Codec<ajg.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ajg.c::b), Codec.INT.fieldOf("protocol").forGetter(ajg.c::c)).apply($$0, ajg.c::new)
      );

      public static ajg.c a() {
         ad $$0 = aa.b();
         return new ajg.c($$0.c(), $$0.e());
      }
   }
}
