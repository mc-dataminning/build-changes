import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bem {
   public static final bem a = new bem();
   private final WeakHashMap<beo, Void> b = new WeakHashMap<>();

   private bem() {
   }

   public void a(beo $$0) {
      this.b.put($$0, null);
   }

   public List<bel> a() {
      Map<String, List<bel>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bl().stream()).collect(Collectors.groupingBy(bel::d));
      return a($$0);
   }

   private static List<bel> a(Map<String, List<bel>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bel> $$2 = (List<bel>)$$0x.getValue();
         return (bel)($$2.size() > 1 ? new bem.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bel {
      private final List<bel> b;

      a(String $$0, List<bel> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bel.c a(List<bel> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bel> $$0) {
         for (bel $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bel> $$0) {
         double $$1 = 0.0;

         for (bel $$2 : $$0) {
            $$1 += $$2.c().getAsDouble();
         }

         return $$1 / (double)$$0.size();
      }

      @Override
      public boolean equals(@Nullable Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
         } else if (!super.equals($$0)) {
            return false;
         } else {
            bem.a $$1 = (bem.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
