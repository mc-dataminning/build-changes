public class aeb implements xz<aai> {
   public static final xq<vd, aeb> a = xz.a(aeb::a, aeb::new);
   private final il<ato> b;
   private final atq c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public aeb(il<ato> $$0, atq $$1, bof $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.aj();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private aeb(vd $$0) {
      this.b = ato.d.decode($$0);
      this.c = $$0.b(atq.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(vd $$0) {
      ato.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public yb<aeb> a() {
      return aet.aR;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public il<ato> b() {
      return this.b;
   }

   public atq e() {
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
