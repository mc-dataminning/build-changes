import java.util.function.Predicate;

public abstract class coz extends byc implements cor {
   protected coz(bxc<? extends coz> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @Override
   public awq dm() {
      return awq.f;
   }

   @Override
   public void k_() {
      this.eZ();
      this.gw();
      super.k_();
   }

   protected void gw() {
      float $$0 = this.bw();
      if ($$0 > 0.5F) {
         this.bd += 2;
      }
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   protected awo aU() {
      return awp.nA;
   }

   @Override
   protected awo aV() {
      return awp.nz;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.nx;
   }

   @Override
   protected awo l_() {
      return awp.nw;
   }

   @Override
   public bxu.a eO() {
      return new bxu.a(awp.ny, awp.nv);
   }

   @Override
   public float a(iv $$0, dka $$1) {
      return -$$1.x($$0);
   }

   public static boolean a(dko $$0, iv $$1, azx $$2) {
      if ($$0.a(dkg.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         efb $$3 = $$0.F_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dkg.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ag() ? $$0.c($$1, 10) : $$0.B($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bxc<? extends coz> $$0, dko $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.an() != buo.a && (bxb.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bxc<? extends coz> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.an() != buo.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static byz.a gx() {
      return bxw.E().a(bza.c);
   }

   @Override
   public boolean eo() {
      return true;
   }

   @Override
   protected boolean ep() {
      return true;
   }

   public boolean a(ars $$0, crx $$1) {
      return true;
   }

   @Override
   public czy d(czy $$0) {
      if ($$0.h() instanceof dat) {
         Predicate<czy> $$1 = ((dat)$$0.h()).c();
         czy $$2 = dat.a(this, $$1);
         return $$2.f() ? new czy(dac.pk) : $$2;
      } else {
         return czy.k;
      }
   }
}
