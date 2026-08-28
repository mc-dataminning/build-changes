import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public abstract class drs extends dnc implements dun {
   public static final int a = 7;
   public static final ece b = ebu.aF;
   public static final ebv c = ebu.z;
   public static final ebv d = ebu.I;
   protected final float e;
   private static final int f = 1;

   @Override
   public abstract MapCodec<? extends drs> a();

   public drs(float $$0, ebd.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(b, Integer.valueOf(7)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgk b_(ebe $$0, djb $$1, iv $$2) {
      return fgh.a();
   }

   @Override
   protected boolean f(ebe $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(ebe $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(ebe $$0) {
      return 1;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(b) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static ebe a(ebe $$0, djy $$1, iv $$2) {
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

   private static int r(ebe $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(ebe $$0) {
      if ($$0.a(axe.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(d) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      super.a($$0, $$1, $$2, $$3);
      iv $$4 = $$2.e();
      ebe $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(djx $$0, iv $$1, azx $$2, ebe $$3, iv $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, jb.b)) {
               azs.a($$0, $$1, $$2, ly.l);
            }
         }
      }
   }

   private void b(djx $$0, iv $$1, azx $$2, ebe $$3, iv $$4) {
      if (!($$2.i() >= this.e)) {
         if (!a($$3.g($$0, $$4), jb.b)) {
            this.a($$0, $$1, $$2);
         }
      }
   }

   protected abstract void a(djx var1, iv var2, azx var3);

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      ebe $$2 = this.m().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf($$1.a() == exp.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
