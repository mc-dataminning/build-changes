import com.mojang.serialization.MapCodec;

public abstract class dex extends dfi implements dmj {
   protected static final exa a = dfi.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final exa b = dfi.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dtc c = dtb.C;
   private final boolean d;

   public static boolean a(dcg $$0, ja $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dsl $$0) {
      return $$0.a(avw.N) && $$0.b() instanceof dex;
   }

   protected dex(boolean $$0, dsk.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dex> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      dtp $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dsl a(dsl $$0, dcg $$1, ja $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dtp $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ja $$0, dcg $$1, dtp $$2) {
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

   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3) {
   }

   protected dsl a(dcg $$0, ja $$1, dsl $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dtp $$4 = $$2.c(this.c());
         return new dli($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
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
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eok.c;
      dsl $$3 = super.o();
      jf $$4 = $$0.g();
      boolean $$5 = $$4 == jf.f || $$4 == jf.e;
      return $$3.a(this.c(), $$5 ? dtp.b : dtp.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dto<dtp> c();

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(c) ? eok.c.a(false) : super.b_($$0);
   }
}
