public class afx implements zl<aca> {
   public static final zc<wp, afx> a = zl.a(afx::a, afx::new);
   private final jo<awf> b;
   private final awh c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afx(jo<awf> $$0, awh $$1, btr $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ap();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afx(wp $$0) {
      this.b = awf.d.decode($$0);
      this.c = $$0.b(awh.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wp $$0) {
      awf.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zn<afx> a() {
      return agp.aS;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public jo<awf> b() {
      return this.b;
   }

   public awh e() {
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
