public class eir extends RuntimeException {
   private final vq a;

   public eir(vq $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public vq a() {
      return this.a;
   }
}
