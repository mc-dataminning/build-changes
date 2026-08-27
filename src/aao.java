public class aao implements uo<zb> {
   private final int a;

   public aao(int $$0) {
      this.a = $$0;
   }

   public aao(sf $$0) {
      this.a = $$0.readShort();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeShort(this.a);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }
}
