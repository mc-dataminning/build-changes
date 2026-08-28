public class ffm extends ffo {
   private final jb b;
   private final iv c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static ffm a(ffq $$0, jb $$1, iv $$2) {
      return new ffm(true, $$0, $$1, $$2, false, false);
   }

   public ffm(ffq $$0, jb $$1, iv $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public ffm(ffq $$0, jb $$1, iv $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private ffm(boolean $$0, ffq $$1, jb $$2, iv $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public ffm a(jb $$0) {
      return new ffm(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public ffm a(iv $$0) {
      return new ffm(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public ffm a() {
      return new ffm(this.d, this.a, this.b, this.c, this.e, true);
   }

   public iv b() {
      return this.c;
   }

   public jb c() {
      return this.b;
   }

   @Override
   public ffo.a d() {
      return this.d ? ffo.a.a : ffo.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
