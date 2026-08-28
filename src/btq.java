import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class btq {
   private final Map<btp, List<eys>> a;

   btq(Map<btp, List<eys>> $$0) {
      this.a = $$0;
   }

   public static btq a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static btq.a a() {
      return new btq.a();
   }

   public btq a(float $$0, float $$1, float $$2) {
      Map<btp, List<eys>> $$3 = new EnumMap<>(btp.class);

      for (Entry<btp, List<eys>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new btq($$3);
   }

   private static List<eys> a(List<eys> $$0, float $$1, float $$2, float $$3) {
      List<eys> $$4 = new ArrayList<>($$0.size());

      for (eys $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public eys a(btp $$0, int $$1, float $$2) {
      List<eys> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public eys b(btp $$0, int $$1, float $$2) {
      eys $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public eys c(btp $$0, int $$1, float $$2) {
      List<eys> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         eys $$4 = $$3.get(azd.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static eys a(eys $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<btp, List<eys>> a = new EnumMap<>(btp.class);

      a() {
      }

      public btq.a a(btp $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new eys((double)$$1, (double)$$2, (double)$$3));
      }

      public btq.a a(btp $$0, eys $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public btq a(float $$0, float $$1) {
         Map<btp, List<eys>> $$2 = new EnumMap<>(btp.class);

         for (btp $$3 : btp.values()) {
            List<eys> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new btq($$2);
      }
   }
}
