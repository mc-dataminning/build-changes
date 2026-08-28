import com.mojang.serialization.MapCodec;

public abstract class dej extends deu implements dlv {
   protected static final ewf a = deu.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final ewf b = deu.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dso c = dsn.C;
   private final boolean d;

   public static boolean a(dbt $$0, iz $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(drx $$0) {
      return $$0.a(awl.N) && $$0.b() instanceof dej;
   }

   protected dej(boolean $$0, drw.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dej> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      dtb $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected drx a(drx $$0, dbt $$1, iz $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dtb $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(iz $$0, dbt $$1, dtb $$2) {
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

   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3) {
   }

   protected drx a(dbt $$0, iz $$1, drx $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dtb $$4 = $$2.c(this.c());
         return new dku($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
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
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enr.c;
      drx $$3 = super.n();
      je $$4 = $$0.g();
      boolean $$5 = $$4 == je.f || $$4 == je.e;
      return $$3.a(this.c(), $$5 ? dtb.b : dtb.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dta<dtb> c();

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(c) ? enr.c.a(false) : super.b_($$0);
   }
}
