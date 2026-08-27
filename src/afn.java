import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record afn(uv b, Optional<afn.b> c, Optional<afn.c> d, Optional<afn.a> e, boolean f) {
   public static final Codec<afn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ux.a.optionalFieldOf("description", uu.a).forGetter(afn::a),
               afn.b.a.optionalFieldOf("players").forGetter(afn::b),
               afn.c.a.optionalFieldOf("version").forGetter(afn::c),
               afn.a.a.optionalFieldOf("favicon").forGetter(afn::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(afn::e)
            )
            .apply($$0, afn::new)
   );

   public uv a() {
      return this.b;
   }

   public Optional<afn.b> b() {
      return this.c;
   }

   public Optional<afn.c> c() {
      return this.d;
   }

   public Optional<afn.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<afn.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new afn.a($$2));
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
         $$0 -> $$0.group(iz.b.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<afn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(afn.b::a),
                  Codec.INT.fieldOf("online").forGetter(afn.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(afn.b::c)
               )
               .apply($$0, afn.b::new)
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
      public static final Codec<afn.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(afn.c::b), Codec.INT.fieldOf("protocol").forGetter(afn.c::c)).apply($$0, afn.c::new)
      );

      public static afn.c a() {
         ad $$0 = aa.b();
         return new afn.c($$0.c(), $$0.e());
      }
   }
}
