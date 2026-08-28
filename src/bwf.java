import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bwf {
   private final Map<bwe, List<fei>> a;

   bwf(Map<bwe, List<fei>> $$0) {
      this.a = $$0;
   }

   public static bwf a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bwf.a a() {
      return new bwf.a();
   }

   public bwf a(float $$0, float $$1, float $$2) {
      return new bwf(af.a(bwe.class, $$3 -> {
         List<fei> $$4 = new ArrayList<>();

         for (fei $$5 : this.a.get($$3)) {
            $$4.add($$5.d((double)$$0, (double)$$1, (double)$$2));
         }

         return $$4;
      }));
   }

   @Nullable
   public fei a(bwe $$0, int $$1, float $$2) {
      List<fei> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fei b(bwe $$0, int $$1, float $$2) {
      fei $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fei c(bwe $$0, int $$1, float $$2) {
      List<fei> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fei $$4 = $$3.get(azm.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fei a(fei $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bwe, List<fei>> a = new EnumMap<>(bwe.class);

      a() {
      }

      public bwf.a a(bwe $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fei((double)$$1, (double)$$2, (double)$$3));
      }

      public bwf.a a(bwe $$0, fei $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bwf a(float $$0, float $$1) {
         Map<bwe, List<fei>> $$2 = af.a(bwe.class, $$2x -> {
            List<fei> $$3 = this.a.get($$2x);
            return $$3 == null ? $$2x.a($$0, $$1) : List.copyOf($$3);
         });
         return new bwf($$2);
      }
   }
}
