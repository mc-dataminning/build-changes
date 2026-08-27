import javax.annotation.Nullable;

public class csb extends csq implements czr {
   public static final dfv c = dfu.C;
   private static final eib a = csq.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected csb(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Boolean.valueOf(true)));
   }

   protected void a(dfe $$0, cpr $$1, gw $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.y_().a(40));
      }
   }

   protected static boolean e(dfe $$0, cow $$1, gw $$2) {
      if ($$0.c(c)) {
         return true;
      } else {
         for (hc $$3 : hc.values()) {
            if ($$1.b_($$2.a($$3)).a(apt.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, Boolean.valueOf($$1.a(apt.a) && $$1.e() == 8));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return a;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return $$1 == hc.a && !this.a($$0, (cpt)$$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hc.b);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(c);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(c) ? eai.c.a(false) : super.c_($$0);
   }
}
