import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bwc {
   private final Map<bwb, List<fdw>> a;

   bwc(Map<bwb, List<fdw>> $$0) {
      this.a = $$0;
   }

   public static bwc a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bwc.a a() {
      return new bwc.a();
   }

   public bwc a(float $$0, float $$1, float $$2) {
      return new bwc(af.a(bwb.class, $$3 -> {
         List<fdw> $$4 = new ArrayList<>();

         for (fdw $$5 : this.a.get($$3)) {
            $$4.add($$5.d((double)$$0, (double)$$1, (double)$$2));
         }

         return $$4;
      }));
   }

   @Nullable
   public fdw a(bwb $$0, int $$1, float $$2) {
      List<fdw> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fdw b(bwb $$0, int $$1, float $$2) {
      fdw $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fdw c(bwb $$0, int $$1, float $$2) {
      List<fdw> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fdw $$4 = $$3.get(azk.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fdw a(fdw $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bwb, List<fdw>> a = new EnumMap<>(bwb.class);

      a() {
      }

      public bwc.a a(bwb $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fdw((double)$$1, (double)$$2, (double)$$3));
      }

      public bwc.a a(bwb $$0, fdw $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bwc a(float $$0, float $$1) {
         Map<bwb, List<fdw>> $$2 = af.a(bwb.class, $$2x -> {
            List<fdw> $$3 = this.a.get($$2x);
            return $$3 == null ? $$2x.a($$0, $$1) : List.copyOf($$3);
         });
         return new bwc($$2);
      }
   }
}
