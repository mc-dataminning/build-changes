public class eyo extends eyq {
   private final jj b;
   private final je c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static eyo a(eys $$0, jj $$1, je $$2) {
      return new eyo(true, $$0, $$1, $$2, false, false);
   }

   public eyo(eys $$0, jj $$1, je $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public eyo(eys $$0, jj $$1, je $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private eyo(boolean $$0, eys $$1, jj $$2, je $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public eyo a(jj $$0) {
      return new eyo(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public eyo a(je $$0) {
      return new eyo(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public eyo a() {
      return new eyo(this.d, this.a, this.b, this.c, this.e, true);
   }

   public je b() {
      return this.c;
   }

   public jj c() {
      return this.b;
   }

   @Override
   public eyq.a d() {
      return this.d ? eyq.a.a : eyq.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
