import com.mojang.serialization.MapCodec;

public abstract class dem extends dex implements dly {
   protected static final ewi a = dex.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final ewi b = dex.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dsr c = dsq.C;
   private final boolean d;

   public static boolean a(dbw $$0, iz $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dsa $$0) {
      return $$0.a(awo.N) && $$0.b() instanceof dem;
   }

   protected dem(boolean $$0, drz.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dem> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      dte $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dsa a(dsa $$0, dbw $$1, iz $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dte $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(iz $$0, dbw $$1, dte $$2) {
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

   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3) {
   }

   protected dsa a(dbw $$0, iz $$1, dsa $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dte $$4 = $$2.c(this.c());
         return new dkx($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$4) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(this.c()).b()) {
            $$1.a($$2.c(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.d(), this);
         }
      }
   }

   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enu.c;
      dsa $$3 = super.o();
      je $$4 = $$0.g();
      boolean $$5 = $$4 == je.f || $$4 == je.e;
      return $$3.a(this.c(), $$5 ? dte.b : dte.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dtd<dte> c();

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(c) ? enu.c.a(false) : super.b_($$0);
   }
}
