public class aet implements yp<aba> {
   public static final yg<vt, aet> a = yp.a(aet::a, aet::new);
   private final in<aun> b;
   private final aup c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public aet(in<aun> $$0, aup $$1, bqa $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.aj();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private aet(vt $$0) {
      this.b = aun.d.decode($$0);
      this.c = $$0.b(aup.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(vt $$0) {
      aun.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public yr<aet> a() {
      return afl.aR;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public in<aun> b() {
      return this.b;
   }

   public aup e() {
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
