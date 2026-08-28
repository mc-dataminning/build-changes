import javax.annotation.Nullable;

public class coi extends cog implements byk {
   private static final int a = 50;
   private static final int b = 70;
   private static final akl<Boolean> c = akp.a(coi.class, akn.k);
   private static final String d = "sheared";
   private static final boolean e = false;

   public static byz.a gu() {
      return cog.j().a(bza.s, 16.0);
   }

   public coi(bxc<? extends coi> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("sheared", this.gv());
   }

   @Override
   public void a(tz $$0) {
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
   protected bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(dac.td) && this.a()) {
         if (this.dV() instanceof ars $$3) {
            this.a($$3, awq.h, $$2);
            this.a(ege.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bur.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awo u() {
      return awp.cn;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.cp;
   }

   @Override
   protected awo l_() {
      return awp.co;
   }

   @Override
   protected awo m() {
      return awp.cr;
   }

   @Override
   protected csf a(czy $$0, float $$1, @Nullable czy $$2) {
      csf $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof csi $$4) {
         $$4.a(new bvx(bvz.s, 100));
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
   public void a(ars $$0, awq $$1, czy $$2) {
      $$0.a(null, this, awp.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.w(true);
   }

   private void d(ars $$0, czy $$1) {
      this.a($$0, fad.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dr()));
   }

   @Override
   public boolean a() {
      return !this.gv() && this.bJ();
   }
}
