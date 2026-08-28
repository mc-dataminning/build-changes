import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgx(jj<bvv> d, dgs e, dgs f, dgs g, dgs h) implements dhc {
   public static final MapCodec<dgx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.a(mh.W).fieldOf("to_apply").forGetter(dgx::b),
               dgs.b.fieldOf("min_duration").forGetter(dgx::c),
               dgs.b.fieldOf("max_duration").forGetter(dgx::d),
               dgs.b.fieldOf("min_amplifier").forGetter(dgx::e),
               dgs.b.fieldOf("max_amplifier").forGetter(dgx::f)
            )
            .apply($$0, dgx::new)
   );

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      if ($$3 instanceof bxu $$5) {
         azx $$6 = $$5.dY();
         Optional<jf<bvv>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azo.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azo.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bvx($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   public jj<bvv> b() {
      return this.d;
   }

   public dgs c() {
      return this.e;
   }

   public dgs d() {
      return this.f;
   }

   public dgs e() {
      return this.g;
   }

   public dgs f() {
      return this.h;
   }
}
