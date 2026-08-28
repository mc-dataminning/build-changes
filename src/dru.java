import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public abstract class dru extends dne implements dup {
   public static final int a = 7;
   public static final ecg b = ebw.aF;
   public static final ebx c = ebw.z;
   public static final ebx d = ebw.I;
   protected final float e;
   private static final int f = 1;

   @Override
   public abstract MapCodec<? extends dru> a();

   public dru(float $$0, ebf.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(b, Integer.valueOf(7)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgm b_(ebg $$0, djd $$1, iw $$2) {
      return fgj.a();
   }

   @Override
   protected boolean f(ebg $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(ebg $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(ebg $$0) {
      return 1;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(b) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static ebg a(ebg $$0, dka $$1, iw $$2) {
      int $$3 = 7;
      iw.a $$4 = new iw.a();

      for (jc $$5 : jc.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(b, Integer.valueOf($$3));
   }

   private static int r(ebg $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(ebg $$0) {
      if ($$0.a(axg.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(d) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      super.a($$0, $$1, $$2, $$3);
      iw $$4 = $$2.e();
      ebg $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(djz $$0, iw $$1, azz $$2, ebg $$3, iw $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, jc.b)) {
               azu.a($$0, $$1, $$2, lz.l);
            }
         }
      }
   }

   private void b(djz $$0, iw $$1, azz $$2, ebg $$3, iw $$4) {
      if (!($$2.i() >= this.e)) {
         if (!a($$3.g($$0, $$4), jc.b)) {
            this.a($$0, $$1, $$2);
         }
      }
   }

   protected abstract void a(djz var1, iw var2, azz var3);

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      ebg $$2 = this.m().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf($$1.a() == exr.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
