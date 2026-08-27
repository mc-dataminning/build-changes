public class erw extends ery {
   private final ih b;
   private final ib c;
   private final boolean d;
   private final boolean e;

   public static erw a(esa $$0, ih $$1, ib $$2) {
      return new erw(true, $$0, $$1, $$2, false);
   }

   public erw(esa $$0, ih $$1, ib $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private erw(boolean $$0, esa $$1, ih $$2, ib $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public erw a(ih $$0) {
      return new erw(this.d, this.a, $$0, this.c, this.e);
   }

   public erw a(ib $$0) {
      return new erw(this.d, this.a, this.b, $$0, this.e);
   }

   public ib a() {
      return this.c;
   }

   public ih b() {
      return this.b;
   }

   @Override
   public ery.a c() {
      return this.d ? ery.a.a : ery.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
