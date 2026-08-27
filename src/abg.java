public class abg implements yn<aay> {
   public static final ye<vr, abg> a = yn.a(abg::a, abg::new);
   private final ib b;
   private final int c;
   private final int d;
   private final dby e;

   public abg(ib $$0, dby $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private abg(vr $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yc.a(ks.f).decode($$0);
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      yc.a(ks.f).encode($$0, this.e);
   }

   @Override
   public yp<abg> a() {
      return afj.j;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dby g() {
      return this.e;
   }
}
