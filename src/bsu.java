import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bsu {
   private final Map<bst, List<evp>> a;

   bsu(Map<bst, List<evp>> $$0) {
      this.a = $$0;
   }

   public static bsu a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bsu.a a() {
      return new bsu.a();
   }

   public bsu a(float $$0, float $$1, float $$2) {
      Map<bst, List<evp>> $$3 = new EnumMap<>(bst.class);

      for (Entry<bst, List<evp>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bsu($$3);
   }

   private static List<evp> a(List<evp> $$0, float $$1, float $$2, float $$3) {
      List<evp> $$4 = new ArrayList<>($$0.size());

      for (evp $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public evp a(bst $$0, int $$1, float $$2) {
      List<evp> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public evp b(bst $$0, int $$1, float $$2) {
      evp $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public evp c(bst $$0, int $$1, float $$2) {
      List<evp> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         evp $$4 = $$3.get(ayx.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static evp a(evp $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bst, List<evp>> a = new EnumMap<>(bst.class);

      a() {
      }

      public bsu.a a(bst $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new evp((double)$$1, (double)$$2, (double)$$3));
      }

      public bsu.a a(bst $$0, evp $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bsu a(float $$0, float $$1) {
         Map<bst, List<evp>> $$2 = new EnumMap<>(bst.class);

         for (bst $$3 : bst.values()) {
            List<evp> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bsu($$2);
      }
   }
}
