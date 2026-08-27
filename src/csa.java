public abstract class csa extends csk implements czl {
   protected static final ehy a = csk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final ehy b = csk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dfp c = dfo.C;
   private final boolean d;

   public static boolean a(cpk $$0, gv $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dey $$0) {
      return $$0.a(apj.N) && $$0.b() instanceof csa;
   }

   protected csa(boolean $$0, dex.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public boolean a() {
      return this.d;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      dgc $$4 = $$0.a(this) ? $$0.c(this.b()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dey a(dey $$0, cpk $$1, gv $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dgc $$6 = $$0.c(this.b());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(gv $$0, cpk $$1, dgc $$2) {
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

   protected void a(dey $$0, cpk $$1, gv $$2, csk $$3) {
   }

   protected dey a(cpk $$0, gv $$1, dey $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dgc $$4 = $$2.c(this.b());
         return new cyj($$0, $$1, $$2).a($$0.B($$1), $$3, $$4).c();
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
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
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eac.c;
      dey $$3 = super.n();
      hb $$4 = $$0.g();
      boolean $$5 = $$4 == hb.f || $$4 == hb.e;
      return $$3.a(this.b(), $$5 ? dgc.b : dgc.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dgb<dgc> b();

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(c) ? eac.c.a(false) : super.c_($$0);
   }
}
