import com.mojang.serialization.MapCodec;

public abstract class dbw extends dch implements djh {
   protected static final etc a = dch.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final etc b = dch.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dpz c = dpy.C;
   private final boolean d;

   public static boolean a(czg $$0, id $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dpi $$0) {
      return $$0.a(ave.N) && $$0.b() instanceof dbw;
   }

   protected dbw(boolean $$0, dph.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dbw> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      dqm $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dpi a(dpi $$0, czg $$1, id $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dqm $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(id $$0, czg $$1, dqm $$2) {
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

   protected void a(dpi $$0, czg $$1, id $$2, dch $$3) {
   }

   protected dpi a(czg $$0, id $$1, dpi $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dqm $$4 = $$2.c(this.c());
         return new dig($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
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
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == elc.c;
      dpi $$3 = super.n();
      ij $$4 = $$0.g();
      boolean $$5 = $$4 == ij.f || $$4 == ij.e;
      return $$3.a(this.c(), $$5 ? dqm.b : dqm.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dql<dqm> c();

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(c) ? elc.c.a(false) : super.c_($$0);
   }
}
