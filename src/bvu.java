import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bvu {
   private final Map<bvt, List<fcu>> a;

   bvu(Map<bvt, List<fcu>> $$0) {
      this.a = $$0;
   }

   public static bvu a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bvu.a a() {
      return new bvu.a();
   }

   public bvu a(float $$0, float $$1, float $$2) {
      return new bvu(af.a(bvt.class, $$3 -> {
         List<fcu> $$4 = new ArrayList<>();

         for (fcu $$5 : this.a.get($$3)) {
            $$4.add($$5.d((double)$$0, (double)$$1, (double)$$2));
         }

         return $$4;
      }));
   }

   @Nullable
   public fcu a(bvt $$0, int $$1, float $$2) {
      List<fcu> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fcu b(bvt $$0, int $$1, float $$2) {
      fcu $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fcu c(bvt $$0, int $$1, float $$2) {
      List<fcu> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fcu $$4 = $$3.get(azk.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fcu a(fcu $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bvt, List<fcu>> a = new EnumMap<>(bvt.class);

      a() {
      }

      public bvu.a a(bvt $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fcu((double)$$1, (double)$$2, (double)$$3));
      }

      public bvu.a a(bvt $$0, fcu $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bvu a(float $$0, float $$1) {
         Map<bvt, List<fcu>> $$2 = af.a(bvt.class, $$2x -> {
            List<fcu> $$3 = this.a.get($$2x);
            return $$3 == null ? $$2x.a($$0, $$1) : List.copyOf($$3);
         });
         return new bvu($$2);
      }
   }
}
