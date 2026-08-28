import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public abstract class dqi extends dlu implements dtb {
   public static final int a = 7;
   public static final eao b = eae.aF;
   public static final eaf c = eae.z;
   public static final eaf d = eae.I;
   protected final float e;
   private static final int f = 1;

   @Override
   public abstract MapCodec<? extends dqi> a();

   public dqi(float $$0, dzn.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.B.b().b(b, Integer.valueOf(7)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected feq b_(dzo $$0, dhv $$1, iu $$2) {
      return fen.a();
   }

   @Override
   protected boolean f(dzo $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dzo $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dzo $$0) {
      return 1;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(b) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dzo a(dzo $$0, diq $$1, iu $$2) {
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

   private static int r(dzo $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dzo $$0) {
      if ($$0.a(axa.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(d) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      super.a($$0, $$1, $$2, $$3);
      iu $$4 = $$2.e();
      dzo $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(dip $$0, iu $$1, azt $$2, dzo $$3, iu $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, ja.b)) {
               azo.a($$0, $$1, $$2, lx.l);
            }
         }
      }
   }

   private void b(dip $$0, iu $$1, azt $$2, dzo $$3, iu $$4) {
      if (!($$2.i() >= this.e)) {
         if (!a($$3.g($$0, $$4), ja.b)) {
            this.a($$0, $$1, $$2);
         }
      }
   }

   protected abstract void a(dip var1, iu var2, azt var3);

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      dzo $$2 = this.m().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf($$1.a() == evw.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
