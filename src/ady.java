public class ady implements xx<aag> {
   public static final xo<vb, ady> a = xx.a(ady::a, ady::new);
   private final ij<atk> b;
   private final atm c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public ady(ij<atk> $$0, atm $$1, bnq $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.aj();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private ady(vb $$0) {
      this.b = atk.d.decode($$0);
      this.c = $$0.b(atm.class);
      this.d = $$0.n();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(vb $$0) {
      atk.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public xz<ady> a() {
      return aeq.aQ;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public ij<atk> b() {
      return this.b;
   }

   public atm e() {
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
