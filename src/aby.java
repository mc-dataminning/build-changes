public class aby implements xx<aag> {
   public static final xo<vb, aby> a = xx.a(aby::a, aby::new);
   private final int b;
   private final cuq c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public aby(int $$0, cuq $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.b();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private aby(vb $$0) {
      this.b = $$0.n();
      this.c = cuq.a.decode($$0);
      this.d = $$0.n();
      this.e = $$0.n();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(vb $$0) {
      $$0.c(this.b);
      cuq.a.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public xz<aby> a() {
      return aeq.P;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public cuq e() {
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
