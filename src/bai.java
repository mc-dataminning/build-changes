public class bai<T> {
   private final aku a;

   public bai(aku $$0) {
      this.a = $$0;
   }

   public static <T> bai<T> a(String $$0) {
      return new bai<>(aku.b($$0));
   }

   public aku a() {
      return this.a;
   }

   @Override
   public String toString() {
      return "<parameter " + this.a + ">";
   }
}
