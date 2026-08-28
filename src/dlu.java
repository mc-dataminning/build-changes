import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlu extends dmf implements dtq {
   public static final eay a = eax.I;
   private static final ffk b = dmf.b(16.0, 0.0, 2.0);
   private static final ffk c = dmf.b(16.0, 0.0, 8.0);
   private final boolean d;

   public static boolean a(dja $$0, iu $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(eah $$0) {
      return $$0.a(axc.P) && $$0.b() instanceof dlu;
   }

   protected dlu(boolean $$0, eag.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dlu> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return $$0.c(this.c()).b() ? c : b;
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected eah a(eah $$0, dja $$1, iu $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         ebl $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(iu $$0, dja $$1, ebl $$2) {
      if (!c($$1, $$0.e())) {
         return true;
      } else {
         switch ($$2) {
            case c:
               return !c($$1, $$0.i());
            case d:
               return !c($$1, $$0.h());
            case e:
               return !c($$1, $$0.f());
            case f:
               return !c($$1, $$0.g());
            default:
               return false;
         }
      }
   }

   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3) {
   }

   protected eah a(dja $$0, iu $$1, eah $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         ebl $$4 = $$2.c(this.c());
         return new dsm($$0, $$1, $$2).a($$0.D($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         if ($$0.c(this.c()).b()) {
            $$1.a($$2.d(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.e(), this);
         }
      }
   }

   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ewp.c;
      eah $$3 = super.m();
      ja $$4 = $$0.g();
      boolean $$5 = $$4 == ja.f || $$4 == ja.e;
      return $$3.b(this.c(), $$5 ? ebl.b : ebl.a).b(a, Boolean.valueOf($$2));
   }

   public abstract ebk<ebl> c();

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(a)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(a) ? ewp.c.a(false) : super.b_($$0);
   }
}
