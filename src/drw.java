import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drw extends dlf {
   public static final MapCodec<drw> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dlf::b), t()).apply($$0, drw::new));

   @Override
   public MapCodec<drw> a() {
      return e;
   }

   public drw(jq<bth> $$0, float $$1, dvi.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public drw(czc $$0, dvi.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dig.dV) || $$0.a(dig.dW) || $$0.a(dig.dX);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      fah $$4 = this.a($$0, $$1, $$2, ezs.a());
      ezn $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lr.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if (!$$1.C && $$1.ak() != bsa.a) {
         if ($$3 instanceof bva $$4 && !$$4.b($$1.ai().r())) {
            $$4.a(new btj(btl.t, 40));
         }
      }
   }
}
