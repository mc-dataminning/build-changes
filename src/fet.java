public class fet extends fev {
   private final jb b;
   private final iv c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fet a(fex $$0, jb $$1, iv $$2) {
      return new fet(true, $$0, $$1, $$2, false, false);
   }

   public fet(fex $$0, jb $$1, iv $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fet(fex $$0, jb $$1, iv $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fet(boolean $$0, fex $$1, jb $$2, iv $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fet a(jb $$0) {
      return new fet(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fet a(iv $$0) {
      return new fet(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fet a() {
      return new fet(this.d, this.a, this.b, this.c, this.e, true);
   }

   public iv b() {
      return this.c;
   }

   public jb c() {
      return this.b;
   }

   @Override
   public fev.a d() {
      return this.d ? fev.a.a : fev.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
