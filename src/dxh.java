import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import javax.annotation.Nullable;

public class dxh extends dmj {
   public static final MapCodec<dxh> b = b(dxh::new);
   public static final dyk<dyo> c = dyd.bh;
   public static final dye d = dyd.y;
   public static final float e = 4.0F;
   protected static final fcm f = dke.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcm g = dke.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final fcm h = dke.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final fcm i = dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final fcm j = dke.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcm k = dke.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final fcm o = dke.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fcm G = dke.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final fcm H = dke.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final fcm I = dke.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final fcm J = dke.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fcm K = dke.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final fcm L = dke.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final fcm M = dke.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fcm N = dke.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final fcm O = dke.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final fcm P = dke.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final fcm Q = dke.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final fcm[] R = a(true);
   private static final fcm[] S = a(false);

   @Override
   protected MapCodec<dxh> a() {
      return b;
   }

   private static fcm[] a(boolean $$0) {
      return Arrays.stream(jm.values()).map($$1 -> a($$1, $$0)).toArray(fcm[]::new);
   }

   private static fcm a(jm $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return fcj.a(k, $$1 ? M : G);
         case b:
            return fcj.a(j, $$1 ? L : o);
         case c:
            return fcj.a(i, $$1 ? O : I);
         case d:
            return fcj.a(h, $$1 ? N : H);
         case e:
            return fcj.a(g, $$1 ? Q : K);
         case f:
            return fcj.a(f, $$1 ? P : J);
      }
   }

   public dxh(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(c, dyo.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return ($$0.c(d) ? R : S)[$$0.c(a).ordinal()];
   }

   private boolean a(dxn $$0, dxn $$1) {
      dke $$2 = $$0.c(c) == dyo.a ? dkg.bF : dkg.by;
      return $$1.a($$2) && $$1.c(dxg.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      if (!$$0.C && $$3.gh().d) {
         jh $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jh $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      dxn $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dkg.bX) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if ($$0.a((dhd)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, eut.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk($$2.c(c) == dyo.b ? dkg.by : dkg.bF);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
