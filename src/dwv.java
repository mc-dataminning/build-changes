import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwv extends dps {
   public static final MapCodec<dwv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dps::c), t()).apply($$0, dwv::new));

   @Override
   public MapCodec<dwv> a() {
      return a;
   }

   public dwv(jf<bvk> $$0, float $$1, ean.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dwv(dcm $$0, ean.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dmo.em) || $$0.a(dmo.en) || $$0.a(dmo.eo);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      ffr $$4 = this.a($$0, $$1, $$2, ffc.a());
      fex $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ly.ah, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$1 instanceof arq $$5 && $$1.an() != bud.a && $$3 instanceof bxj $$6 && !$$6.a($$5, $$1.al().r())) {
         $$6.a(this.b());
      }
   }

   @Override
   public bvm b() {
      return new bvm(bvo.t, 40);
   }
}
