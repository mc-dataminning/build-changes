import com.mojang.serialization.MapCodec;

public class dkr extends dfc implements dff {
   public static final MapCodec<dkr> a = b(dkr::new);

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   protected dkr(dtb.d $$0) {
      super($$0);
   }

   private static boolean b(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.c();
      dtc $$4 = $$1.a_($$3);
      int $$5 = eov.a($$1, $$0, $$2, $$4, $$3, iw.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfe.eJ.n());
      }
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      dtc $$4 = $$0.a_($$2);
      ir $$5 = $$2.c();
      duz $$6 = $$0.l().g();
      jn<ebm<?, ?>> $$7 = $$0.I_().d(li.aC);
      if ($$4.a(dfe.pw)) {
         this.a($$7, sc.k, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dfe.pn)) {
         this.a($$7, sc.m, $$0, $$6, $$1, $$5);
         this.a($$7, sc.o, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sc.s, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jn<ebm<?, ?>> $$0, aks<ebm<?, ?>> $$1, aqt $$2, duz $$3, ayt $$4, ir $$5) {
      $$0.b($$1).ifPresent($$4x -> ((ebm)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dff.a aq_() {
      return dff.a.a;
   }
}
