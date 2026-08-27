import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class boh {
   private final Map<bog, List<eov>> a;

   boh(Map<bog, List<eov>> $$0) {
      this.a = $$0;
   }

   public static boh a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static boh.a a() {
      return new boh.a();
   }

   public boh a(float $$0, float $$1, float $$2) {
      Map<bog, List<eov>> $$3 = new EnumMap<>(bog.class);

      for (Entry<bog, List<eov>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new boh($$3);
   }

   private static List<eov> a(List<eov> $$0, float $$1, float $$2, float $$3) {
      List<eov> $$4 = new ArrayList<>($$0.size());

      for (eov $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public eov a(bog $$0, int $$1, float $$2) {
      List<eov> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public eov b(bog $$0, int $$1, float $$2) {
      eov $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public eov c(bog $$0, int $$1, float $$2) {
      List<eov> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         eov $$4 = $$3.get(awm.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static eov a(eov $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bog, List<eov>> a = new EnumMap<>(bog.class);

      a() {
      }

      public boh.a a(bog $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new eov((double)$$1, (double)$$2, (double)$$3));
      }

      public boh.a a(bog $$0, eov $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public boh a(float $$0, float $$1) {
         Map<bog, List<eov>> $$2 = new EnumMap<>(bog.class);

         for (bog $$3 : bog.values()) {
            List<eov> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new boh($$2);
      }
   }
}
