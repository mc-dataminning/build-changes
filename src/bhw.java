import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bhw {
   public static final bhw a = new bhw();
   private final WeakHashMap<bhy, Void> b = new WeakHashMap<>();

   private bhw() {
   }

   public void a(bhy $$0) {
      this.b.put($$0, null);
   }

   public List<bhv> a() {
      Map<String, List<bhv>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bp().stream()).collect(Collectors.groupingBy(bhv::d));
      return a($$0);
   }

   private static List<bhv> a(Map<String, List<bhv>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bhv> $$2 = (List<bhv>)$$0x.getValue();
         return (bhv)($$2.size() > 1 ? new bhw.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bhv {
      private final List<bhv> b;

      a(String $$0, List<bhv> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bhv.c a(List<bhv> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bhv> $$0) {
         for (bhv $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bhv> $$0) {
         double $$1 = 0.0;

         for (bhv $$2 : $$0) {
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
            bhw.a $$1 = (bhw.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
