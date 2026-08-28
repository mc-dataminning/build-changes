public class afh implements zb<abn> {
   public static final ys<wf, afh> a = zb.a(afh::a, afh::new);
   private final jj<ave> b;
   private final avg c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afh(jj<ave> $$0, avg $$1, bsd $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.al();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afh(wf $$0) {
      this.b = ave.d.decode($$0);
      this.c = $$0.b(avg.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wf $$0) {
      ave.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zd<afh> a() {
      return afz.aR;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public jj<ave> b() {
      return this.b;
   }

   public avg e() {
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
