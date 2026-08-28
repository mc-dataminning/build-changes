import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public abstract class drh extends dmr implements duc {
   public static final int a = 7;
   public static final ebt b = ebj.aF;
   public static final ebk c = ebj.z;
   public static final ebk d = ebj.I;
   protected final float e;
   private static final int f = 1;

   @Override
   public abstract MapCodec<? extends drh> a();

   public drh(float $$0, eas.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(b, Integer.valueOf(7)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffw b_(eat $$0, diq $$1, iv $$2) {
      return fft.a();
   }

   @Override
   protected boolean f(eat $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(eat $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(eat $$0) {
      return 1;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(b) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static eat a(eat $$0, djn $$1, iv $$2) {
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

   private static int r(eat $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(eat $$0) {
      if ($$0.a(axc.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(d) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      super.a($$0, $$1, $$2, $$3);
      iv $$4 = $$2.e();
      eat $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(djm $$0, iv $$1, azv $$2, eat $$3, iv $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, jb.b)) {
               azq.a($$0, $$1, $$2, ly.l);
            }
         }
      }
   }

   private void b(djm $$0, iv $$1, azv $$2, eat $$3, iv $$4) {
      if (!($$2.i() >= this.e)) {
         if (!a($$3.g($$0, $$4), jb.b)) {
            this.a($$0, $$1, $$2);
         }
      }
   }

   protected abstract void a(djm var1, iv var2, azv var3);

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      eat $$2 = this.m().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf($$1.a() == exb.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
