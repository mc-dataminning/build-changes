public class eys extends eyu {
   private final jk b;
   private final jf c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static eys a(eyw $$0, jk $$1, jf $$2) {
      return new eys(true, $$0, $$1, $$2, false, false);
   }

   public eys(eyw $$0, jk $$1, jf $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public eys(eyw $$0, jk $$1, jf $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private eys(boolean $$0, eyw $$1, jk $$2, jf $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public eys a(jk $$0) {
      return new eys(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public eys a(jf $$0) {
      return new eys(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public eys a() {
      return new eys(this.d, this.a, this.b, this.c, this.e, true);
   }

   public jf b() {
      return this.c;
   }

   public jk c() {
      return this.b;
   }

   @Override
   public eyu.a d() {
      return this.d ? eyu.a.a : eyu.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
