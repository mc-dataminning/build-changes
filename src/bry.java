import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bry {
   private final Map<brx, List<eum>> a;

   bry(Map<brx, List<eum>> $$0) {
      this.a = $$0;
   }

   public static bry a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bry.a a() {
      return new bry.a();
   }

   public bry a(float $$0, float $$1, float $$2) {
      Map<brx, List<eum>> $$3 = new EnumMap<>(brx.class);

      for (Entry<brx, List<eum>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bry($$3);
   }

   private static List<eum> a(List<eum> $$0, float $$1, float $$2, float $$3) {
      List<eum> $$4 = new ArrayList<>($$0.size());

      for (eum $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public eum a(brx $$0, int $$1, float $$2) {
      List<eum> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public eum b(brx $$0, int $$1, float $$2) {
      eum $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public eum c(brx $$0, int $$1, float $$2) {
      List<eum> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         eum $$4 = $$3.get(ayf.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static eum a(eum $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<brx, List<eum>> a = new EnumMap<>(brx.class);

      a() {
      }

      public bry.a a(brx $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new eum((double)$$1, (double)$$2, (double)$$3));
      }

      public bry.a a(brx $$0, eum $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bry a(float $$0, float $$1) {
         Map<brx, List<eum>> $$2 = new EnumMap<>(brx.class);

         for (brx $$3 : brx.values()) {
            List<eum> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bry($$2);
      }
   }
}
