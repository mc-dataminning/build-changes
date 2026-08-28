import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bvl {
   private final Map<bvk, List<fbx>> a;

   bvl(Map<bvk, List<fbx>> $$0) {
      this.a = $$0;
   }

   public static bvl a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bvl.a a() {
      return new bvl.a();
   }

   public bvl a(float $$0, float $$1, float $$2) {
      Map<bvk, List<fbx>> $$3 = new EnumMap<>(bvk.class);

      for (Entry<bvk, List<fbx>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bvl($$3);
   }

   private static List<fbx> a(List<fbx> $$0, float $$1, float $$2, float $$3) {
      List<fbx> $$4 = new ArrayList<>($$0.size());

      for (fbx $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public fbx a(bvk $$0, int $$1, float $$2) {
      List<fbx> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fbx b(bvk $$0, int $$1, float $$2) {
      fbx $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fbx c(bvk $$0, int $$1, float $$2) {
      List<fbx> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fbx $$4 = $$3.get(bae.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fbx a(fbx $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bvk, List<fbx>> a = new EnumMap<>(bvk.class);

      a() {
      }

      public bvl.a a(bvk $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fbx((double)$$1, (double)$$2, (double)$$3));
      }

      public bvl.a a(bvk $$0, fbx $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bvl a(float $$0, float $$1) {
         Map<bvk, List<fbx>> $$2 = new EnumMap<>(bvk.class);

         for (bvk $$3 : bvk.values()) {
            List<fbx> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bvl($$2);
      }
   }
}
