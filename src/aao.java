public class aao implements xz<aai> {
   public static final xq<us, aao> a = xz.a(aao::a, aao::new);
   private final int b;
   private final ib c;
   private final int d;

   public aao(int $$0, ib $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aao(us $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(us $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public yb<aao> a() {
      return aet.h;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ib e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
