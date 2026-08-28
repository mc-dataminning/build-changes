import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmb extends dmm implements dtx {
   public static final ebf a = ebe.I;
   private static final ffr b = dmm.b(16.0, 0.0, 2.0);
   private static final ffr c = dmm.b(16.0, 0.0, 8.0);
   private final boolean d;

   public static boolean a(djh $$0, iv $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(eao $$0) {
      return $$0.a(axc.P) && $$0.b() instanceof dmb;
   }

   protected dmb(boolean $$0, ean.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dmb> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return $$0.c(this.c()).b() ? c : b;
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected eao a(eao $$0, djh $$1, iv $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         ebs $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(iv $$0, djh $$1, ebs $$2) {
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

   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3) {
   }

   protected eao a(djh $$0, iv $$1, eao $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         ebs $$4 = $$2.c(this.c());
         return new dst($$0, $$1, $$2).a($$0.D($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
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
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eww.c;
      eao $$3 = super.m();
      jb $$4 = $$0.g();
      boolean $$5 = $$4 == jb.f || $$4 == jb.e;
      return $$3.b(this.c(), $$5 ? ebs.b : ebs.a).b(a, Boolean.valueOf($$2));
   }

   public abstract ebr<ebs> c();

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(a)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(a) ? eww.c.a(false) : super.b_($$0);
   }
}
