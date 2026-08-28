import javax.annotation.Nullable;

public class cou extends cos implements byv {
   private static final int a = 50;
   private static final int b = 70;
   private static final aku<Boolean> c = aky.a(cou.class, akw.k);
   private static final String d = "sheared";
   private static final boolean e = false;

   public static bzk.a gu() {
      return cos.j().a(bzl.s, 16.0);
   }

   public cou(bxn<? extends cou> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("sheared", this.gv());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("sheared", false));
   }

   public boolean gv() {
      return this.al.a(c);
   }

   public void w(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   protected bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(dao.td) && this.a()) {
         if (this.dV() instanceof asb $$3) {
            this.a($$3, awz.h, $$2);
            this.a(egq.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bvc.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awx u() {
      return awy.cn;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.cp;
   }

   @Override
   protected awx l_() {
      return awy.co;
   }

   @Override
   protected awx m() {
      return awy.cr;
   }

   @Override
   protected csq a(dak $$0, float $$1, @Nullable dak $$2) {
      csq $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cst $$4) {
         $$4.a(new bwi(bwk.s, 100));
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
   public void a(asb $$0, awz $$1, dak $$2) {
      $$0.a(null, this, awy.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.w(true);
   }

   private void d(asb $$0, dak $$1) {
      this.a($$0, fap.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dr()));
   }

   @Override
   public boolean a() {
      return !this.gv() && this.bJ();
   }
}
