import com.mojang.serialization.MapCodec;

public abstract class deq extends dfb implements dmc {
   protected static final ewm a = dfb.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final ewm b = dfb.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dsv c = dsu.C;
   private final boolean d;

   public static boolean a(dca $$0, iz $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dse $$0) {
      return $$0.a(awp.N) && $$0.b() instanceof deq;
   }

   protected deq(boolean $$0, dsd.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends deq> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      dti $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dse a(dse $$0, dca $$1, iz $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dti $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(iz $$0, dca $$1, dti $$2) {
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

   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3) {
   }

   protected dse a(dca $$0, iz $$1, dse $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dti $$4 = $$2.c(this.c());
         return new dlb($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
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
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eny.c;
      dse $$3 = super.o();
      je $$4 = $$0.g();
      boolean $$5 = $$4 == je.f || $$4 == je.e;
      return $$3.a(this.c(), $$5 ? dti.b : dti.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dth<dti> c();

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(c) ? eny.c.a(false) : super.b_($$0);
   }
}
