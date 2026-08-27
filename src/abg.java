public class abg implements yp<aba> {
   public static final yg<vi, abg> a = yp.a(abg::a, abg::new);
   private final int b;
   private final id c;
   private final int d;

   public abg(int $$0, id $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abg(vi $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public yr<abg> a() {
      return afl.h;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public id e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
