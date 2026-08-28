import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpe extends dlu implements djo {
   public static final MapCodec<dpe> c = b(dpe::new);
   public static final dxv d = dxm.aw;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fbt h = djl.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fbt i = djl.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fbt j = djl.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fbt k = djl.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fbt[] l = new fbt[]{djl.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fbt[] m = new fbt[]{j, djl.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dpe> a() {
      return c;
   }

   public dpe(dwv.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      return this.m();
   }

   @Override
   public fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return $$0.c(b) == dxr.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dxr.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : djn.a.m();
      }
   }

   @Override
   public boolean a(dww $$0, dgk $$1, ji $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(djn.cK);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if ($$1 instanceof ard $$4 && $$3 instanceof cmc && $$4.O().b(dgd.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dww $$0, daf $$1) {
      return false;
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, bvg $$3, cwo $$4) {
   }

   @Override
   public boolean f(dww $$0) {
      return $$0.c(b) == dxr.b && !this.q($$0);
   }

   @Override
   public void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      float $$4 = dlh.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ard $$0, dww $$1, ji $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dww $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dxr.a), 3);
         }
      }
   }

   private static boolean a(dgk $$0, ji $$1) {
      dww $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(djn.ld);
   }

   private static boolean b(dgk $$0, ji $$1) {
      return dlh.a($$0, $$1);
   }

   private static boolean o(dww $$0) {
      return $$0.a(djn.ld) && $$0.c(b) == dxr.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dgk $$0, ji $$1, dww $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dww $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dpe.a c(dgk $$0, ji $$1, dww $$2) {
      if (o($$2)) {
         return new dpe.a($$1, $$2);
      } else {
         ji $$3 = $$1.e();
         dww $$4 = $$0.a_($$3);
         return o($$4) ? new dpe.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      dpe.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      dpe.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ji a, dww b) {
   }
}
