import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcv(tx d, Optional<dcv.a> e, Optional<bsm> f) {
   public static final String a = "entity";
   public static final Codec<dcv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tx.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dcv.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bsm.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dcv::new)
   );
   public static final Codec<bon<dcv>> c = bon.a(b);

   public dcv() {
      this(new tx(), Optional.empty(), Optional.empty());
   }

   public dcv(tx d, Optional<dcv.a> e, Optional<bsm> f) {
      if (d.e("id")) {
         akk $$3 = akk.a(d.l("id"));
         if ($$3 != null) {
            d.a("id", $$3.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
      this.f = f;
   }

   public tx a() {
      return this.d;
   }

   public Optional<dcv.a> b() {
      return this.e;
   }

   public Optional<bsm> c() {
      return this.f;
   }

   public static record a(axw<Integer> b, axw<Integer> c) {
      private static final axw<Integer> d = new axw<>(0, 15);
      public static final Codec<dcv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dcv.a::new)
      );

      private static DataResult<axw<Integer>> a(axw<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<axw<Integer>> a(String $$0) {
         return axw.a.lenientOptionalFieldOf($$0, d).validate(dcv.a::a);
      }

      public boolean a(ja $$0, aqk $$1) {
         return this.b.a($$1.a(dcm.b, $$0)) && this.c.a($$1.a(dcm.a, $$0));
      }

      public axw<Integer> a() {
         return this.b;
      }

      public axw<Integer> b() {
         return this.c;
      }
   }
}
