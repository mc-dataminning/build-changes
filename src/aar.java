public class aar implements xf<za> {
   private final int a;
   private final cso b;
   private final int c;
   private final int d;
   private final boolean e;
   private final boolean f;

   public aar(int $$0, cso $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.a = $$0;
      this.b = $$1.b();
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public aar(ui $$0) {
      this.a = $$0.n();
      this.b = cso.b($$0);
      this.c = $$0.n();
      this.d = $$0.n();
      this.e = $$0.readBoolean();
      this.f = $$0.readBoolean();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      this.b.a($$0);
      $$0.c(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public cso d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }

   public boolean h() {
      return this.f;
   }
}
