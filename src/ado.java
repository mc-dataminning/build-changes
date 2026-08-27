public class ado implements wb<aca> {
   private final int a;
   private final ckj b;

   public ado(int $$0, ckj $$1) {
      this.a = $$0;
      this.b = $$1.p();
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public ado(tl $$0) {
      this.a = $$0.readShort();
      this.b = $$0.r();
   }

   @Override
   public void a(tl $$0) {
      $$0.l(this.a);
      $$0.a(this.b);
   }

   public int a() {
      return this.a;
   }

   public ckj d() {
      return this.b;
   }
}
