public class aee implements wo<acp> {
   private final int a;
   private final clo b;

   public aee(int $$0, clo $$1) {
      this.a = $$0;
      this.b = $$1.p();
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public aee(ty $$0) {
      this.a = $$0.readShort();
      this.b = $$0.r();
   }

   @Override
   public void a(ty $$0) {
      $$0.l(this.a);
      $$0.a(this.b);
   }

   public int a() {
      return this.a;
   }

   public clo d() {
      return this.b;
   }
}
