import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpl extends dii {
   public static final MapCodec<dpl> g = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dii::getSuspiciousEffects), u()).apply($$0, dpl::new));

   @Override
   public MapCodec<dpl> a() {
      return g;
   }

   public dpl(ja<brf> $$0, float $$1, dtb.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dpl(cxv $$0, dtb.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfe.eJ) || $$0.a(dfe.eK) || $$0.a(dfe.eL);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      exn $$4 = this.a($$0, $$1, $$2, ewz.a());
      ewu $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lb.ac, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (!$$1.C && $$1.al() != bpx.a) {
         if ($$3 instanceof bso $$4 && !$$4.b($$1.aj().r())) {
            $$4.b(new brh(brj.t, 40));
         }
      }
   }
}
