public class elo extends elq {
   private final ic b;
   private final hx c;
   private final boolean d;
   private final boolean e;

   public static elo a(els $$0, ic $$1, hx $$2) {
      return new elo(true, $$0, $$1, $$2, false);
   }

   public elo(els $$0, ic $$1, hx $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private elo(boolean $$0, els $$1, ic $$2, hx $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public elo a(ic $$0) {
      return new elo(this.d, this.a, $$0, this.c, this.e);
   }

   public elo a(hx $$0) {
      return new elo(this.d, this.a, this.b, $$0, this.e);
   }

   public hx a() {
      return this.c;
   }

   public ic b() {
      return this.b;
   }

   @Override
   public elq.a c() {
      return this.d ? elq.a.a : elq.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
