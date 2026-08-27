public class abv implements uw<aav> {
   private final int a;
   private final aep b;
   private final boolean c;

   public abv(int $$0, clz<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.e();
      this.c = $$2;
   }

   public abv(sh $$0) {
      this.a = $$0.readByte();
      this.b = $$0.s();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sh $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public aep d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
