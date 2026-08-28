import java.util.function.Predicate;

public abstract class cpb extends bye implements cot {
   protected cpb(bxe<? extends cpb> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @Override
   public aws dm() {
      return aws.f;
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
   protected awq aU() {
      return awr.nA;
   }

   @Override
   protected awq aV() {
      return awr.nz;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.nx;
   }

   @Override
   protected awq l_() {
      return awr.nw;
   }

   @Override
   public bxw.a eO() {
      return new bxw.a(awr.ny, awr.nv);
   }

   @Override
   public float a(iw $$0, dkc $$1) {
      return -$$1.x($$0);
   }

   public static boolean a(dkq $$0, iw $$1, azz $$2) {
      if ($$0.a(dki.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         efd $$3 = $$0.F_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dki.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ag() ? $$0.c($$1, 10) : $$0.B($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bxe<? extends cpb> $$0, dkq $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.an() != buq.a && (bxd.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bxe<? extends cpb> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.an() != buq.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bzb.a gx() {
      return bxy.E().a(bzc.c);
   }

   @Override
   public boolean eo() {
      return true;
   }

   @Override
   protected boolean ep() {
      return true;
   }

   public boolean a(aru $$0, crz $$1) {
      return true;
   }

   @Override
   public daa d(daa $$0) {
      if ($$0.h() instanceof dav) {
         Predicate<daa> $$1 = ((dav)$$0.h()).c();
         daa $$2 = dav.a(this, $$1);
         return $$2.f() ? new daa(dae.pk) : $$2;
      } else {
         return daa.k;
      }
   }
}
