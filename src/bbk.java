public class bbk<T> {
   private final alr a;

   public bbk(alr $$0) {
      this.a = $$0;
   }

   public static <T> bbk<T> a(String $$0) {
      return new bbk<>(alr.b($$0));
   }

   public alr a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "<parameter " + this.a + ">";
   }
}
