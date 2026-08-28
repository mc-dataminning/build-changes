public class bai<T> {
   private final akv a;

   public bai(akv $$0) {
      this.a = $$0;
   }

   public static <T> bai<T> a(String $$0) {
      return new bai<>(akv.b($$0));
   }

   public akv a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "<parameter " + this.a + ">";
   }
}
