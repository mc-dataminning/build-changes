import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmn extends dfx {
   public static final MapCodec<dmn> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dfx::b), u()).apply($$0, dmn::new));

   @Override
   public MapCodec<dmn> a() {
      return e;
   }

   public dmn(iv<bpv> $$0, float $$1, dpx.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dmn(cvf $$0, dpx.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dcx.dV) || $$0.a(dcx.dW) || $$0.a(dcx.dX);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      ety $$4 = this.a($$0, $$1, $$2, etk.a());
      etf $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(kw.ab, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if (!$$1.B && $$1.ak() != bon.a) {
         if ($$3 instanceof bre $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new bpx(bpz.t, 40));
         }
      }
   }
}
