public class fau extends faw {
   private final jn b;
   private final ji c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fau a(fay $$0, jn $$1, ji $$2) {
      return new fau(true, $$0, $$1, $$2, false, false);
   }

   public fau(fay $$0, jn $$1, ji $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fau(fay $$0, jn $$1, ji $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fau(boolean $$0, fay $$1, jn $$2, ji $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fau a(jn $$0) {
      return new fau(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fau a(ji $$0) {
      return new fau(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fau a() {
      return new fau(this.d, this.a, this.b, this.c, this.e, true);
   }

   public ji b() {
      return this.c;
   }

   public jn c() {
      return this.b;
   }

   @Override
   public faw.a d() {
      return this.d ? faw.a.a : faw.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
