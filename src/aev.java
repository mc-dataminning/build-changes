public class aev implements xf<adj> {
   private final int a;

   public aev(int $$0) {
      this.a = $$0;
   }

   public aev(ui $$0) {
      this.a = $$0.readShort();
   }

   @Override
   public void a(ui $$0) {
      $$0.l(this.a);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }
}
