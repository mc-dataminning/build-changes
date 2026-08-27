import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dhc extends cxd {
   public static final MapCodec<dhc> b = b(dhc::new);
   public static final dig<dik> c = dhy.bg;
   public static final dhz d = dhy.x;
   public static final float e = 4.0F;
   protected static final ekn f = cva.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekn g = cva.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ekn h = cva.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ekn i = cva.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ekn j = cva.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekn k = cva.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ekn o = cva.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ekn F = cva.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ekn G = cva.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ekn H = cva.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ekn I = cva.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ekn J = cva.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ekn K = cva.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ekn L = cva.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ekn M = cva.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ekn N = cva.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ekn O = cva.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ekn P = cva.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ekn[] Q = a(true);
   private static final ekn[] R = a(false);

   @Override
   protected MapCodec<dhc> a() {
      return b;
   }

   private static ekn[] a(boolean $$0) {
      return Arrays.stream(hx.values()).map($$1 -> a($$1, $$0)).toArray(ekn[]::new);
   }

   private static ekn a(hx $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ekk.a(k, $$1 ? L : F);
         case b:
            return ekk.a(j, $$1 ? K : o);
         case c:
            return ekk.a(i, $$1 ? N : H);
         case d:
            return ekk.a(h, $$1 ? M : G);
         case e:
            return ekk.a(g, $$1 ? P : J);
         case f:
            return ekk.a(f, $$1 ? O : I);
      }
   }

   public dhc(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.c).a(c, dik.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dhi $$0, dhi $$1) {
      cva $$2 = $$0.c(c) == dik.a ? cvc.by : cvc.br;
      return $$1.a($$2) && $$1.c(dhb.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dhi a(csa $$0, ht $$1, dhi $$2, cdu $$3) {
      if (!$$0.B && $$3.fU().d) {
         ht $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ht $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      dhi $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cvc.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if ($$0.a((csd)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj($$2.c(c) == dik.b ? cvc.br : cvc.by);
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
