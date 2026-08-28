import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bsf {
   private final Map<bse, List<evz>> a;

   bsf(Map<bse, List<evz>> $$0) {
      this.a = $$0;
   }

   public static bsf a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bsf.a a() {
      return new bsf.a();
   }

   public bsf a(float $$0, float $$1, float $$2) {
      Map<bse, List<evz>> $$3 = new EnumMap<>(bse.class);

      for (Entry<bse, List<evz>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bsf($$3);
   }

   private static List<evz> a(List<evz> $$0, float $$1, float $$2, float $$3) {
      List<evz> $$4 = new ArrayList<>($$0.size());

      for (evz $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public evz a(bse $$0, int $$1, float $$2) {
      List<evz> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public evz b(bse $$0, int $$1, float $$2) {
      evz $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public evz c(bse $$0, int $$1, float $$2) {
      List<evz> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         evz $$4 = $$3.get(aye.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static evz a(evz $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bse, List<evz>> a = new EnumMap<>(bse.class);

      a() {
      }

      public bsf.a a(bse $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new evz((double)$$1, (double)$$2, (double)$$3));
      }

      public bsf.a a(bse $$0, evz $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bsf a(float $$0, float $$1) {
         Map<bse, List<evz>> $$2 = new EnumMap<>(bse.class);

         for (bse $$3 : bse.values()) {
            List<evz> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bsf($$2);
      }
   }
}
