public class fem extends feo {
   private final ja b;
   private final iu c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fem a(feq $$0, ja $$1, iu $$2) {
      return new fem(true, $$0, $$1, $$2, false, false);
   }

   public fem(feq $$0, ja $$1, iu $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fem(feq $$0, ja $$1, iu $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fem(boolean $$0, feq $$1, ja $$2, iu $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fem a(ja $$0) {
      return new fem(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fem a(iu $$0) {
      return new fem(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fem a() {
      return new fem(this.d, this.a, this.b, this.c, this.e, true);
   }

   public iu b() {
      return this.c;
   }

   public ja c() {
      return this.b;
   }

   @Override
   public feo.a d() {
      return this.d ? feo.a.a : feo.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
