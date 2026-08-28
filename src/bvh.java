import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bvh {
   private final Map<bvg, List<fbs>> a;

   bvh(Map<bvg, List<fbs>> $$0) {
      this.a = $$0;
   }

   public static bvh a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bvh.a a() {
      return new bvh.a();
   }

   public bvh a(float $$0, float $$1, float $$2) {
      Map<bvg, List<fbs>> $$3 = new EnumMap<>(bvg.class);

      for (Entry<bvg, List<fbs>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bvh($$3);
   }

   private static List<fbs> a(List<fbs> $$0, float $$1, float $$2, float $$3) {
      List<fbs> $$4 = new ArrayList<>($$0.size());

      for (fbs $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public fbs a(bvg $$0, int $$1, float $$2) {
      List<fbs> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fbs b(bvg $$0, int $$1, float $$2) {
      fbs $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fbs c(bvg $$0, int $$1, float $$2) {
      List<fbs> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fbs $$4 = $$3.get(bae.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fbs a(fbs $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bvg, List<fbs>> a = new EnumMap<>(bvg.class);

      a() {
      }

      public bvh.a a(bvg $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fbs((double)$$1, (double)$$2, (double)$$3));
      }

      public bvh.a a(bvg $$0, fbs $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bvh a(float $$0, float $$1) {
         Map<bvg, List<fbs>> $$2 = new EnumMap<>(bvg.class);

         for (bvg $$3 : bvg.values()) {
            List<fbs> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bvh($$2);
      }
   }
}
