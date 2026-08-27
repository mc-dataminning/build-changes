import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bmm {
   public static final bmm a = new bmm();
   private final WeakHashMap<bmo, Void> b = new WeakHashMap<>();

   private bmm() {
   }

   public void a(bmo $$0) {
      this.b.put($$0, null);
   }

   public List<bml> a() {
      Map<String, List<bml>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bu().stream()).collect(Collectors.groupingBy(bml::d));
      return a($$0);
   }

   private static List<bml> a(Map<String, List<bml>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bml> $$2 = (List<bml>)$$0x.getValue();
         return (bml)($$2.size() > 1 ? new bmm.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bml {
      private final List<bml> b;

      a(String $$0, List<bml> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bml.c a(List<bml> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bml> $$0) {
         for (bml $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bml> $$0) {
         double $$1 = 0.0;

         for (bml $$2 : $$0) {
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
            bmm.a $$1 = (bmm.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
