public class bbn<T> {
   private final alz a;

   public bbn(alz $$0) {
      this.a = $$0;
   }

   public static <T> bbn<T> a(String $$0) {
      return new bbn<>(alz.b($$0));
   }

   public alz a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "<parameter " + this.a + ">";
   }
}
