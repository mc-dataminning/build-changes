import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bsi {
   private final Map<bsh, List<ewf>> a;

   bsi(Map<bsh, List<ewf>> $$0) {
      this.a = $$0;
   }

   public static bsi a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bsi.a a() {
      return new bsi.a();
   }

   public bsi a(float $$0, float $$1, float $$2) {
      Map<bsh, List<ewf>> $$3 = new EnumMap<>(bsh.class);

      for (Entry<bsh, List<ewf>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bsi($$3);
   }

   private static List<ewf> a(List<ewf> $$0, float $$1, float $$2, float $$3) {
      List<ewf> $$4 = new ArrayList<>($$0.size());

      for (ewf $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public ewf a(bsh $$0, int $$1, float $$2) {
      List<ewf> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public ewf b(bsh $$0, int $$1, float $$2) {
      ewf $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public ewf c(bsh $$0, int $$1, float $$2) {
      List<ewf> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         ewf $$4 = $$3.get(ayg.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static ewf a(ewf $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bsh, List<ewf>> a = new EnumMap<>(bsh.class);

      a() {
      }

      public bsi.a a(bsh $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new ewf((double)$$1, (double)$$2, (double)$$3));
      }

      public bsi.a a(bsh $$0, ewf $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bsi a(float $$0, float $$1) {
         Map<bsh, List<ewf>> $$2 = new EnumMap<>(bsh.class);

         for (bsh $$3 : bsh.values()) {
            List<ewf> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bsi($$2);
      }
   }
}
