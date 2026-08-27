import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bpx {
   private final Map<bpw, List<esa>> a;

   bpx(Map<bpw, List<esa>> $$0) {
      this.a = $$0;
   }

   public static bpx a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bpx.a a() {
      return new bpx.a();
   }

   public bpx a(float $$0, float $$1, float $$2) {
      Map<bpw, List<esa>> $$3 = new EnumMap<>(bpw.class);

      for (Entry<bpw, List<esa>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bpx($$3);
   }

   private static List<esa> a(List<esa> $$0, float $$1, float $$2, float $$3) {
      List<esa> $$4 = new ArrayList<>($$0.size());

      for (esa $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public esa a(bpw $$0, int $$1, float $$2) {
      List<esa> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public esa b(bpw $$0, int $$1, float $$2) {
      esa $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public esa c(bpw $$0, int $$1, float $$2) {
      List<esa> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         esa $$4 = $$3.get(axk.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static esa a(esa $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bpw, List<esa>> a = new EnumMap<>(bpw.class);

      a() {
      }

      public bpx.a a(bpw $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new esa((double)$$1, (double)$$2, (double)$$3));
      }

      public bpx.a a(bpw $$0, esa $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bpx a(float $$0, float $$1) {
         Map<bpw, List<esa>> $$2 = new EnumMap<>(bpw.class);

         for (bpw $$3 : bpw.values()) {
            List<esa> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bpx($$2);
      }
   }
}
