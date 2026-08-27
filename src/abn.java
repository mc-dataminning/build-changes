public class abn implements xx<aag> {
   public static final xo<uq, abn> a = xx.a(abn::a, abn::new);
   private final int b;
   private final int c;
   private final int d;

   public abn(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abn(uq $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.n();
      this.d = $$0.readInt();
   }

   private void a(uq $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.p(this.d);
   }

   @Override
   public xz<abn> a() {
      return aeq.G;
   }

   public void a(aag $$0) {
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
