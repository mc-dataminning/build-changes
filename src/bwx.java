import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bwx {
   private final Map<bww, List<ffs>> a;

   bwx(Map<bww, List<ffs>> $$0) {
      this.a = $$0;
   }

   public static bwx a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bwx.a a() {
      return new bwx.a();
   }

   public bwx a(float $$0, float $$1, float $$2) {
      return new bwx(ag.a(bww.class, $$3 -> {
         List<ffs> $$4 = new ArrayList<>();

         for (ffs $$5 : this.a.get($$3)) {
            $$4.add($$5.d((double)$$0, (double)$$1, (double)$$2));
         }

         return $$4;
      }));
   }

   @Nullable
   public ffs a(bww $$0, int $$1, float $$2) {
      List<ffs> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public ffs b(bww $$0, int $$1, float $$2) {
      ffs $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public ffs c(bww $$0, int $$1, float $$2) {
      List<ffs> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         ffs $$4 = $$3.get(azq.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static ffs a(ffs $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bww, List<ffs>> a = new EnumMap<>(bww.class);

      a() {
      }

      public bwx.a a(bww $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new ffs((double)$$1, (double)$$2, (double)$$3));
      }

      public bwx.a a(bww $$0, ffs $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bwx a(float $$0, float $$1) {
         Map<bww, List<ffs>> $$2 = ag.a(bww.class, $$2x -> {
            List<ffs> $$3 = this.a.get($$2x);
            return $$3 == null ? $$2x.a($$0, $$1) : List.copyOf($$3);
         });
         return new bwx($$2);
      }
   }
}
