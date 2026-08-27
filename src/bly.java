import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bly {
   private final Map<blx, List<emc>> a;

   bly(Map<blx, List<emc>> $$0) {
      this.a = $$0;
   }

   public static bly a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bly.a a() {
      return new bly.a();
   }

   public bly a(float $$0, float $$1, float $$2) {
      Map<blx, List<emc>> $$3 = new EnumMap<>(blx.class);

      for (Entry<blx, List<emc>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bly($$3);
   }

   private static List<emc> a(List<emc> $$0, float $$1, float $$2, float $$3) {
      List<emc> $$4 = new ArrayList<>($$0.size());

      for (emc $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public emc a(blx $$0, int $$1, float $$2) {
      List<emc> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public emc b(blx $$0, int $$1, float $$2) {
      emc $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public emc c(blx $$0, int $$1, float $$2) {
      List<emc> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         emc $$4 = $$3.get(aup.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static emc a(emc $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<blx, List<emc>> a = new EnumMap<>(blx.class);

      a() {
      }

      public bly.a a(blx $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new emc((double)$$1, (double)$$2, (double)$$3));
      }

      public bly.a a(blx $$0, emc $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bly a(float $$0, float $$1) {
         Map<blx, List<emc>> $$2 = new EnumMap<>(blx.class);

         for (blx $$3 : blx.values()) {
            List<emc> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bly($$2);
      }
   }
}
