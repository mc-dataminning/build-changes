import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bun {
   private final Map<bum, List<ezy>> a;

   bun(Map<bum, List<ezy>> $$0) {
      this.a = $$0;
   }

   public static bun a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bun.a a() {
      return new bun.a();
   }

   public bun a(float $$0, float $$1, float $$2) {
      Map<bum, List<ezy>> $$3 = new EnumMap<>(bum.class);

      for (Entry<bum, List<ezy>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bun($$3);
   }

   private static List<ezy> a(List<ezy> $$0, float $$1, float $$2, float $$3) {
      List<ezy> $$4 = new ArrayList<>($$0.size());

      for (ezy $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public ezy a(bum $$0, int $$1, float $$2) {
      List<ezy> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public ezy b(bum $$0, int $$1, float $$2) {
      ezy $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public ezy c(bum $$0, int $$1, float $$2) {
      List<ezy> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         ezy $$4 = $$3.get(azm.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static ezy a(ezy $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bum, List<ezy>> a = new EnumMap<>(bum.class);

      a() {
      }

      public bun.a a(bum $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new ezy((double)$$1, (double)$$2, (double)$$3));
      }

      public bun.a a(bum $$0, ezy $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bun a(float $$0, float $$1) {
         Map<bum, List<ezy>> $$2 = new EnumMap<>(bum.class);

         for (bum $$3 : bum.values()) {
            List<ezy> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bun($$2);
      }
   }
}
