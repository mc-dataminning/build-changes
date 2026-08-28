public class fav extends fax {
   private final jn b;
   private final ji c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fav a(faz $$0, jn $$1, ji $$2) {
      return new fav(true, $$0, $$1, $$2, false, false);
   }

   public fav(faz $$0, jn $$1, ji $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fav(faz $$0, jn $$1, ji $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fav(boolean $$0, faz $$1, jn $$2, ji $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fav a(jn $$0) {
      return new fav(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fav a(ji $$0) {
      return new fav(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fav a() {
      return new fav(this.d, this.a, this.b, this.c, this.e, true);
   }

   public ji b() {
      return this.c;
   }

   public jn c() {
      return this.b;
   }

   @Override
   public fax.a d() {
      return this.d ? fax.a.a : fax.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
