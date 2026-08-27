import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czx(to d, Optional<czx.a> e) {
   public static final String a = "entity";
   public static final Codec<czx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(to.a.fieldOf("entity").forGetter($$0x -> $$0x.d), czx.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, czx::new)
   );
   public static final Codec<bmp<czx>> c = bmp.a(b);

   public czx() {
      this(new to(), Optional.empty());
   }

   public czx(to d, Optional<czx.a> e) {
      if (d.e("id")) {
         ajv $$2 = ajv.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public to a() {
      return this.d;
   }

   public Optional<czx.a> b() {
      return this.e;
   }

   public to c() {
      return this.d;
   }

   public Optional<czx.a> d() {
      return this.e;
   }

   public static record a(axe<Integer> b, axe<Integer> c) {
      private static final axe<Integer> d = new axe<>(0, 15);
      public static final Codec<czx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, czx.a::new)
      );

      private static DataResult<axe<Integer>> a(axe<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<axe<Integer>> a(String $$0) {
         return awu.a(axe.a.optionalFieldOf($$0, d), czx.a::a);
      }

      public boolean a(id $$0, apu $$1) {
         return this.b.a($$1.a(czp.b, $$0)) && this.c.a($$1.a(czp.a, $$0));
      }

      public axe<Integer> a() {
         return this.b;
      }

      public axe<Integer> b() {
         return this.c;
      }
   }
}
