import javax.annotation.Nullable;

public class bwi extends cjh {
   private static final akg<Integer> bM = akk.a(bwi.class, aki.b);

   public bwi(bwb<? extends bwi> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected lt q() {
      return lv.aS;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bM, 0);
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      return bwb.ag.a($$0, bwa.e);
   }

   @Override
   protected awj t() {
      return awk.lj;
   }

   @Override
   protected awj u() {
      return awk.lg;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.li;
   }

   @Override
   protected awj l_() {
      return awk.lh;
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.s($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void k_() {
      super.k_();
      int $$0 = this.x();
      if ($$0 > 0) {
         this.s($$0 - 1);
      }

      this.dV().a(lv.aT, this.d(0.6), this.dD(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(bM, $$0);
   }

   public int x() {
      return this.al.a(bM);
   }

   public static boolean a(bwb<? extends bwr> $$0, dig $$1, bwa $$2, jj $$3, azs $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dkw.J);
   }
}
