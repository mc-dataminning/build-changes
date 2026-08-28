import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bsx {
   private final Map<bsw, List<evs>> a;

   bsx(Map<bsw, List<evs>> $$0) {
      this.a = $$0;
   }

   public static bsx a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bsx.a a() {
      return new bsx.a();
   }

   public bsx a(float $$0, float $$1, float $$2) {
      Map<bsw, List<evs>> $$3 = new EnumMap<>(bsw.class);

      for (Entry<bsw, List<evs>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bsx($$3);
   }

   private static List<evs> a(List<evs> $$0, float $$1, float $$2, float $$3) {
      List<evs> $$4 = new ArrayList<>($$0.size());

      for (evs $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public evs a(bsw $$0, int $$1, float $$2) {
      List<evs> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public evs b(bsw $$0, int $$1, float $$2) {
      evs $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public evs c(bsw $$0, int $$1, float $$2) {
      List<evs> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         evs $$4 = $$3.get(ayz.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static evs a(evs $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bsw, List<evs>> a = new EnumMap<>(bsw.class);

      a() {
      }

      public bsx.a a(bsw $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new evs((double)$$1, (double)$$2, (double)$$3));
      }

      public bsx.a a(bsw $$0, evs $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bsx a(float $$0, float $$1) {
         Map<bsw, List<evs>> $$2 = new EnumMap<>(bsw.class);

         for (bsw $$3 : bsw.values()) {
            List<evs> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bsx($$2);
      }
   }
}
