public class acr implements yn<aay> {
   public static final ye<vr, acr> a = yn.a(acr::a, acr::new);
   private final int b;
   private final cxw c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public acr(int $$0, cxw $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private acr(vr $$0) {
      this.b = $$0.l();
      this.c = cxw.b.decode($$0);
      this.d = $$0.l();
      this.e = $$0.l();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      cxw.b.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public yp<acr> a() {
      return afj.Q;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public cxw e() {
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
