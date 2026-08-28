import javax.annotation.Nullable;

public class cjr extends buk {
   public final cju a;
   public final String b;
   private final bun c;

   public cjr(cju $$0, String $$1, float $$2, float $$3) {
      super($$0.aq(), $$0.dW());
      this.c = bun.b($$2, $$3);
      this.m_();
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   protected void a(akb.a $$0) {
   }

   @Override
   protected void a(tq $$0) {
   }

   @Override
   protected void b(tq $$0) {
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Nullable
   @Override
   public cwp dJ() {
      return this.a.dJ();
   }

   @Override
   public final boolean a(arc $$0, bta $$1, float $$2) {
      return this.d($$1) ? false : this.a.a($$0, this, $$1, $$2);
   }

   @Override
   public boolean u(buk $$0) {
      return this == $$0 || this.a == $$0;
   }

   @Override
   public yv<abk> a(ara $$0) {
      throw new UnsupportedOperationException();
   }

   @Override
   public bun a(bvs $$0) {
      return this.c;
   }

   @Override
   public boolean dU() {
      return false;
   }
}
