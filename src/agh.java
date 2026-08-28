public class agh implements zr<acg> {
   public static final zi<wv, agh> a = zr.a(agh::a, agh::new);
   private final jq<awu> b;
   private final aww c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public agh(jq<awu> $$0, aww $$1, bvb $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ar();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private agh(wv $$0) {
      this.b = awu.d.decode($$0);
      this.c = $$0.b(aww.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wv $$0) {
      awu.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zt<agh> a() {
      return agz.aV;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public jq<awu> b() {
      return this.b;
   }

   public aww e() {
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
