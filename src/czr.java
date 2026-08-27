import com.mojang.serialization.MapCodec;

public abstract class czr extends dac implements dhc {
   protected static final eqm a = dac.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final eqm b = dac.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dns c = dnr.C;
   private final boolean d;

   public static boolean a(cxb $$0, ib $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dnb $$0) {
      return $$0.a(aun.N) && $$0.b() instanceof czr;
   }

   protected czr(boolean $$0, dna.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends czr> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      dof $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dnb a(dnb $$0, cxb $$1, ib $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dof $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ib $$0, cxb $$1, dof $$2) {
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

   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3) {
   }

   protected dnb a(cxb $$0, ib $$1, dnb $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dof $$4 = $$2.c(this.c());
         return new dgb($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
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
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eiq.c;
      dnb $$3 = super.o();
      ih $$4 = $$0.g();
      boolean $$5 = $$4 == ih.f || $$4 == ih.e;
      return $$3.a(this.c(), $$5 ? dof.b : dof.a).a(c, Boolean.valueOf($$2));
   }

   public abstract doe<dof> c();

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(c) ? eiq.c.a(false) : super.c_($$0);
   }
}
