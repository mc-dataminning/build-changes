import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dor extends dib {
   public static final MapCodec<dor> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dib::b), u()).apply($$0, dor::new));

   @Override
   public MapCodec<dor> a() {
      return e;
   }

   public dor(ji<bsa> $$0, float $$1, dsb.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dor(cxt $$0, dsb.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfb.dV) || $$0.a(dfb.dW) || $$0.a(dfb.dX);
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      ewk $$4 = this.a($$0, $$1, $$2, evw.a());
      evr $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(li.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if (!$$1.B && $$1.al() != bqr.a) {
         if ($$3 instanceof btp $$4 && !$$4.b($$1.aj().p())) {
            $$4.b(new bsc(bse.t, 40));
         }
      }
   }
}
