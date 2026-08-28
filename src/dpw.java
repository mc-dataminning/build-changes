import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpw extends dmm implements dkg {
   public static final MapCodec<dpw> c = b(dpw::new);
   public static final dyn d = dye.aw;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fcl h = dkd.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fcl i = dkd.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fcl j = dkd.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fcl k = dkd.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fcl[] l = new fcl[]{dkd.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fcl[] m = new fcl[]{j, dkd.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dpw> a() {
      return c;
   }

   public dpw(dxn.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      return this.m();
   }

   @Override
   public fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return $$0.c(b) == dyj.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dyj.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dkf.a.m();
      }
   }

   @Override
   public boolean a(dxo $$0, dhc $$1, jh $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(dkf.cK);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if ($$1 instanceof arx $$4 && $$3 instanceof cmt && $$4.O().b(dgv.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dxo $$0, dax $$1) {
      return false;
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvx $$3, cxg $$4) {
   }

   @Override
   public boolean f(dxo $$0) {
      return $$0.c(b) == dyj.b && !this.q($$0);
   }

   @Override
   public void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      float $$4 = dlz.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arx $$0, dxo $$1, jh $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dxo $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dyj.a), 3);
         }
      }
   }

   private static boolean a(dhc $$0, jh $$1) {
      dxo $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dkf.ld);
   }

   private static boolean b(dhc $$0, jh $$1) {
      return dlz.a($$0, $$1);
   }

   private static boolean o(dxo $$0) {
      return $$0.a(dkf.ld) && $$0.c(b) == dyj.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dhc $$0, jh $$1, dxo $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dxo $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dpw.a d(dhc $$0, jh $$1, dxo $$2) {
      if (o($$2)) {
         return new dpw.a($$1, $$2);
      } else {
         jh $$3 = $$1.e();
         dxo $$4 = $$0.a_($$3);
         return o($$4) ? new dpw.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      dpw.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      dpw.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jh a, dxo b) {
   }
}
