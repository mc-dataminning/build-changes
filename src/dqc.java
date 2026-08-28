import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqc extends dmv implements dko {
   public static final MapCodec<dqc> c = b(dqc::new);
   public static final dyt d = dyk.au;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fcr h = dkl.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fcr i = dkl.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fcr j = dkl.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fcr k = dkl.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fcr[] l = new fcr[]{dkl.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fcr[] m = new fcr[]{j, dkl.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dqc> a() {
      return c;
   }

   public dqc(dxt.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      return this.m();
   }

   @Override
   public fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return $$0.c(b) == dyp.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dyp.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dkn.a.m();
      }
   }

   @Override
   public boolean a(dxu $$0, dhk $$1, jh $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a(dkn.cK);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if ($$1 instanceof ash $$4 && $$3 instanceof cnb && $$4.N().b(dhd.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dxu $$0, dbf $$1) {
      return false;
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bwf $$3, cxo $$4) {
   }

   @Override
   public boolean f(dxu $$0) {
      return $$0.c(b) == dyp.b && !this.q($$0);
   }

   @Override
   public void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      float $$4 = dmi.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ash $$0, dxu $$1, jh $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dxu $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dyp.a), 3);
         }
      }
   }

   private static boolean a(dhk $$0, jh $$1) {
      dxu $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dkn.kW);
   }

   private static boolean b(dhk $$0, jh $$1) {
      return dmi.a($$0, $$1);
   }

   private static boolean o(dxu $$0) {
      return $$0.a(dkn.kW) && $$0.c(b) == dyp.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dhk $$0, jh $$1, dxu $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dxu $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dqc.a d(dhk $$0, jh $$1, dxu $$2) {
      if (o($$2)) {
         return new dqc.a($$1, $$2);
      } else {
         jh $$3 = $$1.e();
         dxu $$4 = $$0.a_($$3);
         return o($$4) ? new dqc.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      dqc.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      dqc.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jh a, dxu b) {
   }
}
