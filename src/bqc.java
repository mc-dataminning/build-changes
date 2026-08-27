import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bqc {
   private final Map<bqb, List<esj>> a;

   bqc(Map<bqb, List<esj>> $$0) {
      this.a = $$0;
   }

   public static bqc a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bqc.a a() {
      return new bqc.a();
   }

   public bqc a(float $$0, float $$1, float $$2) {
      Map<bqb, List<esj>> $$3 = new EnumMap<>(bqb.class);

      for (Entry<bqb, List<esj>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bqc($$3);
   }

   private static List<esj> a(List<esj> $$0, float $$1, float $$2, float $$3) {
      List<esj> $$4 = new ArrayList<>($$0.size());

      for (esj $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public esj a(bqb $$0, int $$1, float $$2) {
      List<esj> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public esj b(bqb $$0, int $$1, float $$2) {
      esj $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public esj c(bqb $$0, int $$1, float $$2) {
      List<esj> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         esj $$4 = $$3.get(axm.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static esj a(esj $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bqb, List<esj>> a = new EnumMap<>(bqb.class);

      a() {
      }

      public bqc.a a(bqb $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new esj((double)$$1, (double)$$2, (double)$$3));
      }

      public bqc.a a(bqb $$0, esj $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bqc a(float $$0, float $$1) {
         Map<bqb, List<esj>> $$2 = new EnumMap<>(bqb.class);

         for (bqb $$3 : bqb.values()) {
            List<esj> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bqc($$2);
      }
   }
}
