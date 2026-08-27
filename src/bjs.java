import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bjs {
   public static final bjs a = new bjs();
   private final WeakHashMap<bju, Void> b = new WeakHashMap<>();

   private bjs() {
   }

   public void a(bju $$0) {
      this.b.put($$0, null);
   }

   public List<bjr> a() {
      Map<String, List<bjr>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bs().stream()).collect(Collectors.groupingBy(bjr::d));
      return a($$0);
   }

   private static List<bjr> a(Map<String, List<bjr>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bjr> $$2 = (List<bjr>)$$0x.getValue();
         return (bjr)($$2.size() > 1 ? new bjs.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bjr {
      private final List<bjr> b;

      a(String $$0, List<bjr> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bjr.c a(List<bjr> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bjr> $$0) {
         for (bjr $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bjr> $$0) {
         double $$1 = 0.0;

         for (bjr $$2 : $$0) {
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
            bjs.a $$1 = (bjs.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
