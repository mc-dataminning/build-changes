import com.mojang.serialization.MapCodec;

public class dkr extends dfh implements dfk {
   public static final MapCodec<dkr> a = b(dkr::new);

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   protected dkr(dsj.d $$0) {
      super($$0);
   }

   private static boolean b(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.c();
      dsk $$4 = $$1.a_($$3);
      int $$5 = eny.a($$1, $$0, $$2, $$4, $$3, jf.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfj.dV.o());
      }
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      dsk $$4 = $$0.a_($$2);
      ja $$5 = $$2.c();
      duh $$6 = $$0.l().g();
      jw<eax<?, ?>> $$7 = $$0.H_().d(lr.aH);
      if ($$4.a(dfj.ow)) {
         this.a($$7, rp.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dfj.on)) {
         this.a($$7, rp.j, $$0, $$6, $$1, $$5);
         this.a($$7, rp.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rp.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jw<eax<?, ?>> $$0, akj<eax<?, ?>> $$1, aqm $$2, duh $$3, ayo $$4, ja $$5) {
      $$0.b($$1).ifPresent($$4x -> ((eax)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dfk.a aq_() {
      return dfk.a.a;
   }
}
