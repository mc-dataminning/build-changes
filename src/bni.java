import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bni {
   public static final bni a = new bni();
   private final WeakHashMap<bnk, Void> b = new WeakHashMap<>();

   private bni() {
   }

   public void a(bnk $$0) {
      this.b.put($$0, null);
   }

   public List<bnh> a() {
      Map<String, List<bnh>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bu().stream()).collect(Collectors.groupingBy(bnh::d));
      return a($$0);
   }

   private static List<bnh> a(Map<String, List<bnh>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bnh> $$2 = (List<bnh>)$$0x.getValue();
         return (bnh)($$2.size() > 1 ? new bni.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bnh {
      private final List<bnh> b;

      a(String $$0, List<bnh> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bnh.c a(List<bnh> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bnh> $$0) {
         for (bnh $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bnh> $$0) {
         double $$1 = 0.0;

         for (bnh $$2 : $$0) {
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
            bni.a $$1 = (bni.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
