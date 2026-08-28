public class ewb extends ewd {
   private final jf b;
   private final ja c;
   private final boolean d;
   private final boolean e;

   public static ewb a(ewf $$0, jf $$1, ja $$2) {
      return new ewb(true, $$0, $$1, $$2, false);
   }

   public ewb(ewf $$0, jf $$1, ja $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ewb(boolean $$0, ewf $$1, jf $$2, ja $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ewb a(jf $$0) {
      return new ewb(this.d, this.a, $$0, this.c, this.e);
   }

   public ewb a(ja $$0) {
      return new ewb(this.d, this.a, this.b, $$0, this.e);
   }

   public ja a() {
      return this.c;
   }

   public jf b() {
      return this.b;
   }

   @Override
   public ewd.a c() {
      return this.d ? ewd.a.a : ewd.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
