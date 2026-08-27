public class ach implements yz<abk> {
   public static final yq<wd, ach> a = yz.a(ach::a, ach::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final csd g;

   public ach(int $$0, int $$1, int $$2, csd $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.r();
   }

   private ach(wd $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = csd.e.decode($$0);
   }

   private void a(wd $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      csd.e.encode($$0, this.g);
   }

   @Override
   public zb<ach> a() {
      return afv.w;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public csd f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
