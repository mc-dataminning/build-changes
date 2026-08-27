public class ehd extends ehf {
   private final ha b;
   private final gw c;
   private final boolean d;
   private final boolean e;

   public static ehd a(ehh $$0, ha $$1, gw $$2) {
      return new ehd(true, $$0, $$1, $$2, false);
   }

   public ehd(ehh $$0, ha $$1, gw $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ehd(boolean $$0, ehh $$1, ha $$2, gw $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ehd a(ha $$0) {
      return new ehd(this.d, this.a, $$0, this.c, this.e);
   }

   public ehd a(gw $$0) {
      return new ehd(this.d, this.a, this.b, $$0, this.e);
   }

   public gw a() {
      return this.c;
   }

   public ha b() {
      return this.b;
   }

   @Override
   public ehf.a c() {
      return this.d ? ehf.a.a : ehf.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
