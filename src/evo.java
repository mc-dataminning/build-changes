public class evo extends evq {
   private final je b;
   private final iz c;
   private final boolean d;
   private final boolean e;

   public static evo a(evs $$0, je $$1, iz $$2) {
      return new evo(true, $$0, $$1, $$2, false);
   }

   public evo(evs $$0, je $$1, iz $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private evo(boolean $$0, evs $$1, je $$2, iz $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public evo a(je $$0) {
      return new evo(this.d, this.a, $$0, this.c, this.e);
   }

   public evo a(iz $$0) {
      return new evo(this.d, this.a, this.b, $$0, this.e);
   }

   public iz a() {
      return this.c;
   }

   public je b() {
      return this.b;
   }

   @Override
   public evq.a c() {
      return this.d ? evq.a.a : evq.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
