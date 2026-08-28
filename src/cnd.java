import javax.annotation.Nullable;

public class cnd extends cnb implements bxp {
   private static final int b = 50;
   private static final int c = 70;
   private static final akh<Boolean> d = akl.a(cnd.class, akj.k);
   public static final String a = "sheared";

   public static bye.a gq() {
      return cnb.j().a(byf.s, 16.0);
   }

   public cnd(bwj<? extends cnd> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("sheared", this.gr());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gr() {
      return this.al.a(d);
   }

   public void w(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(cyw.sW) && this.a()) {
         if (this.dV() instanceof aro $$3) {
            this.a($$3, awm.h, $$2);
            this.a(eeo.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bty.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awk u() {
      return awl.cn;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.cp;
   }

   @Override
   protected awk l_() {
      return awl.co;
   }

   @Override
   protected awk m() {
      return awl.cr;
   }

   @Override
   protected cqz a(cys $$0, float $$1, @Nullable cys $$2) {
      cqz $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof crc $$4) {
         $$4.a(new bve(bvg.s, 100));
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
   public void a(aro $$0, awm $$1, cys $$2) {
      $$0.a(null, this, awl.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.w(true);
   }

   private void d(aro $$0, cys $$1) {
      this.a($$0, eyj.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dr()));
   }

   @Override
   public boolean a() {
      return !this.gr() && this.bK();
   }
}
