import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpp extends diy {
   public static final MapCodec<dpp> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(diy::b), u()).apply($$0, dpp::new));

   @Override
   public MapCodec<dpp> a() {
      return e;
   }

   public dpp(jm<brw> $$0, float $$1, dsz.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dpp(cxu $$0, dsz.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfy.dV) || $$0.a(dfy.dW) || $$0.a(dfy.dX);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      exp $$4 = this.a($$0, $$1, $$2, exb.a());
      eww $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lm.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if (!$$1.B && $$1.al() != bqn.a) {
         if ($$3 instanceof btl $$4 && !$$4.b($$1.aj().q())) {
            $$4.b(new bry(bsa.t, 40));
         }
      }
   }
}
