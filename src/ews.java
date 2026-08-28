public class ews extends ewu {
   private final ji b;
   private final jd c;
   private final boolean d;
   private final boolean e;

   public static ews a(eww $$0, ji $$1, jd $$2) {
      return new ews(true, $$0, $$1, $$2, false);
   }

   public ews(eww $$0, ji $$1, jd $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ews(boolean $$0, eww $$1, ji $$2, jd $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ews a(ji $$0) {
      return new ews(this.d, this.a, $$0, this.c, this.e);
   }

   public ews a(jd $$0) {
      return new ews(this.d, this.a, this.b, $$0, this.e);
   }

   public jd a() {
      return this.c;
   }

   public ji b() {
      return this.b;
   }

   @Override
   public ewu.a c() {
      return this.d ? ewu.a.a : ewu.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
