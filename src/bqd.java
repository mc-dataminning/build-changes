import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bqd {
   public static final bqd a = new bqd();
   private final WeakHashMap<bqf, Void> b = new WeakHashMap<>();

   private bqd() {
   }

   public void a(bqf $$0) {
      this.b.put($$0, null);
   }

   public List<bqc> a() {
      Map<String, List<bqc>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bw().stream()).collect(Collectors.groupingBy(bqc::d));
      return a($$0);
   }

   private static List<bqc> a(Map<String, List<bqc>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bqc> $$2 = (List<bqc>)$$0x.getValue();
         return (bqc)($$2.size() > 1 ? new bqd.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bqc {
      private final List<bqc> b;

      a(String $$0, List<bqc> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bqc.c a(List<bqc> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bqc> $$0) {
         for (bqc $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bqc> $$0) {
         double $$1 = 0.0;

         for (bqc $$2 : $$0) {
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
            bqd.a $$1 = (bqd.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
