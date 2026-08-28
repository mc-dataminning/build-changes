import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bpl {
   public static final bpl a = new bpl();
   private final WeakHashMap<bpn, Void> b = new WeakHashMap<>();

   private bpl() {
   }

   public void a(bpn $$0) {
      this.b.put($$0, null);
   }

   public List<bpk> a() {
      Map<String, List<bpk>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bx().stream()).collect(Collectors.groupingBy(bpk::d));
      return a($$0);
   }

   private static List<bpk> a(Map<String, List<bpk>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bpk> $$2 = (List<bpk>)$$0x.getValue();
         return (bpk)($$2.size() > 1 ? new bpl.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bpk {
      private final List<bpk> b;

      a(String $$0, List<bpk> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bpk.c a(List<bpk> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bpk> $$0) {
         for (bpk $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bpk> $$0) {
         double $$1 = 0.0;

         for (bpk $$2 : $$0) {
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
            bpl.a $$1 = (bpl.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
