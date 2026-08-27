public abstract class csl extends csv implements czw {
   protected static final eig a = csv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final eig b = csv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dga c = dfz.C;
   private final boolean d;

   public static boolean a(cpv $$0, gw $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dfj $$0) {
      return $$0.a(aps.N) && $$0.b() instanceof csl;
   }

   protected csl(boolean $$0, dfi.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public boolean a() {
      return this.d;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      dgn $$4 = $$0.a(this) ? $$0.c(this.b()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dfj a(dfj $$0, cpv $$1, gw $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dgn $$6 = $$0.c(this.b());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(gw $$0, cpv $$1, dgn $$2) {
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

   protected void a(dfj $$0, cpv $$1, gw $$2, csv $$3) {
   }

   protected dfj a(cpv $$0, gw $$1, dfj $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dgn $$4 = $$2.c(this.b());
         return new cyu($$0, $$1, $$2).a($$0.B($$1), $$3, $$4).c();
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
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
   public dfj a(cln $$0) {
      eam $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ean.c;
      dfj $$3 = super.n();
      ha $$4 = $$0.g();
      boolean $$5 = $$4 == ha.f || $$4 == ha.e;
      return $$3.a(this.b(), $$5 ? dgn.b : dgn.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dgm<dgn> b();

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(c) ? ean.c.a(false) : super.c_($$0);
   }
}
