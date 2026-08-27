public class aci implements yp<aba> {
   public static final yg<vi, aci> a = yp.a(aci::a, aci::new);
   private final int b;
   private final int c;
   private final int d;

   public aci(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aci(vi $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = $$0.readInt();
   }

   private void a(vi $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.p(this.d);
   }

   @Override
   public yr<aci> a() {
      return afl.H;
   }

   public void a(aba $$0) {
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
