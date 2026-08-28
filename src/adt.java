public class adt implements zl<aca> {
   public static final zc<wp, adt> a = zl.a(adt::a, adt::new);
   private final int b;
   private final ddh c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public adt(int $$0, ddh $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private adt(wp $$0) {
      this.b = $$0.x();
      this.c = ddh.b.decode($$0);
      this.d = $$0.l();
      this.e = $$0.l();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(wp $$0) {
      $$0.f(this.b);
      ddh.b.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public zn<adt> a() {
      return agp.Q;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ddh e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.g;
   }
}
