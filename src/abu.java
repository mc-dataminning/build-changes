public class abu implements yb<aam> {
   public static final xs<uu, abu> a = yb.a(abu::a, abu::new);
   private final int b;
   private final int c;
   private final int d;

   public abu(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abu(uu $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = $$0.readInt();
   }

   private void a(uu $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.p(this.d);
   }

   @Override
   public yd<abu> a() {
      return aex.H;
   }

   public void a(aam $$0) {
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
