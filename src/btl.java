import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class btl {
   private final Map<btk, List<eye>> a;

   btl(Map<btk, List<eye>> $$0) {
      this.a = $$0;
   }

   public static btl a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static btl.a a() {
      return new btl.a();
   }

   public btl a(float $$0, float $$1, float $$2) {
      Map<btk, List<eye>> $$3 = new EnumMap<>(btk.class);

      for (Entry<btk, List<eye>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new btl($$3);
   }

   private static List<eye> a(List<eye> $$0, float $$1, float $$2, float $$3) {
      List<eye> $$4 = new ArrayList<>($$0.size());

      for (eye $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public eye a(btk $$0, int $$1, float $$2) {
      List<eye> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public eye b(btk $$0, int $$1, float $$2) {
      eye $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public eye c(btk $$0, int $$1, float $$2) {
      List<eye> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         eye $$4 = $$3.get(azc.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static eye a(eye $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<btk, List<eye>> a = new EnumMap<>(btk.class);

      a() {
      }

      public btl.a a(btk $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new eye((double)$$1, (double)$$2, (double)$$3));
      }

      public btl.a a(btk $$0, eye $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public btl a(float $$0, float $$1) {
         Map<btk, List<eye>> $$2 = new EnumMap<>(btk.class);

         for (btk $$3 : btk.values()) {
            List<eye> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new btl($$2);
      }
   }
}
