import java.util.Map;
import java.util.Map.Entry;

public class fod {
   private Map<dfa, gam> a = Map.of();
   private final gas b;

   public fod(gas $$0) {
      this.b = $$0;
   }

   public fyl a(dfa $$0) {
      return this.b($$0).e();
   }

   public gam b(dfa $$0) {
      gam $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public gas a() {
      return this.b;
   }

   public void a(Map<dfa, gam> $$0) {
      this.a = $$0;
   }

   public static gat c(dfa $$0) {
      return a(jb.f.b($$0.b()), $$0);
   }

   public static gat a(aer $$0, dfa $$1) {
      return new gat($$0, b($$1.C()));
   }

   public static String b(Map<dgd<?>, Comparable<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (Entry<dgd<?>, Comparable<?>> $$2 : $$0.entrySet()) {
         if ($$1.length() != 0) {
            $$1.append(',');
         }

         dgd<?> $$3 = $$2.getKey();
         $$1.append($$3.f());
         $$1.append('=');
         $$1.append(a($$3, $$2.getValue()));
      }

      return $$1.toString();
   }

   private static <T extends Comparable<T>> String a(dgd<T> $$0, Comparable<?> $$1) {
      return $$0.a((T)$$1);
   }
}
