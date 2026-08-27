import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class boy {
   private final Map<box, List<epr>> a;

   boy(Map<box, List<epr>> $$0) {
      this.a = $$0;
   }

   public static boy a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static boy.a a() {
      return new boy.a();
   }

   public boy a(float $$0, float $$1, float $$2) {
      Map<box, List<epr>> $$3 = new EnumMap<>(box.class);

      for (Entry<box, List<epr>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new boy($$3);
   }

   private static List<epr> a(List<epr> $$0, float $$1, float $$2, float $$3) {
      List<epr> $$4 = new ArrayList<>($$0.size());

      for (epr $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public epr a(box $$0, int $$1, float $$2) {
      List<epr> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public epr b(box $$0, int $$1, float $$2) {
      epr $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public epr c(box $$0, int $$1, float $$2) {
      List<epr> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         epr $$4 = $$3.get(aww.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static epr a(epr $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<box, List<epr>> a = new EnumMap<>(box.class);

      a() {
      }

      public boy.a a(box $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new epr((double)$$1, (double)$$2, (double)$$3));
      }

      public boy.a a(box $$0, epr $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public boy a(float $$0, float $$1) {
         Map<box, List<epr>> $$2 = new EnumMap<>(box.class);

         for (box $$3 : box.values()) {
            List<epr> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new boy($$2);
      }
   }
}
