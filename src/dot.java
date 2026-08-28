import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dot extends did {
   public static final MapCodec<dot> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(did::b), u()).apply($$0, dot::new));

   @Override
   public MapCodec<dot> a() {
      return e;
   }

   public dot(ji<bsc> $$0, float $$1, dsd.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dot(cxv $$0, dsd.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfd.dV) || $$0.a(dfd.dW) || $$0.a(dfd.dX);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      ewm $$4 = this.a($$0, $$1, $$2, evy.a());
      evt $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(li.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if (!$$1.B && $$1.al() != bqt.a) {
         if ($$3 instanceof btr $$4 && !$$4.b($$1.aj().p())) {
            $$4.b(new bse(bsg.t, 40));
         }
      }
   }
}
