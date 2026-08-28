import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpd extends dlt implements djn {
   public static final MapCodec<dpd> c = b(dpd::new);
   public static final dxu d = dxl.aw;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fbs h = djk.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fbs i = djk.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fbs j = djk.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fbs k = djk.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fbs[] l = new fbs[]{djk.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fbs[] m = new fbs[]{j, djk.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dpd> a() {
      return c;
   }

   public dpd(dwu.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      return this.m();
   }

   @Override
   public fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return $$0.c(b) == dxq.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dxq.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : djm.a.m();
      }
   }

   @Override
   public boolean a(dwv $$0, dgj $$1, ji $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a(djm.cK);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if ($$1 instanceof arc $$4 && $$3 instanceof cmb && $$4.O().b(dgc.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dwv $$0, dae $$1) {
      return false;
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, bvf $$3, cwn $$4) {
   }

   @Override
   public boolean f(dwv $$0) {
      return $$0.c(b) == dxq.b && !this.q($$0);
   }

   @Override
   public void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      float $$4 = dlg.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arc $$0, dwv $$1, ji $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dwv $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dxq.a), 3);
         }
      }
   }

   private static boolean a(dgj $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(djm.ld);
   }

   private static boolean b(dgj $$0, ji $$1) {
      return dlg.a($$0, $$1);
   }

   private static boolean o(dwv $$0) {
      return $$0.a(djm.ld) && $$0.c(b) == dxq.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dgj $$0, ji $$1, dwv $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dwv $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dpd.a c(dgj $$0, ji $$1, dwv $$2) {
      if (o($$2)) {
         return new dpd.a($$1, $$2);
      } else {
         ji $$3 = $$1.e();
         dwv $$4 = $$0.a_($$3);
         return o($$4) ? new dpd.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      dpd.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      dpd.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ji a, dwv b) {
   }
}
