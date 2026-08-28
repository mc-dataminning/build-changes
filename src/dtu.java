import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dtu extends diy {
   public static final MapCodec<dtu> b = b(dtu::new);
   public static final duy<dvc> c = duq.bg;
   public static final dur d = duq.x;
   public static final float e = 4.0F;
   protected static final eyx f = dgv.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eyx g = dgv.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eyx h = dgv.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eyx i = dgv.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eyx j = dgv.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eyx k = dgv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final eyx o = dgv.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eyx F = dgv.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eyx G = dgv.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eyx H = dgv.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eyx I = dgv.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eyx J = dgv.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eyx K = dgv.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eyx L = dgv.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eyx M = dgv.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eyx N = dgv.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eyx O = dgv.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eyx P = dgv.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eyx[] Q = a(true);
   private static final eyx[] R = a(false);

   @Override
   protected MapCodec<dtu> a() {
      return b;
   }

   private static eyx[] a(boolean $$0) {
      return Arrays.stream(jj.values()).map($$1 -> a($$1, $$0)).toArray(eyx[]::new);
   }

   private static eyx a(jj $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eyu.a(k, $$1 ? L : F);
         case b:
            return eyu.a(j, $$1 ? K : o);
         case c:
            return eyu.a(i, $$1 ? N : H);
         case d:
            return eyu.a(h, $$1 ? M : G);
         case e:
            return eyu.a(g, $$1 ? P : J);
         case f:
            return eyu.a(f, $$1 ? O : I);
      }
   }

   public dtu(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(a, jj.c).b(c, dvc.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dua $$0, dua $$1) {
      dgv $$2 = $$0.c(c) == dvc.a ? dgx.by : dgx.br;
      return $$1.a($$2) && $$1.c(dtt.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dua a(dds $$0, je $$1, dua $$2, cnp $$3) {
      if (!$$0.B && $$3.gd().d) {
         je $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         je $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      dua $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dgx.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if ($$0.a((ddv)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, erf.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl($$2.c(c) == dvc.b ? dgx.br : dgx.by);
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
