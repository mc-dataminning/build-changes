public class bax<T> {
   private final alg a;

   public bax(alg $$0) {
      this.a = $$0;
   }

   public static <T> bax<T> a(String $$0) {
      return new bax<>(alg.b($$0));
   }

   public alg a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "<parameter " + this.a + ">";
   }
}
