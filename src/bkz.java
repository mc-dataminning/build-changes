import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bkz {
   public static final bkz a = new bkz();
   private final WeakHashMap<blb, Void> b = new WeakHashMap<>();

   private bkz() {
   }

   public void a(blb $$0) {
      this.b.put($$0, null);
   }

   public List<bky> a() {
      Map<String, List<bky>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bu().stream()).collect(Collectors.groupingBy(bky::d));
      return a($$0);
   }

   private static List<bky> a(Map<String, List<bky>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bky> $$2 = (List<bky>)$$0x.getValue();
         return (bky)($$2.size() > 1 ? new bkz.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bky {
      private final List<bky> b;

      a(String $$0, List<bky> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bky.c a(List<bky> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bky> $$0) {
         for (bky $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bky> $$0) {
         double $$1 = 0.0;

         for (bky $$2 : $$0) {
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
            bkz.a $$1 = (bkz.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
