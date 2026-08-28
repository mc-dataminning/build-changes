public class fax extends faz {
   private final jn b;
   private final ji c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fax a(fbb $$0, jn $$1, ji $$2) {
      return new fax(true, $$0, $$1, $$2, false, false);
   }

   public fax(fbb $$0, jn $$1, ji $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fax(fbb $$0, jn $$1, ji $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fax(boolean $$0, fbb $$1, jn $$2, ji $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fax a(jn $$0) {
      return new fax(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fax a(ji $$0) {
      return new fax(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fax a() {
      return new fax(this.d, this.a, this.b, this.c, this.e, true);
   }

   public ji b() {
      return this.c;
   }

   public jn c() {
      return this.b;
   }

   @Override
   public faz.a d() {
      return this.d ? faz.a.a : faz.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
