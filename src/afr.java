public class afr implements zc<abr> {
   public static final yt<wg, afr> a = zc.a(afr::a, afr::new);
   private final js<awj> b;
   private final awl c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afr(js<awj> $$0, awl $$1, bvs $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ar();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afr(wg $$0) {
      this.b = awj.d.decode($$0);
      this.c = $$0.b(awl.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wg $$0) {
      awj.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public ze<afr> a() {
      return agk.aV;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public js<awj> b() {
      return this.b;
   }

   public awl e() {
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
