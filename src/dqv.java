import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public abstract class dqv extends dmf implements dtq {
   public static final int a = 7;
   public static final ebh b = eax.aF;
   public static final eay c = eax.z;
   public static final eay d = eax.I;
   protected final float e;
   private static final int f = 1;

   @Override
   public abstract MapCodec<? extends dqv> a();

   public dqv(float $$0, eag.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(b, Integer.valueOf(7)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffk b_(eah $$0, dig $$1, iu $$2) {
      return ffh.a();
   }

   @Override
   protected boolean f(eah $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(eah $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(eah $$0) {
      return 1;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(b) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static eah a(eah $$0, djb $$1, iu $$2) {
      int $$3 = 7;
      iu.a $$4 = new iu.a();

      for (ja $$5 : ja.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(b, Integer.valueOf($$3));
   }

   private static int r(eah $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(eah $$0) {
      if ($$0.a(axc.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(d) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);
      iu $$4 = $$2.e();
      eah $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(dja $$0, iu $$1, azv $$2, eah $$3, iu $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, ja.b)) {
               azq.a($$0, $$1, $$2, lx.l);
            }
         }
      }
   }

   private void b(dja $$0, iu $$1, azv $$2, eah $$3, iu $$4) {
      if (!($$2.i() >= this.e)) {
         if (!a($$3.g($$0, $$4), ja.b)) {
            this.a($$0, $$1, $$2);
         }
      }
   }

   protected abstract void a(dja var1, iu var2, azv var3);

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      eah $$2 = this.m().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf($$1.a() == ewp.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
