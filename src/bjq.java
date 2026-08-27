import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bjq {
   public static final bjq a = new bjq();
   private final WeakHashMap<bjs, Void> b = new WeakHashMap<>();

   private bjq() {
   }

   public void a(bjs $$0) {
      this.b.put($$0, null);
   }

   public List<bjp> a() {
      Map<String, List<bjp>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bq().stream()).collect(Collectors.groupingBy(bjp::d));
      return a($$0);
   }

   private static List<bjp> a(Map<String, List<bjp>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bjp> $$2 = (List<bjp>)$$0x.getValue();
         return (bjp)($$2.size() > 1 ? new bjq.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bjp {
      private final List<bjp> b;

      a(String $$0, List<bjp> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bjp.c a(List<bjp> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bjp> $$0) {
         for (bjp $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bjp> $$0) {
         double $$1 = 0.0;

         for (bjp $$2 : $$0) {
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
            bjq.a $$1 = (bjq.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
