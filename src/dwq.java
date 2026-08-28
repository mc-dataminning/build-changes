import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dwq extends dlp {
   public static final MapCodec<dwq> b = b(dwq::new);
   public static final dxt<dxx> c = dxm.bj;
   public static final dxn d = dxm.C;
   public static final float e = 4.0F;
   protected static final fbt f = djl.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbt g = djl.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fbt h = djl.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fbt i = djl.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fbt j = djl.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbt k = djl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fbt o = djl.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fbt G = djl.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fbt H = djl.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fbt I = djl.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fbt J = djl.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fbt K = djl.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fbt L = djl.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fbt M = djl.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fbt N = djl.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fbt O = djl.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fbt P = djl.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fbt Q = djl.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fbt[] R = a(true);
   private static final fbt[] S = a(false);

   @Override
   protected MapCodec<dwq> a() {
      return b;
   }

   private static fbt[] a(boolean $$0) {
      return Arrays.stream(jn.values()).map($$1 -> a($$1, $$0)).toArray(fbt[]::new);
   }

   private static fbt a(jn $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fbq.a(k, $$1 ? M : G);
         case b:
            return fbq.a(j, $$1 ? L : o);
         case c:
            return fbq.a(i, $$1 ? O : I);
         case d:
            return fbq.a(h, $$1 ? N : H);
         case e:
            return fbq.a(g, $$1 ? Q : K);
         case f:
            return fbq.a(f, $$1 ? P : J);
      }
   }

   public dwq(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.c).b(c, dxx.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dww $$0, dww $$1) {
      djl $$2 = $$0.c(c) == dxx.a ? djn.bF : djn.by;
      return $$1.a($$2) && $$1.c(dwp.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dww a(dgh $$0, ji $$1, dww $$2, cow $$3) {
      if (!$$0.C && $$3.gj().d) {
         ji $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ji $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      dww $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(djn.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if ($$0.a((dgk)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, euc.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo($$2.c(c) == dxx.b ? djn.by : djn.bF);
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
