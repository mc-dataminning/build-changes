public class acn implements ze<abq> {
   public static final yv<wi, acn> a = ze.a(acn::a, acn::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final cto g;

   public acn(int $$0, int $$1, int $$2, cto $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.s();
   }

   private acn(wi $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = cto.e.decode($$0);
   }

   private void a(wi $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      cto.e.encode($$0, this.g);
   }

   @Override
   public zg<acn> a() {
      return agb.w;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public cto f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
