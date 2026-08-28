public class agb implements zp<ace> {
   public static final zg<wt, agb> a = zp.a(agb::a, agb::new);
   private final jq<awk> b;
   private final awm c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public agb(jq<awk> $$0, awm $$1, bue $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.as();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private agb(wt $$0) {
      this.b = awk.d.decode($$0);
      this.c = $$0.b(awm.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wt $$0) {
      awk.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zr<agb> a() {
      return agt.aS;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public jq<awk> b() {
      return this.b;
   }

   public awm e() {
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
