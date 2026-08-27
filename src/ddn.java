import com.mojang.serialization.MapCodec;

public abstract class ddn extends ddy implements dkz {
   protected static final evd a = ddy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final evd b = ddy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final drs c = drr.C;
   private final boolean d;

   public static boolean a(dax $$0, io $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(drb $$0) {
      return $$0.a(avw.N) && $$0.b() instanceof ddn;
   }

   protected ddn(boolean $$0, dra.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddn> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      dsf $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected drb a(drb $$0, dax $$1, io $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dsf $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(io $$0, dax $$1, dsf $$2) {
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

   protected void a(drb $$0, dax $$1, io $$2, ddy $$3) {
   }

   protected drb a(dax $$0, io $$1, drb $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dsf $$4 = $$2.c(this.c());
         return new djy($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
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
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emv.c;
      drb $$3 = super.n();
      it $$4 = $$0.g();
      boolean $$5 = $$4 == it.f || $$4 == it.e;
      return $$3.a(this.c(), $$5 ? dsf.b : dsf.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dse<dsf> c();

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(c) ? emv.c.a(false) : super.b_($$0);
   }
}
