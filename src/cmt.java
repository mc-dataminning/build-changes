import javax.annotation.Nullable;

public class cmt extends cmr implements bxh {
   private static final int b = 50;
   private static final int c = 70;
   private static final akg<Boolean> d = akk.a(cmt.class, aki.k);
   public static final String a = "sheared";

   public static bxw.a gq() {
      return cmr.j().a(bxx.s, 16.0);
   }

   public cmt(bwb<? extends cmt> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("sheared", this.gr());
   }

   @Override
   public void a(tw $$0) {
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
   protected btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(cyc.sW) && this.a()) {
         if (this.dV() instanceof arn $$3) {
            this.a($$3, awl.h, $$2);
            this.a(edm.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return btq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awj u() {
      return awk.cn;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.cp;
   }

   @Override
   protected awj l_() {
      return awk.co;
   }

   @Override
   protected awj m() {
      return awk.cr;
   }

   @Override
   protected cqp a(cxy $$0, float $$1, @Nullable cxy $$2) {
      cqp $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cqr $$4) {
         $$4.a(new buw(buy.s, 100));
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
   public void a(arn $$0, awl $$1, cxy $$2) {
      $$0.a(null, this, awk.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.w(true);
   }

   private void d(arn $$0, cxy $$1) {
      this.a($$0, exh.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dr()));
   }

   @Override
   public boolean a() {
      return !this.gr() && this.bK();
   }
}
