import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bnq {
   public static final bnq a = new bnq();
   private final WeakHashMap<bns, Void> b = new WeakHashMap<>();

   private bnq() {
   }

   public void a(bns $$0) {
      this.b.put($$0, null);
   }

   public List<bnp> a() {
      Map<String, List<bnp>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bu().stream()).collect(Collectors.groupingBy(bnp::d));
      return a($$0);
   }

   private static List<bnp> a(Map<String, List<bnp>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bnp> $$2 = (List<bnp>)$$0x.getValue();
         return (bnp)($$2.size() > 1 ? new bnq.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bnp {
      private final List<bnp> b;

      a(String $$0, List<bnp> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bnp.c a(List<bnp> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bnp> $$0) {
         for (bnp $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bnp> $$0) {
         double $$1 = 0.0;

         for (bnp $$2 : $$0) {
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
            bnq.a $$1 = (bnq.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
