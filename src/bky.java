import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bky {
   public static final bky a = new bky();
   private final WeakHashMap<bla, Void> b = new WeakHashMap<>();

   private bky() {
   }

   public void a(bla $$0) {
      this.b.put($$0, null);
   }

   public List<bkx> a() {
      Map<String, List<bkx>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bu().stream()).collect(Collectors.groupingBy(bkx::d));
      return a($$0);
   }

   private static List<bkx> a(Map<String, List<bkx>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bkx> $$2 = (List<bkx>)$$0x.getValue();
         return (bkx)($$2.size() > 1 ? new bky.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bkx {
      private final List<bkx> b;

      a(String $$0, List<bkx> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bkx.c a(List<bkx> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bkx> $$0) {
         for (bkx $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bkx> $$0) {
         double $$1 = 0.0;

         for (bkx $$2 : $$0) {
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
            bky.a $$1 = (bky.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
