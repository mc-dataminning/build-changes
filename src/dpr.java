import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpr extends dja {
   public static final MapCodec<dpr> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dja::b), u()).apply($$0, dpr::new));

   @Override
   public MapCodec<dpr> a() {
      return e;
   }

   public dpr(jm<brx> $$0, float $$1, dtb.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dpr(cxw $$0, dtb.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dga.dV) || $$0.a(dga.dW) || $$0.a(dga.dX);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      exv $$4 = this.a($$0, $$1, $$2, exh.a());
      exc $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lm.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if (!$$1.B && $$1.al() != bqo.a) {
         if ($$3 instanceof btn $$4 && !$$4.b($$1.aj().q())) {
            $$4.b(new brz(bsb.t, 40));
         }
      }
   }
}
