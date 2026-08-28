import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class buo {
   private final Map<bun, List<fbb>> a;

   buo(Map<bun, List<fbb>> $$0) {
      this.a = $$0;
   }

   public static buo a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static buo.a a() {
      return new buo.a();
   }

   public buo a(float $$0, float $$1, float $$2) {
      Map<bun, List<fbb>> $$3 = new EnumMap<>(bun.class);

      for (Entry<bun, List<fbb>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new buo($$3);
   }

   private static List<fbb> a(List<fbb> $$0, float $$1, float $$2, float $$3) {
      List<fbb> $$4 = new ArrayList<>($$0.size());

      for (fbb $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public fbb a(bun $$0, int $$1, float $$2) {
      List<fbb> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fbb b(bun $$0, int $$1, float $$2) {
      fbb $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fbb c(bun $$0, int $$1, float $$2) {
      List<fbb> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fbb $$4 = $$3.get(ayz.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fbb a(fbb $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bun, List<fbb>> a = new EnumMap<>(bun.class);

      a() {
      }

      public buo.a a(bun $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fbb((double)$$1, (double)$$2, (double)$$3));
      }

      public buo.a a(bun $$0, fbb $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public buo a(float $$0, float $$1) {
         Map<bun, List<fbb>> $$2 = new EnumMap<>(bun.class);

         for (bun $$3 : bun.values()) {
            List<fbb> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new buo($$2);
      }
   }
}
