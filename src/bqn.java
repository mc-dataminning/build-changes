import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bqn {
   private final Map<bqm, List<etf>> a;

   bqn(Map<bqm, List<etf>> $$0) {
      this.a = $$0;
   }

   public static bqn a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bqn.a a() {
      return new bqn.a();
   }

   public bqn a(float $$0, float $$1, float $$2) {
      Map<bqm, List<etf>> $$3 = new EnumMap<>(bqm.class);

      for (Entry<bqm, List<etf>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bqn($$3);
   }

   private static List<etf> a(List<etf> $$0, float $$1, float $$2, float $$3) {
      List<etf> $$4 = new ArrayList<>($$0.size());

      for (etf $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public etf a(bqm $$0, int $$1, float $$2) {
      List<etf> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public etf b(bqm $$0, int $$1, float $$2) {
      etf $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public etf c(bqm $$0, int $$1, float $$2) {
      List<etf> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         etf $$4 = $$3.get(axw.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static etf a(etf $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bqm, List<etf>> a = new EnumMap<>(bqm.class);

      a() {
      }

      public bqn.a a(bqm $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new etf((double)$$1, (double)$$2, (double)$$3));
      }

      public bqn.a a(bqm $$0, etf $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bqn a(float $$0, float $$1) {
         Map<bqm, List<etf>> $$2 = new EnumMap<>(bqm.class);

         for (bqm $$3 : bqm.values()) {
            List<etf> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bqn($$2);
      }
   }
}
