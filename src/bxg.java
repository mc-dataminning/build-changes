import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bxg {
   private final Map<bxf, List<fgc>> a;

   bxg(Map<bxf, List<fgc>> $$0) {
      this.a = $$0;
   }

   public static bxg a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bxg.a a() {
      return new bxg.a();
   }

   public bxg a(float $$0, float $$1, float $$2) {
      return new bxg(ag.a(bxf.class, $$3 -> {
         List<fgc> $$4 = new ArrayList<>();

         for (fgc $$5 : this.a.get($$3)) {
            $$4.add($$5.d((double)$$0, (double)$$1, (double)$$2));
         }

         return $$4;
      }));
   }

   @Nullable
   public fgc a(bxf $$0, int $$1, float $$2) {
      List<fgc> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fgc b(bxf $$0, int $$1, float $$2) {
      fgc $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fgc c(bxf $$0, int $$1, float $$2) {
      List<fgc> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fgc $$4 = $$3.get(azz.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fgc a(fgc $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bxf, List<fgc>> a = new EnumMap<>(bxf.class);

      a() {
      }

      public bxg.a a(bxf $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fgc((double)$$1, (double)$$2, (double)$$3));
      }

      public bxg.a a(bxf $$0, fgc $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bxg a(float $$0, float $$1) {
         Map<bxf, List<fgc>> $$2 = ag.a(bxf.class, $$2x -> {
            List<fgc> $$3 = this.a.get($$2x);
            return $$3 == null ? $$2x.a($$0, $$1) : List.copyOf($$3);
         });
         return new bxg($$2);
      }
   }
}
