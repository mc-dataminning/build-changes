public class ehb extends ehd {
   private final hb b;
   private final gv c;
   private final boolean d;
   private final boolean e;

   public static ehb a(ehf $$0, hb $$1, gv $$2) {
      return new ehb(true, $$0, $$1, $$2, false);
   }

   public ehb(ehf $$0, hb $$1, gv $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ehb(boolean $$0, ehf $$1, hb $$2, gv $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ehb a(hb $$0) {
      return new ehb(this.d, this.a, $$0, this.c, this.e);
   }

   public ehb a(gv $$0) {
      return new ehb(this.d, this.a, this.b, $$0, this.e);
   }

   public gv a() {
      return this.c;
   }

   public hb b() {
      return this.b;
   }

   @Override
   public ehd.a c() {
      return this.d ? ehd.a.a : ehd.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
