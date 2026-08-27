public class eft extends RuntimeException {
   private final vb a;

   public eft(vb $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public vb a() {
      return this.a;
   }
}
