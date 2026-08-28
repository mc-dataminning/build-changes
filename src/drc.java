import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public abstract class drc extends dmm implements dtx {
   public static final int a = 7;
   public static final ebo b = ebe.aF;
   public static final ebf c = ebe.z;
   public static final ebf d = ebe.I;
   protected final float e;
   private static final int f = 1;

   @Override
   public abstract MapCodec<? extends drc> a();

   public drc(float $$0, ean.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(b, Integer.valueOf(7)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffr b_(eao $$0, din $$1, iv $$2) {
      return ffo.a();
   }

   @Override
   protected boolean f(eao $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(eao $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(eao $$0) {
      return 1;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(b) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static eao a(eao $$0, dji $$1, iv $$2) {
      int $$3 = 7;
      iv.a $$4 = new iv.a();

      for (jb $$5 : jb.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(b, Integer.valueOf($$3));
   }

   private static int r(eao $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(eao $$0) {
      if ($$0.a(axc.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(d) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);
      iv $$4 = $$2.e();
      eao $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(djh $$0, iv $$1, azv $$2, eao $$3, iv $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, jb.b)) {
               azq.a($$0, $$1, $$2, ly.l);
            }
         }
      }
   }

   private void b(djh $$0, iv $$1, azv $$2, eao $$3, iv $$4) {
      if (!($$2.i() >= this.e)) {
         if (!a($$3.g($$0, $$4), jb.b)) {
            this.a($$0, $$1, $$2);
         }
      }
   }

   protected abstract void a(djh var1, iv var2, azv var3);

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      eao $$2 = this.m().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf($$1.a() == eww.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
