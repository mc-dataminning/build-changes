public class afq implements zl<abw> {
   public static final zc<wp, afq> a = zl.a(afq::a, afq::new);
   private final ja<avn> b;
   private final avq c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afq(ja<avn> $$0, avq $$1, brv $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.al();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afq(wp $$0) {
      this.b = avn.d.decode($$0);
      this.c = $$0.b(avq.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wp $$0) {
      avn.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zn<afq> a() {
      return agj.aS;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public ja<avn> b() {
      return this.b;
   }

   public avq e() {
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
