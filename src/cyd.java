import com.mojang.serialization.MapCodec;

public abstract class cyd extends cyo implements dfo {
   protected static final eol a = cyo.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final eol b = cyo.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dlw c = dlv.C;
   private final boolean d;

   public static boolean a(cvn $$0, hz $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dlf $$0) {
      return $$0.a(atz.N) && $$0.b() instanceof cyd;
   }

   protected cyd(boolean $$0, dle.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cyd> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      dmj $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dlf a(dlf $$0, cvn $$1, hz $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dmj $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(hz $$0, cvn $$1, dmj $$2) {
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

   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3) {
   }

   protected dlf a(cvn $$0, hz $$1, dlf $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dmj $$4 = $$2.c(this.c());
         return new den($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
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
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == egq.c;
      dlf $$3 = super.o();
      ie $$4 = $$0.g();
      boolean $$5 = $$4 == ie.f || $$4 == ie.e;
      return $$3.a(this.c(), $$5 ? dmj.b : dmj.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dmi<dmj> c();

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(c) ? egq.c.a(false) : super.c_($$0);
   }
}
