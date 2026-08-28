import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bos {
   public static final bos a = new bos();
   private final WeakHashMap<bou, Void> b = new WeakHashMap<>();

   private bos() {
   }

   public void a(bou $$0) {
      this.b.put($$0, null);
   }

   public List<bor> a() {
      Map<String, List<bor>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bv().stream()).collect(Collectors.groupingBy(bor::d));
      return a($$0);
   }

   private static List<bor> a(Map<String, List<bor>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bor> $$2 = (List<bor>)$$0x.getValue();
         return (bor)($$2.size() > 1 ? new bos.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bor {
      private final List<bor> b;

      a(String $$0, List<bor> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bor.c a(List<bor> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bor> $$0) {
         for (bor $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bor> $$0) {
         double $$1 = 0.0;

         for (bor $$2 : $$0) {
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
            bos.a $$1 = (bos.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
