public class evc extends RuntimeException {
   private final wo a;

   public evc(wo $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public wo a() {
      return this.a;
   }
}
