import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dxo extends dmq {
   public static final MapCodec<dxo> b = b(dxo::new);
   public static final dyr<dyv> c = dyk.bh;
   public static final dyl d = dyk.y;
   public static final float e = 4.0F;
   protected static final fcr f = dkl.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcr g = dkl.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fcr h = dkl.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fcr i = dkl.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fcr j = dkl.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcr k = dkl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fcr o = dkl.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fcr G = dkl.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fcr H = dkl.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fcr I = dkl.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fcr J = dkl.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fcr K = dkl.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fcr L = dkl.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fcr M = dkl.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fcr N = dkl.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fcr O = dkl.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fcr P = dkl.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fcr Q = dkl.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fcr[] R = a(true);
   private static final fcr[] S = a(false);

   @Override
   protected MapCodec<dxo> a() {
      return b;
   }

   private static fcr[] a(boolean $$0) {
      return Arrays.stream(jm.values()).map($$1 -> a($$1, $$0)).toArray(fcr[]::new);
   }

   private static fcr a(jm $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fco.a(k, $$1 ? M : G);
         case b:
            return fco.a(j, $$1 ? L : o);
         case c:
            return fco.a(i, $$1 ? O : I);
         case d:
            return fco.a(h, $$1 ? N : H);
         case e:
            return fco.a(g, $$1 ? Q : K);
         case f:
            return fco.a(f, $$1 ? P : J);
      }
   }

   public dxo(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(c, dyv.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dxu $$0, dxu $$1) {
      dkl $$2 = $$0.c(c) == dyv.a ? dkn.bF : dkn.by;
      return $$1.a($$2) && $$1.c(dxn.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      if (!$$0.C && $$3.gj().d) {
         jh $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jh $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      dxu $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dkn.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if ($$0.a((dhk)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eva.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo($$2.c(c) == dyv.b ? dkn.by : dkn.bF);
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
