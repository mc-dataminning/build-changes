public class eou extends RuntimeException {
   private final wx a;

   public eou(wx $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wx a() {
      return this.a;
   }
}
