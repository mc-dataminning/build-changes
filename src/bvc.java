import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bvc {
   private final Map<bvb, List<fbx>> a;

   bvc(Map<bvb, List<fbx>> $$0) {
      this.a = $$0;
   }

   public static bvc a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bvc.a a() {
      return new bvc.a();
   }

   public bvc a(float $$0, float $$1, float $$2) {
      return new bvc(af.a(bvb.class, $$3 -> {
         List<fbx> $$4 = new ArrayList<>();

         for (fbx $$5 : this.a.get($$3)) {
            $$4.add($$5.d((double)$$0, (double)$$1, (double)$$2));
         }

         return $$4;
      }));
   }

   @Nullable
   public fbx a(bvb $$0, int $$1, float $$2) {
      List<fbx> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fbx b(bvb $$0, int $$1, float $$2) {
      fbx $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fbx c(bvb $$0, int $$1, float $$2) {
      List<fbx> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fbx $$4 = $$3.get(ayz.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fbx a(fbx $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bvb, List<fbx>> a = new EnumMap<>(bvb.class);

      a() {
      }

      public bvc.a a(bvb $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fbx((double)$$1, (double)$$2, (double)$$3));
      }

      public bvc.a a(bvb $$0, fbx $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bvc a(float $$0, float $$1) {
         Map<bvb, List<fbx>> $$2 = af.a(bvb.class, $$2x -> {
            List<fbx> $$3 = this.a.get($$2x);
            return $$3 == null ? $$2x.a($$0, $$1) : List.copyOf($$3);
         });
         return new bvc($$2);
      }
   }
}
