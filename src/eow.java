public class eow extends RuntimeException {
   private final wx a;

   public eow(wx $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wx a() {
      return this.a;
   }
}
