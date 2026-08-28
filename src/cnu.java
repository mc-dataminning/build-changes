import javax.annotation.Nullable;

public class cnu extends cns implements bxz {
   private static final int b = 50;
   private static final int c = 70;
   private static final akj<Boolean> d = akn.a(cnu.class, akl.k);
   public static final String a = "sheared";

   public static byo.a gt() {
      return cns.j().a(byp.s, 16.0);
   }

   public cnu(bwr<? extends cnu> $$0, djh $$1) {
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
      $$0.a("sheared", this.gu());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.o("sheared"));
   }

   public boolean gu() {
      return this.al.a(d);
   }

   public void w(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if ($$2.a(czo.td) && this.a()) {
         if (this.dU() instanceof arq $$3) {
            this.a($$3, awo.h, $$2);
            this.a(efo.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bug.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awm u() {
      return awn.cn;
   }

   @Override
   protected awm e(bux $$0) {
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
   protected crr a(czk $$0, float $$1, @Nullable czk $$2) {
      crr $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cru $$4) {
         $$4.a(new bvm(bvo.s, 100));
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
   public void a(arq $$0, awo $$1, czk $$2) {
      $$0.a(null, this, awn.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.w(true);
   }

   private void d(arq $$0, czk $$1) {
      this.a($$0, ezk.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dq()));
   }

   @Override
   public boolean a() {
      return !this.gu() && this.bI();
   }
}
