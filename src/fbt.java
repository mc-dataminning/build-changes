public class fbt extends fbv {
   private final jn b;
   private final ji c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fbt a(fbx $$0, jn $$1, ji $$2) {
      return new fbt(true, $$0, $$1, $$2, false, false);
   }

   public fbt(fbx $$0, jn $$1, ji $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fbt(fbx $$0, jn $$1, ji $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fbt(boolean $$0, fbx $$1, jn $$2, ji $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fbt a(jn $$0) {
      return new fbt(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fbt a(ji $$0) {
      return new fbt(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fbt a() {
      return new fbt(this.d, this.a, this.b, this.c, this.e, true);
   }

   public ji b() {
      return this.c;
   }

   public jn c() {
      return this.b;
   }

   @Override
   public fbv.a d() {
      return this.d ? fbv.a.a : fbv.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
