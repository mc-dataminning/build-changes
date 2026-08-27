public class abv implements yn<aay> {
   public static final ye<vr, abv> a = yn.a(abv::a, abv::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final crj g;

   public abv(int $$0, int $$1, int $$2, crj $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.r();
   }

   private abv(vr $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = crj.e.decode($$0);
   }

   private void a(vr $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      crj.e.encode($$0, this.g);
   }

   @Override
   public yp<abv> a() {
      return afj.w;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public crj f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
