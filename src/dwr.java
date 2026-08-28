import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dwr extends dlq {
   public static final MapCodec<dwr> b = b(dwr::new);
   public static final dxu<dxy> c = dxn.bj;
   public static final dxo d = dxn.C;
   public static final float e = 4.0F;
   protected static final fbu f = djm.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbu g = djm.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fbu h = djm.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fbu i = djm.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fbu j = djm.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbu k = djm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fbu o = djm.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fbu G = djm.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fbu H = djm.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fbu I = djm.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fbu J = djm.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fbu K = djm.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fbu L = djm.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fbu M = djm.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fbu N = djm.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fbu O = djm.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fbu P = djm.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fbu Q = djm.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fbu[] R = a(true);
   private static final fbu[] S = a(false);

   @Override
   protected MapCodec<dwr> a() {
      return b;
   }

   private static fbu[] a(boolean $$0) {
      return Arrays.stream(jn.values()).map($$1 -> a($$1, $$0)).toArray(fbu[]::new);
   }

   private static fbu a(jn $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fbr.a(k, $$1 ? M : G);
         case b:
            return fbr.a(j, $$1 ? L : o);
         case c:
            return fbr.a(i, $$1 ? O : I);
         case d:
            return fbr.a(h, $$1 ? N : H);
         case e:
            return fbr.a(g, $$1 ? Q : K);
         case f:
            return fbr.a(f, $$1 ? P : J);
      }
   }

   public dwr(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.c).b(c, dxy.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dwx $$0) {
      return true;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dwx $$0, dwx $$1) {
      djm $$2 = $$0.c(c) == dxy.a ? djo.bF : djo.by;
      return $$1.a($$2) && $$1.c(dwq.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dwx a(dgi $$0, ji $$1, dwx $$2, cox $$3) {
      if (!$$0.C && $$3.gj().d) {
         ji $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ji $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      dwx $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(djo.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if ($$0.a((dgl)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eud.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp($$2.c(c) == dxy.b ? djo.by : djo.bF);
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
