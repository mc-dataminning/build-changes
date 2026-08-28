import java.util.function.Predicate;

public abstract class cpk extends byn implements cpc {
   protected cpk(bxn<? extends cpk> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @Override
   public awz dm() {
      return awz.f;
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
   protected awx aU() {
      return awy.nA;
   }

   @Override
   protected awx aV() {
      return awy.nz;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.nx;
   }

   @Override
   protected awx l_() {
      return awy.nw;
   }

   @Override
   public byf.a eO() {
      return new byf.a(awy.ny, awy.nv);
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      return -$$1.x($$0);
   }

   public static boolean a(dla $$0, iw $$1, bai $$2) {
      if ($$0.a(dks.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         efn $$3 = $$0.F_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dks.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ag() ? $$0.c($$1, 10) : $$0.B($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bxn<? extends cpk> $$0, dla $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.an() != buz.a && (bxm.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bxn<? extends cpk> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.an() != buz.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bzk.a gx() {
      return byh.E().a(bzl.c);
   }

   @Override
   public boolean eo() {
      return true;
   }

   @Override
   protected boolean ep() {
      return true;
   }

   public boolean a(asb $$0, csi $$1) {
      return true;
   }

   @Override
   public dak d(dak $$0) {
      if ($$0.h() instanceof dbf) {
         Predicate<dak> $$1 = ((dbf)$$0.h()).c();
         dak $$2 = dbf.a(this, $$1);
         return $$2.f() ? new dak(dao.pk) : $$2;
      } else {
         return dak.l;
      }
   }
}
