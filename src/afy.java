public class afy implements zs<ace> {
   public static final zj<ww, afy> a = zs.a(afy::a, afy::new);
   private final ji<avv> b;
   private final avx c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afy(ji<avv> $$0, avx $$1, bsp $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.al();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afy(ww $$0) {
      this.b = avv.d.decode($$0);
      this.c = $$0.b(avx.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(ww $$0) {
      avv.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zu<afy> a() {
      return agq.aR;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public ji<avv> b() {
      return this.b;
   }

   public avx e() {
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
