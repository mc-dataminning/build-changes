public class fey extends ffa {
   private final jb b;
   private final iv c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fey a(ffc $$0, jb $$1, iv $$2) {
      return new fey(true, $$0, $$1, $$2, false, false);
   }

   public fey(ffc $$0, jb $$1, iv $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fey(ffc $$0, jb $$1, iv $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fey(boolean $$0, ffc $$1, jb $$2, iv $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fey a(jb $$0) {
      return new fey(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fey a(iv $$0) {
      return new fey(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fey a() {
      return new fey(this.d, this.a, this.b, this.c, this.e, true);
   }

   public iv b() {
      return this.c;
   }

   public jb c() {
      return this.b;
   }

   @Override
   public ffa.a d() {
      return this.d ? ffa.a.a : ffa.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
