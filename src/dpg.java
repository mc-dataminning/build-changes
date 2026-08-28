import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpg extends dlw implements djq {
   public static final MapCodec<dpg> c = b(dpg::new);
   public static final dxx d = dxo.aw;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fbv h = djn.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fbv i = djn.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fbv j = djn.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fbv k = djn.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fbv[] l = new fbv[]{djn.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fbv[] m = new fbv[]{j, djn.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dpg> a() {
      return c;
   }

   public dpg(dwx.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      return this.m();
   }

   @Override
   public fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return $$0.c(b) == dxt.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dxt.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : djp.a.m();
      }
   }

   @Override
   public boolean a(dwy $$0, dgm $$1, ji $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(djp.cK);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if ($$1 instanceof ard $$4 && $$3 instanceof cme && $$4.O().b(dgf.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dwy $$0, dah $$1) {
      return false;
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bvi $$3, cwq $$4) {
   }

   @Override
   public boolean f(dwy $$0) {
      return $$0.c(b) == dxt.b && !this.q($$0);
   }

   @Override
   public void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      float $$4 = dlj.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ard $$0, dwy $$1, ji $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dwy $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dxt.a), 3);
         }
      }
   }

   private static boolean a(dgm $$0, ji $$1) {
      dwy $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(djp.ld);
   }

   private static boolean b(dgm $$0, ji $$1) {
      return dlj.a($$0, $$1);
   }

   private static boolean o(dwy $$0) {
      return $$0.a(djp.ld) && $$0.c(b) == dxt.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dgm $$0, ji $$1, dwy $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dwy $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dpg.a c(dgm $$0, ji $$1, dwy $$2) {
      if (o($$2)) {
         return new dpg.a($$1, $$2);
      } else {
         ji $$3 = $$1.e();
         dwy $$4 = $$0.a_($$3);
         return o($$4) ? new dpg.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      dpg.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      dpg.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ji a, dwy b) {
   }
}
