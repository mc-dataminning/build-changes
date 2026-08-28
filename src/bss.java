import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bss {
   private final Map<bsr, List<eww>> a;

   bss(Map<bsr, List<eww>> $$0) {
      this.a = $$0;
   }

   public static bss a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bss.a a() {
      return new bss.a();
   }

   public bss a(float $$0, float $$1, float $$2) {
      Map<bsr, List<eww>> $$3 = new EnumMap<>(bsr.class);

      for (Entry<bsr, List<eww>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bss($$3);
   }

   private static List<eww> a(List<eww> $$0, float $$1, float $$2, float $$3) {
      List<eww> $$4 = new ArrayList<>($$0.size());

      for (eww $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public eww a(bsr $$0, int $$1, float $$2) {
      List<eww> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public eww b(bsr $$0, int $$1, float $$2) {
      eww $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public eww c(bsr $$0, int $$1, float $$2) {
      List<eww> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         eww $$4 = $$3.get(ayn.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static eww a(eww $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bsr, List<eww>> a = new EnumMap<>(bsr.class);

      a() {
      }

      public bss.a a(bsr $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new eww((double)$$1, (double)$$2, (double)$$3));
      }

      public bss.a a(bsr $$0, eww $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bss a(float $$0, float $$1) {
         Map<bsr, List<eww>> $$2 = new EnumMap<>(bsr.class);

         for (bsr $$3 : bsr.values()) {
            List<eww> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bss($$2);
      }
   }
}
