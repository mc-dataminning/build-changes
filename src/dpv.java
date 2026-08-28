import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpv extends dmo implements dkh {
   public static final MapCodec<dpv> c = b(dpv::new);
   public static final dym d = dyd.au;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fcm h = dke.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fcm i = dke.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fcm j = dke.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fcm k = dke.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fcm[] l = new fcm[]{dke.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fcm[] m = new fcm[]{j, dke.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dpv> a() {
      return c;
   }

   public dpv(dxm.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      return this.m();
   }

   @Override
   public fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return $$0.c(b) == dyi.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dyi.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dkg.a.m();
      }
   }

   @Override
   public boolean a(dxn $$0, dhd $$1, jh $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(dkg.cK);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if ($$1 instanceof ash $$4 && $$3 instanceof cmx && $$4.N().b(dgw.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dxn $$0, dbb $$1) {
      return false;
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bwb $$3, cxk $$4) {
   }

   @Override
   public boolean f(dxn $$0) {
      return $$0.c(b) == dyi.b && !this.q($$0);
   }

   @Override
   public void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      float $$4 = dmb.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ash $$0, dxn $$1, jh $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dxn $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dyi.a), 3);
         }
      }
   }

   private static boolean a(dhd $$0, jh $$1) {
      dxn $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dkg.kW);
   }

   private static boolean b(dhd $$0, jh $$1) {
      return dmb.a($$0, $$1);
   }

   private static boolean o(dxn $$0) {
      return $$0.a(dkg.kW) && $$0.c(b) == dyi.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dhd $$0, jh $$1, dxn $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dxn $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dpv.a d(dhd $$0, jh $$1, dxn $$2) {
      if (o($$2)) {
         return new dpv.a($$1, $$2);
      } else {
         jh $$3 = $$1.e();
         dxn $$4 = $$0.a_($$3);
         return o($$4) ? new dpv.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      dpv.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      dpv.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jh a, dxn b) {
   }
}
