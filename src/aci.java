public class aci implements ux<aaw> {
   private final int a;

   public aci(int $$0) {
      this.a = $$0;
   }

   public aci(si $$0) {
      this.a = $$0.readShort();
   }

   @Override
   public void a(si $$0) {
      $$0.l(this.a);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }
}
