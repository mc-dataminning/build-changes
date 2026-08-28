public class eya extends eyc {
   private final jj b;
   private final je c;
   private final boolean d;
   private final boolean e;

   public static eya a(eye $$0, jj $$1, je $$2) {
      return new eya(true, $$0, $$1, $$2, false);
   }

   public eya(eye $$0, jj $$1, je $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private eya(boolean $$0, eye $$1, jj $$2, je $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public eya a(jj $$0) {
      return new eya(this.d, this.a, $$0, this.c, this.e);
   }

   public eya a(je $$0) {
      return new eya(this.d, this.a, this.b, $$0, this.e);
   }

   public je a() {
      return this.c;
   }

   public jj b() {
      return this.b;
   }

   @Override
   public eyc.a c() {
      return this.d ? eyc.a.a : eyc.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
