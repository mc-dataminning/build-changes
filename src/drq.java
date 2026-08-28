import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drq extends dkz {
   public static final MapCodec<drq> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dkz::b), t()).apply($$0, drq::new));

   @Override
   public MapCodec<drq> a() {
      return e;
   }

   public drq(jp<btc> $$0, float $$1, dvc.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public drq(cyw $$0, dvc.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dia.dV) || $$0.a(dia.dW) || $$0.a(dia.dX);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      fab $$4 = this.a($$0, $$1, $$2, ezm.a());
      ezh $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lq.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (!$$1.C && $$1.am() != brv.a) {
         if ($$3 instanceof buv $$4 && !$$4.b($$1.ak().r())) {
            $$4.a(new bte(btg.t, 40));
         }
      }
   }
}
