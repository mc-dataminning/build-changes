public class bbd<T> {
   private final alp a;

   public bbd(alp $$0) {
      this.a = $$0;
   }

   public static <T> bbd<T> a(String $$0) {
      return new bbd<>(alp.b($$0));
   }

   public alp a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "<parameter " + this.a + ">";
   }
}
