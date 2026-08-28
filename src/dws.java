import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dws extends dlr {
   public static final MapCodec<dws> b = b(dws::new);
   public static final dxv<dxz> c = dxo.bj;
   public static final dxp d = dxo.C;
   public static final float e = 4.0F;
   protected static final fbv f = djn.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbv g = djn.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fbv h = djn.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fbv i = djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fbv j = djn.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbv k = djn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fbv o = djn.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fbv G = djn.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fbv H = djn.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fbv I = djn.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fbv J = djn.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fbv K = djn.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fbv L = djn.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fbv M = djn.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fbv N = djn.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fbv O = djn.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fbv P = djn.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fbv Q = djn.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fbv[] R = a(true);
   private static final fbv[] S = a(false);

   @Override
   protected MapCodec<dws> a() {
      return b;
   }

   private static fbv[] a(boolean $$0) {
      return Arrays.stream(jn.values()).map($$1 -> a($$1, $$0)).toArray(fbv[]::new);
   }

   private static fbv a(jn $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fbs.a(k, $$1 ? M : G);
         case b:
            return fbs.a(j, $$1 ? L : o);
         case c:
            return fbs.a(i, $$1 ? O : I);
         case d:
            return fbs.a(h, $$1 ? N : H);
         case e:
            return fbs.a(g, $$1 ? Q : K);
         case f:
            return fbs.a(f, $$1 ? P : J);
      }
   }

   public dws(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.c).b(c, dxz.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dwy $$0, dwy $$1) {
      djn $$2 = $$0.c(c) == dxz.a ? djp.bF : djp.by;
      return $$1.a($$2) && $$1.c(dwr.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      if (!$$0.C && $$3.gj().d) {
         ji $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ji $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      dwy $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(djp.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if ($$0.a((dgm)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eue.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq($$2.c(c) == dxz.b ? djp.by : djp.bF);
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
