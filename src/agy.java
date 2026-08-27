public class agy implements zl<agl> {
   public static final zc<we, agy> a = zl.a(agy::a, agy::new);
   private final int b;
   private final int c;

   public agy(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agy(we $$0) {
      this.b = $$0.readByte();
      this.c = $$0.readByte();
   }

   private void a(we $$0) {
      $$0.k(this.b);
      $$0.k(this.c);
   }

   @Override
   public zn<agy> a() {
      return agj.br;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
