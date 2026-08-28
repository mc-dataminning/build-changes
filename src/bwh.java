import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bwh {
   private final Map<bwg, List<feq>> a;

   bwh(Map<bwg, List<feq>> $$0) {
      this.a = $$0;
   }

   public static bwh a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bwh.a a() {
      return new bwh.a();
   }

   public bwh a(float $$0, float $$1, float $$2) {
      return new bwh(af.a(bwg.class, $$3 -> {
         List<feq> $$4 = new ArrayList<>();

         for (feq $$5 : this.a.get($$3)) {
            $$4.add($$5.d((double)$$0, (double)$$1, (double)$$2));
         }

         return $$4;
      }));
   }

   @Nullable
   public feq a(bwg $$0, int $$1, float $$2) {
      List<feq> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public feq b(bwg $$0, int $$1, float $$2) {
      feq $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public feq c(bwg $$0, int $$1, float $$2) {
      List<feq> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         feq $$4 = $$3.get(azm.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static feq a(feq $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bwg, List<feq>> a = new EnumMap<>(bwg.class);

      a() {
      }

      public bwh.a a(bwg $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new feq((double)$$1, (double)$$2, (double)$$3));
      }

      public bwh.a a(bwg $$0, feq $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bwh a(float $$0, float $$1) {
         Map<bwg, List<feq>> $$2 = af.a(bwg.class, $$2x -> {
            List<feq> $$3 = this.a.get($$2x);
            return $$3 == null ? $$2x.a($$0, $$1) : List.copyOf($$3);
         });
         return new bwh($$2);
      }
   }
}
