public class aef implements yb<aam> {
   public static final xs<vf, aef> a = yb.a(aef::a, aef::new);
   private final il<atx> b;
   private final atz c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public aef(il<atx> $$0, atz $$1, bow $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.aj();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private aef(vf $$0) {
      this.b = atx.d.decode($$0);
      this.c = $$0.b(atz.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(vf $$0) {
      atx.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public yd<aef> a() {
      return aex.aR;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public il<atx> b() {
      return this.b;
   }

   public atz e() {
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
