import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class brw {
   private final Map<brv, List<euk>> a;

   brw(Map<brv, List<euk>> $$0) {
      this.a = $$0;
   }

   public static brw a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static brw.a a() {
      return new brw.a();
   }

   public brw a(float $$0, float $$1, float $$2) {
      Map<brv, List<euk>> $$3 = new EnumMap<>(brv.class);

      for (Entry<brv, List<euk>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new brw($$3);
   }

   private static List<euk> a(List<euk> $$0, float $$1, float $$2, float $$3) {
      List<euk> $$4 = new ArrayList<>($$0.size());

      for (euk $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public euk a(brv $$0, int $$1, float $$2) {
      List<euk> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public euk b(brv $$0, int $$1, float $$2) {
      euk $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public euk c(brv $$0, int $$1, float $$2) {
      List<euk> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         euk $$4 = $$3.get(ayd.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static euk a(euk $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<brv, List<euk>> a = new EnumMap<>(brv.class);

      a() {
      }

      public brw.a a(brv $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new euk((double)$$1, (double)$$2, (double)$$3));
      }

      public brw.a a(brv $$0, euk $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public brw a(float $$0, float $$1) {
         Map<brv, List<euk>> $$2 = new EnumMap<>(brv.class);

         for (brv $$3 : brv.values()) {
            List<euk> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new brw($$2);
      }
   }
}
