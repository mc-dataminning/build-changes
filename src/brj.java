import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class brj {
   private final Map<bri, List<etp>> a;

   brj(Map<bri, List<etp>> $$0) {
      this.a = $$0;
   }

   public static brj a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static brj.a a() {
      return new brj.a();
   }

   public brj a(float $$0, float $$1, float $$2) {
      Map<bri, List<etp>> $$3 = new EnumMap<>(bri.class);

      for (Entry<bri, List<etp>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new brj($$3);
   }

   private static List<etp> a(List<etp> $$0, float $$1, float $$2, float $$3) {
      List<etp> $$4 = new ArrayList<>($$0.size());

      for (etp $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public etp a(bri $$0, int $$1, float $$2) {
      List<etp> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public etp b(bri $$0, int $$1, float $$2) {
      etp $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public etp c(bri $$0, int $$1, float $$2) {
      List<etp> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         etp $$4 = $$3.get(axz.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static etp a(etp $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bri, List<etp>> a = new EnumMap<>(bri.class);

      a() {
      }

      public brj.a a(bri $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new etp((double)$$1, (double)$$2, (double)$$3));
      }

      public brj.a a(bri $$0, etp $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public brj a(float $$0, float $$1) {
         Map<bri, List<etp>> $$2 = new EnumMap<>(bri.class);

         for (bri $$3 : bri.values()) {
            List<etp> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new brj($$2);
      }
   }
}
