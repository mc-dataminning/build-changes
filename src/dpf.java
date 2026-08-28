import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpf extends dlv implements djp {
   public static final MapCodec<dpf> c = b(dpf::new);
   public static final dxw d = dxn.aw;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fbu h = djm.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fbu i = djm.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fbu j = djm.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fbu k = djm.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fbu[] l = new fbu[]{djm.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fbu[] m = new fbu[]{j, djm.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dpf> a() {
      return c;
   }

   public dpf(dww.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      return this.m();
   }

   @Override
   public fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return $$0.c(b) == dxs.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dxs.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : djo.a.m();
      }
   }

   @Override
   public boolean a(dwx $$0, dgl $$1, ji $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(djo.cK);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
      if ($$1 instanceof arc $$4 && $$3 instanceof cmc && $$4.O().b(dge.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dwx $$0, dag $$1) {
      return false;
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, bvg $$3, cwp $$4) {
   }

   @Override
   public boolean f(dwx $$0) {
      return $$0.c(b) == dxs.b && !this.q($$0);
   }

   @Override
   public void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      float $$4 = dli.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arc $$0, dwx $$1, ji $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dwx $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dxs.a), 3);
         }
      }
   }

   private static boolean a(dgl $$0, ji $$1) {
      dwx $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(djo.ld);
   }

   private static boolean b(dgl $$0, ji $$1) {
      return dli.a($$0, $$1);
   }

   private static boolean o(dwx $$0) {
      return $$0.a(djo.ld) && $$0.c(b) == dxs.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dgl $$0, ji $$1, dwx $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dwx $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dpf.a c(dgl $$0, ji $$1, dwx $$2) {
      if (o($$2)) {
         return new dpf.a($$1, $$2);
      } else {
         ji $$3 = $$1.e();
         dwx $$4 = $$0.a_($$3);
         return o($$4) ? new dpf.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      dpf.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      dpf.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ji a, dwx b) {
   }
}
