import javax.annotation.Nullable;

public class cjg extends cih implements cip {
   public static final cjg.a e = new cjg.a();

   public cjg(bol<? extends cjg> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cjg(bol<? extends cjg> $$0, cgc $$1, cwe $$2) {
      super($$0, $$1.do(), $$1.gn(), $$1.du(), $$2);
      this.b($$1);
   }

   @Override
   protected eoq aq() {
      float $$0 = this.ai().n().a() / 2.0F;
      float $$1 = this.ai().n().b();
      float $$2 = 0.15F;
      return new eoq(
         this.dh().c - (double)$$0,
         this.dh().d - 0.15F,
         this.dh().e - (double)$$0,
         this.dh().c + (double)$$0,
         this.dh().d - 0.15F + (double)$$1,
         this.dh().e + (double)$$0
      );
   }

   @Override
   public boolean h(bof $$0) {
      return $$0 instanceof cjg ? false : super.h($$0);
   }

   @Override
   protected boolean a(bof $$0) {
      return $$0 instanceof cjg ? false : super.a($$0);
   }

   @Override
   protected void a(eos $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         $$0.a().a(this.dK().c(this, this.w() instanceof box $$1 ? $$1 : null), 1.0F);
         this.z();
      }
   }

   private void z() {
      this.dJ().a(this, null, e, this.do(), this.dq(), this.du(), (float)(3.0 + this.af.j()), false, cwe.a.e, kb.y, kb.z, atp.BH);
   }

   @Override
   protected void a(eor $$0) {
      super.a($$0);
      this.z();
      this.am();
   }

   @Override
   protected void a(eot $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         this.am();
      }
   }

   @Override
   protected boolean s() {
      return false;
   }

   @Override
   public cpq q() {
      return cpq.h;
   }

   @Override
   protected float x() {
      return 1.0F;
   }

   @Override
   protected float y() {
      return this.x();
   }

   @Nullable
   @Override
   protected jz u() {
      return null;
   }

   @Override
   protected cvn.a ah_() {
      return cvn.a.b;
   }

   public static final class a extends cvx {
      @Override
      public boolean a(cvw $$0, bof $$1) {
         return false;
      }
   }
}
