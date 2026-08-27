import javax.annotation.Nullable;

public class cwu extends csq implements czr {
   public static final dfv a = dfu.j;
   public static final dfv b = dfu.C;
   protected static final eib c = ehy.a(csq.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), csq.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eib d = ehy.a(csq.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), csq.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   public cwu(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());

      for (hc $$2 : $$0.f()) {
         if ($$2.o() == hc.a.b) {
            dfe $$3 = this.n().a(a, Boolean.valueOf($$2 == hc.b));
            if ($$3.a((cpt)$$0.q(), $$0.a())) {
               return $$3.a(b, Boolean.valueOf($$1.a() == eai.c));
            }
         }
      }

      return null;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return $$0.c(a) ? d : c;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      hc $$3 = h($$0).g();
      return csq.a($$1, $$2.a($$3), $$3.g());
   }

   protected static hc h(dfe $$0) {
      return $$0.c(a) ? hc.a : hc.b;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(b) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
