import java.util.function.Predicate;

public abstract class cok extends bxr implements coc {
   protected cok(bwr<? extends cok> $$0, djh $$1) {
      super($$0, $$1);
      this.by = 5;
   }

   @Override
   public awo dl() {
      return awo.f;
   }

   @Override
   public void k_() {
      this.eY();
      this.gv();
      super.k_();
   }

   protected void gv() {
      float $$0 = this.bv();
      if ($$0 > 0.5F) {
         this.bd += 2;
      }
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   protected awm aT() {
      return awn.nA;
   }

   @Override
   protected awm aU() {
      return awn.nz;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.nx;
   }

   @Override
   protected awm l_() {
      return awn.nw;
   }

   @Override
   public bxj.a eN() {
      return new bxj.a(awn.ny, awn.nv);
   }

   @Override
   public float a(iv $$0, djk $$1) {
      return -$$1.x($$0);
   }

   public static boolean a(djy $$0, iv $$1, azv $$2) {
      if ($$0.a(djq.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         eel $$3 = $$0.B_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(djq.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ag() ? $$0.c($$1, 10) : $$0.B($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bwr<? extends cok> $$0, djy $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.an() != bud.a && (bwq.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bwr<? extends cok> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.an() != bud.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static byo.a gw() {
      return bxl.E().a(byp.c);
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected boolean eo() {
      return true;
   }

   public boolean a(arq $$0, crj $$1) {
      return true;
   }

   @Override
   public czk d(czk $$0) {
      if ($$0.h() instanceof daf) {
         Predicate<czk> $$1 = ((daf)$$0.h()).c();
         czk $$2 = daf.a(this, $$1);
         return $$2.f() ? new czk(czo.pk) : $$2;
      } else {
         return czk.k;
      }
   }
}
