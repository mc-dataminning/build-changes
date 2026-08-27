import javax.annotation.Nullable;

public class crr extends cvi {
   public static final dfy a = cwj.aC;
   private static final eib b = csq.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eib c = csq.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eib d = csq.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eib e = csq.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eib f = csq.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eib g = csq.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eib h = csq.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eib i = ehy.a(b, c, d, e);
   private static final eib j = ehy.a(b, f, g, h);
   private static final ti k = ti.c("container.repair");
   private static final float l = 2.0F;
   private static final int m = 40;

   public crr(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.g().h());
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apj.aC);
         return bgt.b;
      }
   }

   @Nullable
   @Override
   public bgw b(dfe $$0, cpq $$1, gw $$2) {
      return new bhb(($$2x, $$3, $$4) -> new cei($$2x, $$3, cer.a($$1, $$2)), k);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      hc $$4 = $$0.c(a);
      return $$4.o() == hc.a.a ? i : j;
   }

   @Override
   protected void a(byh $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, dfe $$3, byh $$4) {
      if (!$$4.aS()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, byh $$2) {
      if (!$$2.aS()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bhj a(bil $$0) {
      return $$0.dL().b($$0);
   }

   @Nullable
   public static dfe e(dfe $$0) {
      if ($$0.a(csr.gS)) {
         return csr.gT.n().a(a, $$0.c(a));
      } else {
         return $$0.a(csr.gT) ? csr.gU.n().a(a, $$0.c(a)) : null;
      }
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   @Override
   public int d(dfe $$0, cow $$1, gw $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
