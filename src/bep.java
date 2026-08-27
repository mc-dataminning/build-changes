import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bep {
   public static final bep a = new bep();
   private final WeakHashMap<ber, Void> b = new WeakHashMap<>();

   private bep() {
   }

   public void a(ber $$0) {
      this.b.put($$0, null);
   }

   public List<beo> a() {
      Map<String, List<beo>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bk().stream()).collect(Collectors.groupingBy(beo::d));
      return a($$0);
   }

   private static List<beo> a(Map<String, List<beo>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<beo> $$2 = (List<beo>)$$0x.getValue();
         return (beo)($$2.size() > 1 ? new bep.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends beo {
      private final List<beo> b;

      a(String $$0, List<beo> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static beo.c a(List<beo> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<beo> $$0) {
         for (beo $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<beo> $$0) {
         double $$1 = 0.0;

         for (beo $$2 : $$0) {
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
            bep.a $$1 = (bep.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
