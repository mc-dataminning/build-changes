import javax.annotation.Nullable;

public class cwf extends csq implements czr {
   private static final dfv b = dfu.C;
   protected static final eib a = csq.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   protected cwf(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(b) ? eai.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = super.a($$0);
      if ($$1 != null) {
         eah $$2 = $$0.q().b_($$0.a());
         return $$1.a(b, Boolean.valueOf($$2.a() == eai.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfe $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, hc.a);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return a;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$1 == hc.b && !this.a($$0, $$3, $$4)) {
         return csr.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eai.c, eai.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
