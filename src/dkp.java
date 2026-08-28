import com.mojang.serialization.MapCodec;

public class dkp extends dff implements dfi {
   public static final MapCodec<dkp> a = b(dkp::new);

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   protected dkp(dsg.d $$0) {
      super($$0);
   }

   private static boolean b(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.c();
      dsh $$4 = $$1.a_($$3);
      int $$5 = ens.a($$1, $$0, $$2, $$4, $$3, jf.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfh.dV.o());
      }
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      dsh $$4 = $$0.a_($$2);
      ja $$5 = $$2.c();
      due $$6 = $$0.l().g();
      jw<ear<?, ?>> $$7 = $$0.H_().d(lr.aH);
      if ($$4.a(dfh.ow)) {
         this.a($$7, rp.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dfh.on)) {
         this.a($$7, rp.j, $$0, $$6, $$1, $$5);
         this.a($$7, rp.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rp.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jw<ear<?, ?>> $$0, akj<ear<?, ?>> $$1, aqk $$2, due $$3, aym $$4, ja $$5) {
      $$0.b($$1).ifPresent($$4x -> ((ear)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dfi.a aq_() {
      return dfi.a.a;
   }
}
