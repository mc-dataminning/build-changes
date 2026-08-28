import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dxi extends dmh {
   public static final MapCodec<dxi> b = b(dxi::new);
   public static final dyl<dyp> c = dye.bj;
   public static final dyf d = dye.C;
   public static final float e = 4.0F;
   protected static final fcl f = dkd.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcl g = dkd.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fcl h = dkd.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fcl i = dkd.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fcl j = dkd.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcl k = dkd.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fcl o = dkd.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fcl G = dkd.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fcl H = dkd.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fcl I = dkd.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fcl J = dkd.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fcl K = dkd.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fcl L = dkd.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fcl M = dkd.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fcl N = dkd.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fcl O = dkd.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fcl P = dkd.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fcl Q = dkd.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fcl[] R = a(true);
   private static final fcl[] S = a(false);

   @Override
   protected MapCodec<dxi> a() {
      return b;
   }

   private static fcl[] a(boolean $$0) {
      return Arrays.stream(jm.values()).map($$1 -> a($$1, $$0)).toArray(fcl[]::new);
   }

   private static fcl a(jm $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fci.a(k, $$1 ? M : G);
         case b:
            return fci.a(j, $$1 ? L : o);
         case c:
            return fci.a(i, $$1 ? O : I);
         case d:
            return fci.a(h, $$1 ? N : H);
         case e:
            return fci.a(g, $$1 ? Q : K);
         case f:
            return fci.a(f, $$1 ? P : J);
      }
   }

   public dxi(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(c, dyp.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dxo $$0, dxo $$1) {
      dkd $$2 = $$0.c(c) == dyp.a ? dkf.bF : dkf.by;
      return $$1.a($$2) && $$1.c(dxh.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      if (!$$0.C && $$3.gj().d) {
         jh $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jh $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      dxo $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dkf.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if ($$0.a((dhc)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, euu.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg($$2.c(c) == dyp.b ? dkf.by : dkf.bF);
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
