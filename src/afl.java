public class afl implements yv<abk> {
   public static final ym<vz, afl> a = yv.a(afl::a, afl::new);
   private final jr<avy> b;
   private final awa c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afl(jr<avy> $$0, awa $$1, buj $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ar();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afl(vz $$0) {
      this.b = avy.d.decode($$0);
      this.c = $$0.b(awa.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(vz $$0) {
      avy.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public yx<afl> a() {
      return agd.aV;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public jr<avy> b() {
      return this.b;
   }

   public awa e() {
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
