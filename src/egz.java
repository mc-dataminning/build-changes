public class egz extends ehb {
   private final ha b;
   private final gu c;
   private final boolean d;
   private final boolean e;

   public static egz a(ehd $$0, ha $$1, gu $$2) {
      return new egz(true, $$0, $$1, $$2, false);
   }

   public egz(ehd $$0, ha $$1, gu $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private egz(boolean $$0, ehd $$1, ha $$2, gu $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public egz a(ha $$0) {
      return new egz(this.d, this.a, $$0, this.c, this.e);
   }

   public egz a(gu $$0) {
      return new egz(this.d, this.a, this.b, $$0, this.e);
   }

   public gu a() {
      return this.c;
   }

   public ha b() {
      return this.b;
   }

   @Override
   public ehb.a c() {
      return this.d ? ehb.a.a : ehb.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
