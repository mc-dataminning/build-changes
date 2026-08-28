import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class boq {
   public static final boq a = new boq();
   private final WeakHashMap<bos, Void> b = new WeakHashMap<>();

   private boq() {
   }

   public void a(bos $$0) {
      this.b.put($$0, null);
   }

   public List<bop> a() {
      Map<String, List<bop>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bv().stream()).collect(Collectors.groupingBy(bop::d));
      return a($$0);
   }

   private static List<bop> a(Map<String, List<bop>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bop> $$2 = (List<bop>)$$0x.getValue();
         return (bop)($$2.size() > 1 ? new boq.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bop {
      private final List<bop> b;

      a(String $$0, List<bop> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bop.c a(List<bop> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bop> $$0) {
         for (bop $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bop> $$0) {
         double $$1 = 0.0;

         for (bop $$2 : $$0) {
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
            boq.a $$1 = (boq.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
