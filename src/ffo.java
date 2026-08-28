public class ffo extends ffq {
   private final jc b;
   private final iw c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static ffo a(ffs $$0, jc $$1, iw $$2) {
      return new ffo(true, $$0, $$1, $$2, false, false);
   }

   public ffo(ffs $$0, jc $$1, iw $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public ffo(ffs $$0, jc $$1, iw $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private ffo(boolean $$0, ffs $$1, jc $$2, iw $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public ffo a(jc $$0) {
      return new ffo(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public ffo a(iw $$0) {
      return new ffo(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public ffo a() {
      return new ffo(this.d, this.a, this.b, this.c, this.e, true);
   }

   public iw b() {
      return this.c;
   }

   public jc c() {
      return this.b;
   }

   @Override
   public ffq.a d() {
      return this.d ? ffq.a.a : ffq.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
