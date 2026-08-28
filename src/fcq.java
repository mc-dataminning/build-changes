public class fcq extends fcs {
   private final jo b;
   private final jj c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fcq a(fcu $$0, jo $$1, jj $$2) {
      return new fcq(true, $$0, $$1, $$2, false, false);
   }

   public fcq(fcu $$0, jo $$1, jj $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fcq(fcu $$0, jo $$1, jj $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fcq(boolean $$0, fcu $$1, jo $$2, jj $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fcq a(jo $$0) {
      return new fcq(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fcq a(jj $$0) {
      return new fcq(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fcq a() {
      return new fcq(this.d, this.a, this.b, this.c, this.e, true);
   }

   public jj b() {
      return this.c;
   }

   public jo c() {
      return this.b;
   }

   @Override
   public fcs.a d() {
      return this.d ? fcs.a.a : fcs.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
