import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bhx {
   public static final bhx a = new bhx();
   private final WeakHashMap<bhz, Void> b = new WeakHashMap<>();

   private bhx() {
   }

   public void a(bhz $$0) {
      this.b.put($$0, null);
   }

   public List<bhw> a() {
      Map<String, List<bhw>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bp().stream()).collect(Collectors.groupingBy(bhw::d));
      return a($$0);
   }

   private static List<bhw> a(Map<String, List<bhw>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bhw> $$2 = (List<bhw>)$$0x.getValue();
         return (bhw)($$2.size() > 1 ? new bhx.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bhw {
      private final List<bhw> b;

      a(String $$0, List<bhw> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bhw.c a(List<bhw> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bhw> $$0) {
         for (bhw $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bhw> $$0) {
         double $$1 = 0.0;

         for (bhw $$2 : $$0) {
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
            bhx.a $$1 = (bhx.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
