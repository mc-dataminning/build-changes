public class acr implements ve<abd> {
   private final int a;
   private final cjf b;

   public acr(int $$0, cjf $$1) {
      this.a = $$0;
      this.b = $$1.p();
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public acr(sp $$0) {
      this.a = $$0.readShort();
      this.b = $$0.q();
   }

   @Override
   public void a(sp $$0) {
      $$0.l(this.a);
      $$0.a(this.b);
   }

   public int a() {
      return this.a;
   }

   public cjf d() {
      return this.b;
   }
}
