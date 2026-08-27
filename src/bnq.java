import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bnq {
   private final Map<bnp, List<ens>> a;

   bnq(Map<bnp, List<ens>> $$0) {
      this.a = $$0;
   }

   public static bnq a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bnq.a a() {
      return new bnq.a();
   }

   public bnq a(float $$0, float $$1, float $$2) {
      Map<bnp, List<ens>> $$3 = new EnumMap<>(bnp.class);

      for (Entry<bnp, List<ens>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bnq($$3);
   }

   private static List<ens> a(List<ens> $$0, float $$1, float $$2, float $$3) {
      List<ens> $$4 = new ArrayList<>($$0.size());

      for (ens $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public ens a(bnp $$0, int $$1, float $$2) {
      List<ens> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public ens b(bnp $$0, int $$1, float $$2) {
      ens $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public ens c(bnp $$0, int $$1, float $$2) {
      List<ens> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         ens $$4 = $$3.get(awh.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static ens a(ens $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bnp, List<ens>> a = new EnumMap<>(bnp.class);

      a() {
      }

      public bnq.a a(bnp $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new ens((double)$$1, (double)$$2, (double)$$3));
      }

      public bnq.a a(bnp $$0, ens $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bnq a(float $$0, float $$1) {
         Map<bnp, List<ens>> $$2 = new EnumMap<>(bnp.class);

         for (bnp $$3 : bnp.values()) {
            List<ens> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bnq($$2);
      }
   }
}
