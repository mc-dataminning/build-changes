import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dwp extends dlo {
   public static final MapCodec<dwp> b = b(dwp::new);
   public static final dxs<dxw> c = dxl.bj;
   public static final dxm d = dxl.C;
   public static final float e = 4.0F;
   protected static final fbs f = djk.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbs g = djk.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fbs h = djk.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fbs i = djk.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fbs j = djk.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbs k = djk.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fbs o = djk.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fbs G = djk.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fbs H = djk.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fbs I = djk.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fbs J = djk.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fbs K = djk.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fbs L = djk.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fbs M = djk.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fbs N = djk.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fbs O = djk.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fbs P = djk.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fbs Q = djk.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fbs[] R = a(true);
   private static final fbs[] S = a(false);

   @Override
   protected MapCodec<dwp> a() {
      return b;
   }

   private static fbs[] a(boolean $$0) {
      return Arrays.stream(jn.values()).map($$1 -> a($$1, $$0)).toArray(fbs[]::new);
   }

   private static fbs a(jn $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fbp.a(k, $$1 ? M : G);
         case b:
            return fbp.a(j, $$1 ? L : o);
         case c:
            return fbp.a(i, $$1 ? O : I);
         case d:
            return fbp.a(h, $$1 ? N : H);
         case e:
            return fbp.a(g, $$1 ? Q : K);
         case f:
            return fbp.a(f, $$1 ? P : J);
      }
   }

   public dwp(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.c).b(c, dxw.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dwv $$0, dwv $$1) {
      djk $$2 = $$0.c(c) == dxw.a ? djm.bF : djm.by;
      return $$1.a($$2) && $$1.c(dwo.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dwv a(dgg $$0, ji $$1, dwv $$2, cov $$3) {
      if (!$$0.C && $$3.gj().d) {
         ji $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ji $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(djm.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if ($$0.a((dgj)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eub.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn($$2.c(c) == dxw.b ? djm.by : djm.bF);
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
