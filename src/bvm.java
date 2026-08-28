import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bvm {
   private final Map<bvl, List<fby>> a;

   bvm(Map<bvl, List<fby>> $$0) {
      this.a = $$0;
   }

   public static bvm a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bvm.a a() {
      return new bvm.a();
   }

   public bvm a(float $$0, float $$1, float $$2) {
      Map<bvl, List<fby>> $$3 = new EnumMap<>(bvl.class);

      for (Entry<bvl, List<fby>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bvm($$3);
   }

   private static List<fby> a(List<fby> $$0, float $$1, float $$2, float $$3) {
      List<fby> $$4 = new ArrayList<>($$0.size());

      for (fby $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public fby a(bvl $$0, int $$1, float $$2) {
      List<fby> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fby b(bvl $$0, int $$1, float $$2) {
      fby $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fby c(bvl $$0, int $$1, float $$2) {
      List<fby> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fby $$4 = $$3.get(bae.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fby a(fby $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bvl, List<fby>> a = new EnumMap<>(bvl.class);

      a() {
      }

      public bvm.a a(bvl $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fby((double)$$1, (double)$$2, (double)$$3));
      }

      public bvm.a a(bvl $$0, fby $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bvm a(float $$0, float $$1) {
         Map<bvl, List<fby>> $$2 = new EnumMap<>(bvl.class);

         for (bvl $$3 : bvl.values()) {
            List<fby> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bvm($$2);
      }
   }
}
