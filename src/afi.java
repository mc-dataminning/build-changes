public class afi implements xz<aev> {
   public static final xq<us, afi> a = xz.a(afi::a, afi::new);
   private final int b;
   private final int c;

   public afi(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afi(us $$0) {
      this.b = $$0.readByte();
      this.c = $$0.readByte();
   }

   private void a(us $$0) {
      $$0.k(this.b);
      $$0.k(this.c);
   }

   @Override
   public yb<afi> a() {
      return aet.bp;
   }

   public void a(aev $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
