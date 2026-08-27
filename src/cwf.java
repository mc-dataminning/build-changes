import com.mojang.serialization.MapCodec;

public abstract class cwf extends cwq implements ddq {
   protected static final emm a = cwq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final emm b = cwq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final djy c = djx.C;
   private final boolean d;

   public static boolean a(ctp $$0, hx $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(djh $$0) {
      return $$0.a(ash.N) && $$0.b() instanceof cwf;
   }

   protected cwf(boolean $$0, djg.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cwf> a();

   public boolean b() {
      return this.d;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      dkl $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected djh a(djh $$0, ctp $$1, hx $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dkl $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(hx $$0, ctp $$1, dkl $$2) {
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

   protected void a(djh $$0, ctp $$1, hx $$2, cwq $$3) {
   }

   protected djh a(ctp $$0, hx $$1, djh $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dkl $$4 = $$2.c(this.c());
         return new dcp($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
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
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ees.c;
      djh $$3 = super.o();
      ic $$4 = $$0.g();
      boolean $$5 = $$4 == ic.f || $$4 == ic.e;
      return $$3.a(this.c(), $$5 ? dkl.b : dkl.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dkk<dkl> c();

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(c) ? ees.c.a(false) : super.c_($$0);
   }
}
