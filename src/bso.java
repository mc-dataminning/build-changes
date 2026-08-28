import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bso {
   public static final bso a = new bso();
   private final WeakHashMap<bsq, Void> b = new WeakHashMap<>();

   private bso() {
   }

   public void a(bsq $$0) {
      this.b.put($$0, null);
   }

   public List<bsn> a() {
      Map<String, List<bsn>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bw().stream()).collect(Collectors.groupingBy(bsn::d));
      return a($$0);
   }

   private static List<bsn> a(Map<String, List<bsn>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bsn> $$2 = (List<bsn>)$$0x.getValue();
         return (bsn)($$2.size() > 1 ? new bso.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bsn {
      private final List<bsn> b;

      a(String $$0, List<bsn> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bsn.c a(List<bsn> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bsn> $$0) {
         for (bsn $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bsn> $$0) {
         double $$1 = 0.0;

         for (bsn $$2 : $$0) {
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
            bso.a $$1 = (bso.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
