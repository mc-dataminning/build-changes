public class abx implements ux<aaw> {
   private final int a;
   private final aer b;
   private final boolean c;

   public abx(int $$0, cmb<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.e();
      this.c = $$2;
   }

   public abx(si $$0) {
      this.a = $$0.readByte();
      this.b = $$0.s();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(si $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public aer d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
