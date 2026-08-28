import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doz extends dij {
   public static final MapCodec<doz> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dij::b), u()).apply($$0, doz::new));

   @Override
   public MapCodec<doz> a() {
      return e;
   }

   public doz(jj<brm> $$0, float $$1, dsj.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public doz(cxf $$0, dsj.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfj.dV) || $$0.a(dfj.dW) || $$0.a(dfj.dX);
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      ewy $$4 = this.a($$0, $$1, $$2, ewk.a());
      ewf $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lj.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if (!$$1.B && $$1.al() != bqd.a) {
         if ($$3 instanceof btb $$4 && !$$4.b($$1.aj().q())) {
            $$4.b(new bro(brq.t, 40));
         }
      }
   }
}
