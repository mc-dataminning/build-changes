import javax.annotation.Nullable;

public class cwt extends csq implements czr {
   public static final dfy a = cwj.aC;
   public static final dfv b = dfu.C;
   protected static final float c = 3.0F;
   protected static final eib d = csq.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eib e = csq.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eib f = csq.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eib g = csq.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   protected cwt(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      switch ((hc)$$0.c(a)) {
         case c:
            return g;
         case d:
            return f;
         case e:
            return e;
         case f:
         default:
            return d;
      }
   }

   private boolean a(cow $$0, gw $$1, hc $$2) {
      dfe $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return csr.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eai.c, eai.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      if (!$$0.c()) {
         dfe $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(a) == $$0.k()) {
            return null;
         }
      }

      dfe $$2 = this.n();
      cpt $$3 = $$0.q();
      gw $$4 = $$0.a();
      eah $$5 = $$0.q().b_($$0.a());

      for (hc $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(a, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(b, Boolean.valueOf($$5.a() == eai.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(b) ? eai.c.a(false) : super.c_($$0);
   }
}
