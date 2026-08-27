public class adf implements zl<abw> {
   public static final zc<we, adf> a = zl.a(adf::a, adf::new);
   private final int b;
   private final int c;
   private final int d;

   public adf(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private adf(we $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = $$0.readInt();
   }

   private void a(we $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.p(this.d);
   }

   @Override
   public zn<adf> a() {
      return agj.I;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
