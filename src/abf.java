public class abf implements xz<aai> {
   public static final xq<vd, abf> a = xz.a(abf::a, abf::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final cpq g;

   public abf(int $$0, int $$1, int $$2, cpq $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.q();
   }

   private abf(vd $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = cpq.f.decode($$0);
   }

   private void a(vd $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      cpq.f.encode($$0, this.g);
   }

   @Override
   public yb<abf> a() {
      return aet.w;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public cpq f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
