import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpa extends dik {
   public static final MapCodec<dpa> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dik::b), u()).apply($$0, dpa::new));

   @Override
   public MapCodec<dpa> a() {
      return e;
   }

   public dpa(jj<brn> $$0, float $$1, dsk.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dpa(cxg $$0, dsk.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfk.dV) || $$0.a(dfk.dW) || $$0.a(dfk.dX);
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      exa $$4 = this.a($$0, $$1, $$2, ewm.a());
      ewh $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lj.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if (!$$1.B && $$1.al() != bqe.a) {
         if ($$3 instanceof btc $$4 && !$$4.b($$1.aj().q())) {
            $$4.b(new brp(brr.t, 40));
         }
      }
   }
}
