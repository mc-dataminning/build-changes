import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsh extends dov implements dmp {
   public static final MapCodec<dsh> c = b(dsh::new);
   public static final int d = 4;
   public static final ebo e = ebe.aw;
   public static final ebm<ebk> f = dov.b;
   private static final int g = 3;
   private static final int h = 1;
   private static final ffr i = dmm.b(6.0, -1.0, 3.0);
   private static final ffr D = dmm.b(10.0, -1.0, 5.0);
   private final Function<eao, ffr> R = this.b();

   @Override
   public MapCodec<dsh> a() {
      return c;
   }

   public dsh(ean.d $$0) {
      super($$0);
   }

   private Function<eao, ffr> b() {
      int[] $$0 = new int[]{0, 9, 11, 22, 26};
      return this.a($$1 -> {
         int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
         int $$3 = $$1.c(e) == 0 ? 6 : 10;

         return switch ((ebk)$$1.c(f)) {
            case b -> dmm.b((double)$$3, -1.0, (double)Math.min(16, -1 + $$2));
            case a -> dmm.b((double)$$3, 0.0, (double)Math.max(0, -1 + $$2 - 16));
         };
      });
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      return this.m();
   }

   @Override
   public ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.R.apply($$0);
   }

   @Override
   public ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      if ($$0.c(f) == ebk.b) {
         return $$0.c(e) == 0 ? i : D;
      } else {
         return ffo.a();
      }
   }

   @Override
   public eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if (b($$0.c(e))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dmo.a.m();
      }
   }

   @Override
   public boolean a(eao $$0, djk $$1, iv $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(dmo.cN);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(e);
      super.a($$0);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$1 instanceof arq $$5 && $$3 instanceof coq && $$5.O().c(djd.d)) {
         $$5.a($$2, true, $$3);
      }
   }

   @Override
   public boolean a(eao $$0, ddd $$1) {
      return false;
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bxj $$3, czk $$4) {
   }

   @Override
   public boolean f(eao $$0) {
      return $$0.c(f) == ebk.b && !this.q($$0);
   }

   @Override
   public void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      float $$4 = doj.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arq $$0, eao $$1, iv $$2, int $$3) {
      int $$4 = Math.min($$1.c(e) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         eao $$5 = $$1.b(e, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(f, ebk.a), 3);
         }
      }
   }

   private static boolean a(djk $$0, iv $$1) {
      eao $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dmo.lh);
   }

   private static boolean b(djk $$0, iv $$1) {
      return doj.a($$0, $$1);
   }

   private static boolean o(eao $$0) {
      return $$0.a(dmo.lh) && $$0.c(f) == ebk.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(djk $$0, iv $$1, eao $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(eao $$0) {
      return $$0.c(e) >= 4;
   }

   @Nullable
   private dsh.a c(djk $$0, iv $$1, eao $$2) {
      if (o($$2)) {
         return new dsh.a($$1, $$2);
      } else {
         iv $$3 = $$1.e();
         eao $$4 = $$0.a_($$3);
         return o($$4) ? new dsh.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      dsh.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      dsh.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iv a, eao b) {
   }
}
