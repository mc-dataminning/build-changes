public abstract class csb extends csl implements czm {
   protected static final ehw a = csl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final ehw b = csl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dfq c = dfp.C;
   private final boolean d;

   public static boolean a(cpl $$0, gu $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dez $$0) {
      return $$0.a(apl.N) && $$0.b() instanceof csb;
   }

   protected csb(boolean $$0, dey.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public boolean a() {
      return this.d;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      dgd $$4 = $$0.a(this) ? $$0.c(this.b()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dez a(dez $$0, cpl $$1, gu $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dgd $$6 = $$0.c(this.b());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(gu $$0, cpl $$1, dgd $$2) {
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

   protected void a(dez $$0, cpl $$1, gu $$2, csl $$3) {
   }

   protected dez a(cpl $$0, gu $$1, dez $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dgd $$4 = $$2.c(this.b());
         return new cyk($$0, $$1, $$2).a($$0.B($$1), $$3, $$4).c();
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
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
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ead.c;
      dez $$3 = super.n();
      ha $$4 = $$0.g();
      boolean $$5 = $$4 == ha.f || $$4 == ha.e;
      return $$3.a(this.b(), $$5 ? dgd.b : dgd.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dgc<dgd> b();

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(c) ? ead.c.a(false) : super.c_($$0);
   }
}
