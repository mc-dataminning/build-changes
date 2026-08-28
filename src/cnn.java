import javax.annotation.Nullable;

public class cnn extends cnl implements bxu {
   private static final int b = 50;
   private static final int c = 70;
   private static final akj<Boolean> d = akn.a(cnn.class, akl.k);
   public static final String a = "sheared";

   public static byj.a gr() {
      return cnl.j().a(byk.s, 16.0);
   }

   public cnn(bwo<? extends cnn> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("sheared", this.gs());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gs() {
      return this.al.a(d);
   }

   public void w(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(czh.td) && this.a()) {
         if (this.dV() instanceof arq $$3) {
            this.a($$3, awo.h, $$2);
            this.a(efh.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bud.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awm u() {
      return awn.cn;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.cp;
   }

   @Override
   protected awm l_() {
      return awn.co;
   }

   @Override
   protected awm m() {
      return awn.cr;
   }

   @Override
   protected crk a(czd $$0, float $$1, @Nullable czd $$2) {
      crk $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof crn $$4) {
         $$4.a(new bvj(bvl.s, 100));
      }

      return $$3;
   }

   @Override
   protected int q() {
      return 50;
   }

   @Override
   protected int t() {
      return 70;
   }

   @Override
   public void a(arq $$0, awo $$1, czd $$2) {
      $$0.a(null, this, awn.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.w(true);
   }

   private void d(arq $$0, czd $$1) {
      this.a($$0, ezd.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dr()));
   }

   @Override
   public boolean a() {
      return !this.gs() && this.bK();
   }
}
