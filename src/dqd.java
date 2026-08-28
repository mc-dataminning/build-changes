import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqd extends dmw implements dkp {
   public static final MapCodec<dqd> c = b(dqd::new);
   public static final dyu d = dyl.au;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fcs h = dkm.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fcs i = dkm.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fcs j = dkm.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fcs k = dkm.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fcs[] l = new fcs[]{dkm.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fcs[] m = new fcs[]{j, dkm.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dqd> a() {
      return c;
   }

   public dqd(dxu.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      return this.m();
   }

   @Override
   public fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return $$0.c(b) == dyq.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dyq.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dko.a.m();
      }
   }

   @Override
   public boolean a(dxv $$0, dhl $$1, jh $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a(dko.cK);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if ($$1 instanceof ash $$4 && $$3 instanceof cnc && $$4.N().b(dhe.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dxv $$0, dbg $$1) {
      return false;
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bwg $$3, cxp $$4) {
   }

   @Override
   public boolean f(dxv $$0) {
      return $$0.c(b) == dyq.b && !this.q($$0);
   }

   @Override
   public void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      float $$4 = dmj.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ash $$0, dxv $$1, jh $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dxv $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dyq.a), 3);
         }
      }
   }

   private static boolean a(dhl $$0, jh $$1) {
      dxv $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dko.kW);
   }

   private static boolean b(dhl $$0, jh $$1) {
      return dmj.a($$0, $$1);
   }

   private static boolean o(dxv $$0) {
      return $$0.a(dko.kW) && $$0.c(b) == dyq.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dhl $$0, jh $$1, dxv $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dxv $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dqd.a d(dhl $$0, jh $$1, dxv $$2) {
      if (o($$2)) {
         return new dqd.a($$1, $$2);
      } else {
         jh $$3 = $$1.e();
         dxv $$4 = $$0.a_($$3);
         return o($$4) ? new dqd.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      dqd.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      dqd.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jh a, dxv b) {
   }
}
