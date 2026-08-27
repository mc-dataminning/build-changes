public class add implements yz<abk> {
   public static final yq<wd, add> a = yz.a(add::a, add::new);
   private final int b;
   private final cyt c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public add(int $$0, cyt $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private add(wd $$0) {
      this.b = $$0.l();
      this.c = cyt.b.decode($$0);
      this.d = $$0.l();
      this.e = $$0.l();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(wd $$0) {
      $$0.c(this.b);
      cyt.b.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public zb<add> a() {
      return afv.Q;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public cyt e() {
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
