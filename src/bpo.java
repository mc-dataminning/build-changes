import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bpo {
   public static final bpo a = new bpo();
   private final WeakHashMap<bpq, Void> b = new WeakHashMap<>();

   private bpo() {
   }

   public void a(bpq $$0) {
      this.b.put($$0, null);
   }

   public List<bpn> a() {
      Map<String, List<bpn>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bx().stream()).collect(Collectors.groupingBy(bpn::d));
      return a($$0);
   }

   private static List<bpn> a(Map<String, List<bpn>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bpn> $$2 = (List<bpn>)$$0x.getValue();
         return (bpn)($$2.size() > 1 ? new bpo.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bpn {
      private final List<bpn> b;

      a(String $$0, List<bpn> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bpn.c a(List<bpn> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bpn> $$0) {
         for (bpn $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bpn> $$0) {
         double $$1 = 0.0;

         for (bpn $$2 : $$0) {
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
            bpo.a $$1 = (bpo.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
