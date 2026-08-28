import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxa extends dpx {
   public static final MapCodec<dxa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dpx::c), t()).apply($$0, dxa::new));

   @Override
   public MapCodec<dxa> a() {
      return a;
   }

   public dxa(jf<bvk> $$0, float $$1, eas.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dxa(dcp $$0, eas.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dmt.em) || $$0.a(dmt.en) || $$0.a(dmt.eo);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      ffw $$4 = this.a($$0, $$1, $$2, ffh.a());
      ffc $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ly.ah, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$1 instanceof arq $$5 && $$1.an() != bud.a && $$3 instanceof bxj $$6 && !$$6.a($$5, $$1.al().r())) {
         $$6.a(this.b());
      }
   }

   @Override
   public bvm b() {
      return new bvm(bvo.t, 40);
   }
}
