public class afw implements xz<aev> {
   public static final xq<us, afw> a = xz.a(afw::a, afw::new);
   private final int b;
   private final ajc c;
   private final boolean d;

   public afw(int $$0, csu<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private afw(us $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(us $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yb<afw> a() {
      return aet.bG;
   }

   public void a(aev $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ajc e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
