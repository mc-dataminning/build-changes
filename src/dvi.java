import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dvi extends dkm {
   public static final MapCodec<dvi> b = b(dvi::new);
   public static final dwl<dwp> c = dwe.bg;
   public static final dwf d = dwe.x;
   public static final float e = 4.0F;
   protected static final fal f = dij.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fal g = dij.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fal h = dij.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fal i = dij.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fal j = dij.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fal k = dij.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fal o = dij.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fal G = dij.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fal H = dij.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fal I = dij.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fal J = dij.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fal K = dij.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fal L = dij.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fal M = dij.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fal N = dij.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fal O = dij.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fal P = dij.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fal Q = dij.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fal[] R = a(true);
   private static final fal[] S = a(false);

   @Override
   protected MapCodec<dvi> a() {
      return b;
   }

   private static fal[] a(boolean $$0) {
      return Arrays.stream(jm.values()).map($$1 -> a($$1, $$0)).toArray(fal[]::new);
   }

   private static fal a(jm $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fai.a(k, $$1 ? M : G);
         case b:
            return fai.a(j, $$1 ? L : o);
         case c:
            return fai.a(i, $$1 ? O : I);
         case d:
            return fai.a(h, $$1 ? N : H);
         case e:
            return fai.a(g, $$1 ? Q : K);
         case f:
            return fai.a(f, $$1 ? P : J);
      }
   }

   public dvi(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(c, dwp.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dvo $$0, dvo $$1) {
      dij $$2 = $$0.c(c) == dwp.a ? dil.by : dil.br;
      return $$1.a($$2) && $$1.c(dvh.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dvo a(dff $$0, jh $$1, dvo $$2, cor $$3) {
      if (!$$0.C && $$3.gm().d) {
         jh $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jh $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      dvo $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dil.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if ($$0.a((dfi)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, ess.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf($$2.c(c) == dwp.b ? dil.br : dil.by);
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
