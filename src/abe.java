public class abe implements xz<aai> {
   public static final xq<us, abe> a = xz.a(abe::a, abe::new);
   private final int b;
   private final int c;
   private final int d;

   public abe(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abe(us $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   private void a(us $$0) {
      $$0.k(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
   }

   @Override
   public yb<abe> a() {
      return aet.v;
   }

   public void a(aai $$0) {
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
