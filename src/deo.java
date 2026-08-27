import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class deo extends cyc {
   public static final MapCodec<deo> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(cyc::b), u()).apply($$0, deo::new));

   @Override
   public MapCodec<deo> a() {
      return e;
   }

   public deo(bkb $$0, int $$1, dhh.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public deo(List<ddb.a> $$0, dhh.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cvc.dV) || $$0.a(cvc.dW) || $$0.a(cvc.dX);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      ekn $$4 = this.a($$0, $$1, $$2, ejz.a());
      eju $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(js.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if (!$$1.B && $$1.aj() != biu.a) {
         if ($$3 instanceof blg $$4 && !$$4.b($$1.ah().p())) {
            $$4.b(new bkd(bkf.t, 40));
         }
      }
   }
}
