public class ewd extends ewf {
   private final jf b;
   private final ja c;
   private final boolean d;
   private final boolean e;

   public static ewd a(ewh $$0, jf $$1, ja $$2) {
      return new ewd(true, $$0, $$1, $$2, false);
   }

   public ewd(ewh $$0, jf $$1, ja $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ewd(boolean $$0, ewh $$1, jf $$2, ja $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ewd a(jf $$0) {
      return new ewd(this.d, this.a, $$0, this.c, this.e);
   }

   public ewd a(ja $$0) {
      return new ewd(this.d, this.a, this.b, $$0, this.e);
   }

   public ja a() {
      return this.c;
   }

   public jf b() {
      return this.b;
   }

   @Override
   public ewf.a c() {
      return this.d ? ewf.a.a : ewf.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
