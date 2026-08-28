public class eww extends ewy {
   private final ji b;
   private final jd c;
   private final boolean d;
   private final boolean e;

   public static eww a(exa $$0, ji $$1, jd $$2) {
      return new eww(true, $$0, $$1, $$2, false);
   }

   public eww(exa $$0, ji $$1, jd $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private eww(boolean $$0, exa $$1, ji $$2, jd $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public eww a(ji $$0) {
      return new eww(this.d, this.a, $$0, this.c, this.e);
   }

   public eww a(jd $$0) {
      return new eww(this.d, this.a, this.b, $$0, this.e);
   }

   public jd a() {
      return this.c;
   }

   public ji b() {
      return this.b;
   }

   @Override
   public ewy.a c() {
      return this.d ? ewy.a.a : ewy.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
