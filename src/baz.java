public class baz<T> {
   private final ali a;

   public baz(ali $$0) {
      this.a = $$0;
   }

   public static <T> baz<T> a(String $$0) {
      return new baz<>(ali.b($$0));
   }

   public ali a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "<parameter " + this.a + ">";
   }
}
