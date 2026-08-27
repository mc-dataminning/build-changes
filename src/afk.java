public class afk implements ze<abq> {
   public static final yv<wi, afk> a = ze.a(afk::a, afk::new);
   private final ix<avh> b;
   private final avj c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afk(ix<avh> $$0, avj $$1, brw $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.al();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afk(wi $$0) {
      this.b = avh.d.decode($$0);
      this.c = $$0.b(avj.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wi $$0) {
      avh.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zg<afk> a() {
      return agc.aR;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public ix<avh> b() {
      return this.b;
   }

   public avj e() {
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
