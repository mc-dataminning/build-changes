import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bwk {
   private final Map<bwj, List<fex>> a;

   bwk(Map<bwj, List<fex>> $$0) {
      this.a = $$0;
   }

   public static bwk a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bwk.a a() {
      return new bwk.a();
   }

   public bwk a(float $$0, float $$1, float $$2) {
      return new bwk(ag.a(bwj.class, $$3 -> {
         List<fex> $$4 = new ArrayList<>();

         for (fex $$5 : this.a.get($$3)) {
            $$4.add($$5.d((double)$$0, (double)$$1, (double)$$2));
         }

         return $$4;
      }));
   }

   @Nullable
   public fex a(bwj $$0, int $$1, float $$2) {
      List<fex> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fex b(bwj $$0, int $$1, float $$2) {
      fex $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fex c(bwj $$0, int $$1, float $$2) {
      List<fex> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fex $$4 = $$3.get(azm.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fex a(fex $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bwj, List<fex>> a = new EnumMap<>(bwj.class);

      a() {
      }

      public bwk.a a(bwj $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fex((double)$$1, (double)$$2, (double)$$3));
      }

      public bwk.a a(bwj $$0, fex $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bwk a(float $$0, float $$1) {
         Map<bwj, List<fex>> $$2 = ag.a(bwj.class, $$2x -> {
            List<fex> $$3 = this.a.get($$2x);
            return $$3 == null ? $$2x.a($$0, $$1) : List.copyOf($$3);
         });
         return new bwk($$2);
      }
   }
}
