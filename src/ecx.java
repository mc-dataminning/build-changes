public class ecx extends RuntimeException {
   private final ui a;

   public ecx(ui $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public ui a() {
      return this.a;
   }
}
