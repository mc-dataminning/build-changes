public class ewy extends exa {
   private final ji b;
   private final jd c;
   private final boolean d;
   private final boolean e;

   public static ewy a(exc $$0, ji $$1, jd $$2) {
      return new ewy(true, $$0, $$1, $$2, false);
   }

   public ewy(exc $$0, ji $$1, jd $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ewy(boolean $$0, exc $$1, ji $$2, jd $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ewy a(ji $$0) {
      return new ewy(this.d, this.a, $$0, this.c, this.e);
   }

   public ewy a(jd $$0) {
      return new ewy(this.d, this.a, this.b, $$0, this.e);
   }

   public jd a() {
      return this.c;
   }

   public ji b() {
      return this.b;
   }

   @Override
   public exa.a c() {
      return this.d ? exa.a.a : exa.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
