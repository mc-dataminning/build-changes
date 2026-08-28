import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bwv {
   private final Map<bwu, List<ffq>> a;

   bwv(Map<bwu, List<ffq>> $$0) {
      this.a = $$0;
   }

   public static bwv a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bwv.a a() {
      return new bwv.a();
   }

   public bwv a(float $$0, float $$1, float $$2) {
      return new bwv(ag.a(bwu.class, $$3 -> {
         List<ffq> $$4 = new ArrayList<>();

         for (ffq $$5 : this.a.get($$3)) {
            $$4.add($$5.d((double)$$0, (double)$$1, (double)$$2));
         }

         return $$4;
      }));
   }

   @Nullable
   public ffq a(bwu $$0, int $$1, float $$2) {
      List<ffq> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public ffq b(bwu $$0, int $$1, float $$2) {
      ffq $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public ffq c(bwu $$0, int $$1, float $$2) {
      List<ffq> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         ffq $$4 = $$3.get(azo.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static ffq a(ffq $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bwu, List<ffq>> a = new EnumMap<>(bwu.class);

      a() {
      }

      public bwv.a a(bwu $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new ffq((double)$$1, (double)$$2, (double)$$3));
      }

      public bwv.a a(bwu $$0, ffq $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bwv a(float $$0, float $$1) {
         Map<bwu, List<ffq>> $$2 = ag.a(bwu.class, $$2x -> {
            List<ffq> $$3 = this.a.get($$2x);
            return $$3 == null ? $$2x.a($$0, $$1) : List.copyOf($$3);
         });
         return new bwv($$2);
      }
   }
}
