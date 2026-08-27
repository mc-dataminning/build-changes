import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class boz {
   private final Map<boy, List<ept>> a;

   boz(Map<boy, List<ept>> $$0) {
      this.a = $$0;
   }

   public static boz a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static boz.a a() {
      return new boz.a();
   }

   public boz a(float $$0, float $$1, float $$2) {
      Map<boy, List<ept>> $$3 = new EnumMap<>(boy.class);

      for (Entry<boy, List<ept>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new boz($$3);
   }

   private static List<ept> a(List<ept> $$0, float $$1, float $$2, float $$3) {
      List<ept> $$4 = new ArrayList<>($$0.size());

      for (ept $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public ept a(boy $$0, int $$1, float $$2) {
      List<ept> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public ept b(boy $$0, int $$1, float $$2) {
      ept $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public ept c(boy $$0, int $$1, float $$2) {
      List<ept> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         ept $$4 = $$3.get(aww.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static ept a(ept $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<boy, List<ept>> a = new EnumMap<>(boy.class);

      a() {
      }

      public boz.a a(boy $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new ept((double)$$1, (double)$$2, (double)$$3));
      }

      public boz.a a(boy $$0, ept $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public boz a(float $$0, float $$1) {
         Map<boy, List<ept>> $$2 = new EnumMap<>(boy.class);

         for (boy $$3 : boy.values()) {
            List<ept> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new boz($$2);
      }
   }
}
