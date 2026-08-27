public class eee extends eeg {
   private final ha b;
   private final gu c;
   private final boolean d;
   private final boolean e;

   public static eee a(eei $$0, ha $$1, gu $$2) {
      return new eee(true, $$0, $$1, $$2, false);
   }

   public eee(eei $$0, ha $$1, gu $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private eee(boolean $$0, eei $$1, ha $$2, gu $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public eee a(ha $$0) {
      return new eee(this.d, this.a, $$0, this.c, this.e);
   }

   public eee a(gu $$0) {
      return new eee(this.d, this.a, this.b, $$0, this.e);
   }

   public gu a() {
      return this.c;
   }

   public ha b() {
      return this.b;
   }

   @Override
   public eeg.a c() {
      return this.d ? eeg.a.a : eeg.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
