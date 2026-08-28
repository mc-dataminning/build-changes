import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bsv {
   private final Map<bsu, List<evq>> a;

   bsv(Map<bsu, List<evq>> $$0) {
      this.a = $$0;
   }

   public static bsv a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bsv.a a() {
      return new bsv.a();
   }

   public bsv a(float $$0, float $$1, float $$2) {
      Map<bsu, List<evq>> $$3 = new EnumMap<>(bsu.class);

      for (Entry<bsu, List<evq>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bsv($$3);
   }

   private static List<evq> a(List<evq> $$0, float $$1, float $$2, float $$3) {
      List<evq> $$4 = new ArrayList<>($$0.size());

      for (evq $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public evq a(bsu $$0, int $$1, float $$2) {
      List<evq> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public evq b(bsu $$0, int $$1, float $$2) {
      evq $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public evq c(bsu $$0, int $$1, float $$2) {
      List<evq> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         evq $$4 = $$3.get(ayy.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static evq a(evq $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bsu, List<evq>> a = new EnumMap<>(bsu.class);

      a() {
      }

      public bsv.a a(bsu $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new evq((double)$$1, (double)$$2, (double)$$3));
      }

      public bsv.a a(bsu $$0, evq $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bsv a(float $$0, float $$1) {
         Map<bsu, List<evq>> $$2 = new EnumMap<>(bsu.class);

         for (bsu $$3 : bsu.values()) {
            List<evq> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bsv($$2);
      }
   }
}
