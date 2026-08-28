public class fee extends feg {
   private final ja b;
   private final iu c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fee a(fei $$0, ja $$1, iu $$2) {
      return new fee(true, $$0, $$1, $$2, false, false);
   }

   public fee(fei $$0, ja $$1, iu $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fee(fei $$0, ja $$1, iu $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fee(boolean $$0, fei $$1, ja $$2, iu $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fee a(ja $$0) {
      return new fee(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fee a(iu $$0) {
      return new fee(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fee a() {
      return new fee(this.d, this.a, this.b, this.c, this.e, true);
   }

   public iu b() {
      return this.c;
   }

   public ja c() {
      return this.b;
   }

   @Override
   public feg.a d() {
      return this.d ? feg.a.a : feg.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
