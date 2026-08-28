import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doq extends dia {
   public static final MapCodec<doq> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dia::b), u()).apply($$0, doq::new));

   @Override
   public MapCodec<doq> a() {
      return e;
   }

   public doq(ji<brz> $$0, float $$1, dsa.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public doq(cxs $$0, dsa.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfa.dV) || $$0.a(dfa.dW) || $$0.a(dfa.dX);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      ewj $$4 = this.a($$0, $$1, $$2, evv.a());
      evq $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(li.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if (!$$1.B && $$1.al() != bqq.a) {
         if ($$3 instanceof bto $$4 && !$$4.b($$1.aj().p())) {
            $$4.b(new bsb(bsd.t, 40));
         }
      }
   }
}
