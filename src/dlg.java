import com.mojang.serialization.MapCodec;

public class dlg extends dfw implements dfz {
   public static final MapCodec<dlg> a = b(dlg::new);

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   protected dlg(dsz.d $$0) {
      super($$0);
   }

   private static boolean b(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.c();
      dta $$4 = $$1.a_($$3);
      int $$5 = eop.a($$1, $$0, $$2, $$4, $$3, ji.b, $$4.b($$1, $$3));
      return $$5 < $$1.Q();
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfy.dV.o());
      }
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      dta $$4 = $$0.a_($$2);
      jd $$5 = $$2.c();
      dux $$6 = $$0.l().g();
      jz<ebn<?, ?>> $$7 = $$0.H_().d(lu.aI);
      if ($$4.a(dfy.ow)) {
         this.a($$7, rs.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dfy.on)) {
         this.a($$7, rs.j, $$0, $$6, $$1, $$5);
         this.a($$7, rs.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rs.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jz<ebn<?, ?>> $$0, akp<ebn<?, ?>> $$1, aqt $$2, dux $$3, ayv $$4, jd $$5) {
      $$0.b($$1).ifPresent($$4x -> ((ebn)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dfz.a aq_() {
      return dfz.a.a;
   }
}
