public class aax implements xf<za> {
   private final int a;
   private final ahg b;

   public aax(int $$0, cqd<?> $$1) {
      this.a = $$0;
      this.b = $$1.a();
   }

   public aax(ui $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
   }

   @Override
   public void a(ui $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public ahg a() {
      return this.b;
   }

   public int d() {
      return this.a;
   }
}
