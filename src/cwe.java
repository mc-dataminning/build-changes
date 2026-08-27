import com.mojang.serialization.MapCodec;

public abstract class cwe extends cwp implements ddp {
   protected static final eml a = cwp.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final eml b = cwp.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final djx c = djw.C;
   private final boolean d;

   public static boolean a(cto $$0, hx $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(djg $$0) {
      return $$0.a(asg.N) && $$0.b() instanceof cwe;
   }

   protected cwe(boolean $$0, djf.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cwe> a();

   public boolean b() {
      return this.d;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      dkk $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected djg a(djg $$0, cto $$1, hx $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dkk $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(hx $$0, cto $$1, dkk $$2) {
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

   protected void a(djg $$0, cto $$1, hx $$2, cwp $$3) {
   }

   protected djg a(cto $$0, hx $$1, djg $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dkk $$4 = $$2.c(this.c());
         return new dco($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
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
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eer.c;
      djg $$3 = super.o();
      ic $$4 = $$0.g();
      boolean $$5 = $$4 == ic.f || $$4 == ic.e;
      return $$3.a(this.c(), $$5 ? dkk.b : dkk.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dkj<dkk> c();

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(c) ? eer.c.a(false) : super.c_($$0);
   }
}
