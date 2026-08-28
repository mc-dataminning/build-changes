import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public abstract class dse extends dno implements duz {
   public static final int a = 7;
   public static final ecq b = ecg.aF;
   public static final ech c = ecg.z;
   public static final ech d = ecg.I;
   protected final float e;
   private static final int f = 1;

   @Override
   public abstract MapCodec<? extends dse> a();

   public dse(float $$0, ebp.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(b, Integer.valueOf(7)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgw b_(ebq $$0, djn $$1, iw $$2) {
      return fgt.a();
   }

   @Override
   protected boolean f(ebq $$0) {
      return $$0.c(b) == 7 && !$$0.c(c);
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(ebq $$0) {
      return !$$0.c(c) && $$0.c(b) == 7;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(ebq $$0) {
      return 1;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(b) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static ebq a(ebq $$0, dkk $$1, iw $$2) {
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

   private static int r(ebq $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(ebq $$0) {
      if ($$0.a(axn.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(b) ? OptionalInt.of($$0.c(b)) : OptionalInt.empty();
      }
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(d) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      super.a($$0, $$1, $$2, $$3);
      iw $$4 = $$2.e();
      ebq $$5 = $$1.a_($$4);
      a($$1, $$2, $$3, $$5, $$4);
      this.b($$1, $$2, $$3, $$5, $$4);
   }

   private static void a(dkj $$0, iw $$1, bai $$2, ebq $$3, iw $$4) {
      if ($$0.r($$1.d())) {
         if ($$2.a(15) == 1) {
            if (!$$3.t() || !$$3.c($$0, $$4, jc.b)) {
               bad.a($$0, $$1, $$2, lz.l);
            }
         }
      }
   }

   private void b(dkj $$0, iw $$1, bai $$2, ebq $$3, iw $$4) {
      if (!($$2.i() >= this.e)) {
         if (!a($$3.g($$0, $$4), jc.b)) {
            this.a($$0, $$1, $$2);
         }
      }
   }

   protected abstract void a(dkj var1, iw var2, bai var3);

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      ebq $$2 = this.m().b(c, Boolean.valueOf(true)).b(d, Boolean.valueOf($$1.a() == eyb.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
