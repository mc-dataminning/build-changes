import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dox extends dih {
   public static final MapCodec<dox> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dih::b), u()).apply($$0, dox::new));

   @Override
   public MapCodec<dox> a() {
      return e;
   }

   public dox(jj<brj> $$0, float $$1, dsg.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dox(cxd $$0, dsg.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfh.dV) || $$0.a(dfh.dW) || $$0.a(dfh.dX);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      ews $$4 = this.a($$0, $$1, $$2, ewe.a());
      evz $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lj.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if (!$$1.B && $$1.al() != bqa.a) {
         if ($$3 instanceof bsy $$4 && !$$4.b($$1.aj().q())) {
            $$4.b(new brl(brn.t, 40));
         }
      }
   }
}
