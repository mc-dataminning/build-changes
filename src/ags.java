public class ags implements aac<acr> {
   public static final zt<xg, ags> a = aac.a(ags::a, ags::new);
   private final jq<axe> b;
   private final axg c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public ags(jq<axe> $$0, axg $$1, bvk $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ar();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private ags(xg $$0) {
      this.b = axe.d.decode($$0);
      this.c = $$0.b(axg.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(xg $$0) {
      axe.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public aae<ags> a() {
      return ahk.aV;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public jq<axe> b() {
      return this.b;
   }

   public axg e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public long i() {
      return this.g;
   }
}
