import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnq extends dha {
   public static final MapCodec<dnq> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dha::b), u()).apply($$0, dnq::new));

   @Override
   public MapCodec<dnq> a() {
      return e;
   }

   public dnq(ix<bra> $$0, float $$1, dra.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dnq(cws $$0, dra.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dea.dV) || $$0.a(dea.dW) || $$0.a(dea.dX);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      evd $$4 = this.a($$0, $$1, $$2, eup.a());
      euk $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ky.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if (!$$1.B && $$1.ak() != bpr.a) {
         if ($$3 instanceof bso $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new brc(bre.t, 40));
         }
      }
   }
}
