import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bsw {
   private final Map<bsv, List<evr>> a;

   bsw(Map<bsv, List<evr>> $$0) {
      this.a = $$0;
   }

   public static bsw a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bsw.a a() {
      return new bsw.a();
   }

   public bsw a(float $$0, float $$1, float $$2) {
      Map<bsv, List<evr>> $$3 = new EnumMap<>(bsv.class);

      for (Entry<bsv, List<evr>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bsw($$3);
   }

   private static List<evr> a(List<evr> $$0, float $$1, float $$2, float $$3) {
      List<evr> $$4 = new ArrayList<>($$0.size());

      for (evr $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public evr a(bsv $$0, int $$1, float $$2) {
      List<evr> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public evr b(bsv $$0, int $$1, float $$2) {
      evr $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public evr c(bsv $$0, int $$1, float $$2) {
      List<evr> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         evr $$4 = $$3.get(ayz.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static evr a(evr $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bsv, List<evr>> a = new EnumMap<>(bsv.class);

      a() {
      }

      public bsw.a a(bsv $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new evr((double)$$1, (double)$$2, (double)$$3));
      }

      public bsw.a a(bsv $$0, evr $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bsw a(float $$0, float $$1) {
         Map<bsv, List<evr>> $$2 = new EnumMap<>(bsv.class);

         for (bsv $$3 : bsv.values()) {
            List<evr> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bsw($$2);
      }
   }
}
