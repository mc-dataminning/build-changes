import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dsu extends dhz {
   public static final MapCodec<dsu> b = b(dsu::new);
   public static final dty<duc> c = dtq.bg;
   public static final dtr d = dtq.x;
   public static final float e = 4.0F;
   protected static final exp f = dfw.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exp g = dfw.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final exp h = dfw.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final exp i = dfw.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final exp j = dfw.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exp k = dfw.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final exp o = dfw.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final exp F = dfw.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final exp G = dfw.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final exp H = dfw.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final exp I = dfw.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final exp J = dfw.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final exp K = dfw.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final exp L = dfw.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final exp M = dfw.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final exp N = dfw.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final exp O = dfw.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final exp P = dfw.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final exp[] Q = a(true);
   private static final exp[] R = a(false);

   @Override
   protected MapCodec<dsu> a() {
      return b;
   }

   private static exp[] a(boolean $$0) {
      return Arrays.stream(ji.values()).map($$1 -> a($$1, $$0)).toArray(exp[]::new);
   }

   private static exp a(ji $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return exm.a(k, $$1 ? L : F);
         case b:
            return exm.a(j, $$1 ? K : o);
         case c:
            return exm.a(i, $$1 ? N : H);
         case d:
            return exm.a(h, $$1 ? M : G);
         case e:
            return exm.a(g, $$1 ? P : J);
         case f:
            return exm.a(f, $$1 ? O : I);
      }
   }

   public dsu(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ji.c).a(c, duc.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dta $$0, dta $$1) {
      dfw $$2 = $$0.c(c) == duc.a ? dfy.by : dfy.br;
      return $$1.a($$2) && $$1.c(dst.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dta a(dcu $$0, jd $$1, dta $$2, cmv $$3) {
      if (!$$0.B && $$3.ga().d) {
         jd $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jd $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      dta $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dfy.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if ($$0.a((dcx)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo($$2.c(c) == duc.b ? dfy.br : dfy.by);
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
