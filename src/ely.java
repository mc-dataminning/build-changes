public class ely extends ema {
   private final ic b;
   private final hx c;
   private final boolean d;
   private final boolean e;

   public static ely a(emc $$0, ic $$1, hx $$2) {
      return new ely(true, $$0, $$1, $$2, false);
   }

   public ely(emc $$0, ic $$1, hx $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private ely(boolean $$0, emc $$1, ic $$2, hx $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public ely a(ic $$0) {
      return new ely(this.d, this.a, $$0, this.c, this.e);
   }

   public ely a(hx $$0) {
      return new ely(this.d, this.a, this.b, $$0, this.e);
   }

   public hx a() {
      return this.c;
   }

   public ic b() {
      return this.b;
   }

   @Override
   public ema.a c() {
      return this.d ? ema.a.a : ema.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
