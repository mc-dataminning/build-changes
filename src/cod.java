import java.util.function.Predicate;

public abstract class cod extends bxm implements cnv {
   protected cod(bwo<? extends cod> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 5;
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   public void k_() {
      this.eZ();
      this.gt();
      super.k_();
   }

   protected void gt() {
      float $$0 = this.bx();
      if ($$0 > 0.5F) {
         this.bd += 2;
      }
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   protected awm aV() {
      return awn.nA;
   }

   @Override
   protected awm aW() {
      return awn.nz;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.nx;
   }

   @Override
   protected awm l_() {
      return awn.nw;
   }

   @Override
   public bxe.a eO() {
      return new bxe.a(awn.ny, awn.nv);
   }

   @Override
   public float a(iu $$0, djd $$1) {
      return -$$1.x($$0);
   }

   public static boolean a(djr $$0, iu $$1, azv $$2) {
      if ($$0.a(djj.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         eee $$3 = $$0.B_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(djj.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ag() ? $$0.c($$1, 10) : $$0.B($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bwo<? extends cod> $$0, djr $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.an() != bua.a && (bwn.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bwo<? extends cod> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.an() != bua.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static byj.a gu() {
      return bxg.E().a(byk.c);
   }

   @Override
   public boolean eo() {
      return true;
   }

   @Override
   protected boolean ep() {
      return true;
   }

   public boolean a(arq $$0, crc $$1) {
      return true;
   }

   @Override
   public czd d(czd $$0) {
      if ($$0.h() instanceof czy) {
         Predicate<czd> $$1 = ((czy)$$0.h()).c();
         czd $$2 = czy.a(this, $$1);
         return $$2.f() ? new czd(czh.pk) : $$2;
      } else {
         return czd.k;
      }
   }
}
