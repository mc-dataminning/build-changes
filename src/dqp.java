import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public abstract class dqp extends dma implements dtj {
   public static final int a = 7;
   public static final eaz b = eap.aF;
   public static final eaq c = eap.z;
   public static final eaq d = eap.I;
   protected final float e;
   private static final int f = 1;

   @Override
   public abstract MapCodec<? extends dqp> a();

   public dqp(float $$0, dzy.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.B.b().b(b, Integer.valueOf(7)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffc b_(dzz $$0, dib $$1, iu $$2) {
      return fez.a();
   }

   @Override
   protected boolean f(dzz $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dzz $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dzz $$0) {
      return 1;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(b) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dzz a(dzz $$0, diw $$1, iu $$2) {
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

   private static int r(dzz $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dzz $$0) {
      if ($$0.a(axc.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(d) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);
      iu $$4 = $$2.e();
      dzz $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(div $$0, iu $$1, azv $$2, dzz $$3, iu $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, ja.b)) {
               azq.a($$0, $$1, $$2, lx.l);
            }
         }
      }
   }

   private void b(div $$0, iu $$1, azv $$2, dzz $$3, iu $$4) {
      if (!($$2.i() >= this.e)) {
         if (!a($$3.g($$0, $$4), ja.b)) {
            this.a($$0, $$1, $$2);
         }
      }
   }

   protected abstract void a(div var1, iu var2, azv var3);

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      dzz $$2 = this.m().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf($$1.a() == ewh.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
