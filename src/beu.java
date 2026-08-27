import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class beu {
   public static final beu a = new beu();
   private final WeakHashMap<bew, Void> b = new WeakHashMap<>();

   private beu() {
   }

   public void a(bew $$0) {
      this.b.put($$0, null);
   }

   public List<bet> a() {
      Map<String, List<bet>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bk().stream()).collect(Collectors.groupingBy(bet::d));
      return a($$0);
   }

   private static List<bet> a(Map<String, List<bet>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bet> $$2 = (List<bet>)$$0x.getValue();
         return (bet)($$2.size() > 1 ? new beu.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bet {
      private final List<bet> b;

      a(String $$0, List<bet> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bet.c a(List<bet> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bet> $$0) {
         for (bet $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bet> $$0) {
         double $$1 = 0.0;

         for (bet $$2 : $$0) {
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
            beu.a $$1 = (beu.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
