import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class btt {
   private final Map<bts, List<eyw>> a;

   btt(Map<bts, List<eyw>> $$0) {
      this.a = $$0;
   }

   public static btt a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static btt.a a() {
      return new btt.a();
   }

   public btt a(float $$0, float $$1, float $$2) {
      Map<bts, List<eyw>> $$3 = new EnumMap<>(bts.class);

      for (Entry<bts, List<eyw>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new btt($$3);
   }

   private static List<eyw> a(List<eyw> $$0, float $$1, float $$2, float $$3) {
      List<eyw> $$4 = new ArrayList<>($$0.size());

      for (eyw $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public eyw a(bts $$0, int $$1, float $$2) {
      List<eyw> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public eyw b(bts $$0, int $$1, float $$2) {
      eyw $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public eyw c(bts $$0, int $$1, float $$2) {
      List<eyw> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         eyw $$4 = $$3.get(azf.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static eyw a(eyw $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bts, List<eyw>> a = new EnumMap<>(bts.class);

      a() {
      }

      public btt.a a(bts $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new eyw((double)$$1, (double)$$2, (double)$$3));
      }

      public btt.a a(bts $$0, eyw $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public btt a(float $$0, float $$1) {
         Map<bts, List<eyw>> $$2 = new EnumMap<>(bts.class);

         for (bts $$3 : bts.values()) {
            List<eyw> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new btt($$2);
      }
   }
}
