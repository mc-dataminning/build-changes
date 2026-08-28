public class afw implements zk<abz> {
   public static final zb<wo, afw> a = zk.a(afw::a, afw::new);
   private final jn<awc> b;
   private final awe c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afw(jn<awc> $$0, awe $$1, btj $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ap();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afw(wo $$0) {
      this.b = awc.d.decode($$0);
      this.c = $$0.b(awe.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wo $$0) {
      awc.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zm<afw> a() {
      return ago.aS;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public jn<awc> b() {
      return this.b;
   }

   public awe e() {
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
