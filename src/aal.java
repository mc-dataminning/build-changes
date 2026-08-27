public class aal implements wu<yo> {
   private final int a;
   private final agt b;

   public aal(int $$0, cpn<?> $$1) {
      this.a = $$0;
      this.b = $$1.a();
   }

   public aal(ue $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
   }

   @Override
   public void a(ue $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public agt a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
