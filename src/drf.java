import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drf extends dko {
   public static final MapCodec<drf> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dko::b), t()).apply($$0, drf::new));

   @Override
   public MapCodec<drf> a() {
      return e;
   }

   public drf(jo<bsw> $$0, float $$1, dur.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public drf(cyx $$0, dur.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dho.dV) || $$0.a(dho.dW) || $$0.a(dho.dX);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      ezq $$4 = this.a($$0, $$1, $$2, ezb.a());
      eyw $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lo.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if (!$$1.B && $$1.am() != brp.a) {
         if ($$3 instanceof bun $$4 && !$$4.b($$1.ak().r())) {
            $$4.a(new bsy(bta.t, 40));
         }
      }
   }
}
