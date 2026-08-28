public class fbn extends fbp {
   private final jm b;
   private final jh c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fbn a(fbr $$0, jm $$1, jh $$2) {
      return new fbn(true, $$0, $$1, $$2, false, false);
   }

   public fbn(fbr $$0, jm $$1, jh $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fbn(fbr $$0, jm $$1, jh $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fbn(boolean $$0, fbr $$1, jm $$2, jh $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fbn a(jm $$0) {
      return new fbn(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fbn a(jh $$0) {
      return new fbn(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fbn a() {
      return new fbn(this.d, this.a, this.b, this.c, this.e, true);
   }

   public jh b() {
      return this.c;
   }

   public jm c() {
      return this.b;
   }

   @Override
   public fbp.a d() {
      return this.d ? fbp.a.a : fbp.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
