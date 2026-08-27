public abstract class csn extends csx implements czy {
   protected static final eii a = csx.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final eii b = csx.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dgc c = dgb.C;
   private final boolean d;

   public static boolean a(cpx $$0, gw $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dfl $$0) {
      return $$0.a(apu.N) && $$0.b() instanceof csn;
   }

   protected csn(boolean $$0, dfk.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public boolean a() {
      return this.d;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      dgp $$4 = $$0.a(this) ? $$0.c(this.b()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dfl a(dfl $$0, cpx $$1, gw $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dgp $$6 = $$0.c(this.b());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(gw $$0, cpx $$1, dgp $$2) {
      if (!c($$1, $$0.d())) {
         return true;
      } else {
         switch ($$2) {
            case c:
               return !c($$1, $$0.h());
            case d:
               return !c($$1, $$0.g());
            case e:
               return !c($$1, $$0.e());
            case f:
               return !c($$1, $$0.f());
            default:
               return false;
         }
      }
   }

   protected void a(dfl $$0, cpx $$1, gw $$2, csx $$3) {
   }

   protected dfl a(cpx $$0, gw $$1, dfl $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dgp $$4 = $$2.c(this.b());
         return new cyw($$0, $$1, $$2).a($$0.B($$1), $$3, $$4).c();
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$4) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(this.b()).b()) {
            $$1.a($$2.c(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.d(), this);
         }
      }
   }

   @Override
   public dfl a(clp $$0) {
      eao $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eap.c;
      dfl $$3 = super.n();
      hc $$4 = $$0.g();
      boolean $$5 = $$4 == hc.f || $$4 == hc.e;
      return $$3.a(this.b(), $$5 ? dgp.b : dgp.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dgo<dgp> b();

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(c) ? eap.c.a(false) : super.c_($$0);
   }
}
