import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bol {
   public static final bol a = new bol();
   private final WeakHashMap<bon, Void> b = new WeakHashMap<>();

   private bol() {
   }

   public void a(bon $$0) {
      this.b.put($$0, null);
   }

   public List<bok> a() {
      Map<String, List<bok>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bv().stream()).collect(Collectors.groupingBy(bok::d));
      return a($$0);
   }

   private static List<bok> a(Map<String, List<bok>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bok> $$2 = (List<bok>)$$0x.getValue();
         return (bok)($$2.size() > 1 ? new bol.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bok {
      private final List<bok> b;

      a(String $$0, List<bok> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bok.c a(List<bok> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bok> $$0) {
         for (bok $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bok> $$0) {
         double $$1 = 0.0;

         for (bok $$2 : $$0) {
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
            bol.a $$1 = (bol.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
