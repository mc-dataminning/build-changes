import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dux extends dkb {
   public static final MapCodec<dux> b = b(dux::new);
   public static final dwb<dwf> c = dvt.bg;
   public static final dvu d = dvt.x;
   public static final float e = 4.0F;
   protected static final fab f = dhy.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fab g = dhy.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fab h = dhy.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fab i = dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fab j = dhy.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fab k = dhy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fab o = dhy.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fab G = dhy.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fab H = dhy.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fab I = dhy.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fab J = dhy.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fab K = dhy.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fab L = dhy.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fab M = dhy.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fab N = dhy.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fab O = dhy.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fab P = dhy.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fab Q = dhy.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fab[] R = a(true);
   private static final fab[] S = a(false);

   @Override
   protected MapCodec<dux> a() {
      return b;
   }

   private static fab[] a(boolean $$0) {
      return Arrays.stream(jl.values()).map($$1 -> a($$1, $$0)).toArray(fab[]::new);
   }

   private static fab a(jl $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ezy.a(k, $$1 ? M : G);
         case b:
            return ezy.a(j, $$1 ? L : o);
         case c:
            return ezy.a(i, $$1 ? O : I);
         case d:
            return ezy.a(h, $$1 ? N : H);
         case e:
            return ezy.a(g, $$1 ? Q : K);
         case f:
            return ezy.a(f, $$1 ? P : J);
      }
   }

   public dux(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jl.c).b(c, dwf.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dvd $$0, dvd $$1) {
      dhy $$2 = $$0.c(c) == dwf.a ? dia.by : dia.br;
      return $$1.a($$2) && $$1.c(duw.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      if (!$$0.C && $$3.gl().d) {
         jg $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jg $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      dvd $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dia.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if ($$0.a((dey)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, esi.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx($$2.c(c) == dwf.b ? dia.br : dia.by);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
