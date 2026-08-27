public class ael implements wu<acw> {
   private final int a;
   private final cmh b;

   public ael(int $$0, cmh $$1) {
      this.a = $$0;
      this.b = $$1.p();
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   public ael(ue $$0) {
      this.a = $$0.readShort();
      this.b = $$0.r();
   }

   @Override
   public void a(ue $$0) {
      $$0.l(this.a);
      $$0.a(this.b);
   }

   public int a() {
      return this.a;
   }

   public cmh d() {
      return this.b;
   }
}
