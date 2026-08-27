public class abj implements yb<aam> {
   public static final xs<vf, abj> a = yb.a(abj::a, abj::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final cqm g;

   public abj(int $$0, int $$1, int $$2, cqm $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.q();
   }

   private abj(vf $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = cqm.f.decode($$0);
   }

   private void a(vf $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      cqm.f.encode($$0, this.g);
   }

   @Override
   public yd<abj> a() {
      return aex.w;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public cqm f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
