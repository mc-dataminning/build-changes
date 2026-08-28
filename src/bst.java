import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bst {
   private final Map<bss, List<exa>> a;

   bst(Map<bss, List<exa>> $$0) {
      this.a = $$0;
   }

   public static bst a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bst.a a() {
      return new bst.a();
   }

   public bst a(float $$0, float $$1, float $$2) {
      Map<bss, List<exa>> $$3 = new EnumMap<>(bss.class);

      for (Entry<bss, List<exa>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bst($$3);
   }

   private static List<exa> a(List<exa> $$0, float $$1, float $$2, float $$3) {
      List<exa> $$4 = new ArrayList<>($$0.size());

      for (exa $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public exa a(bss $$0, int $$1, float $$2) {
      List<exa> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public exa b(bss $$0, int $$1, float $$2) {
      exa $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public exa c(bss $$0, int $$1, float $$2) {
      List<exa> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         exa $$4 = $$3.get(ayo.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static exa a(exa $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bss, List<exa>> a = new EnumMap<>(bss.class);

      a() {
      }

      public bst.a a(bss $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new exa((double)$$1, (double)$$2, (double)$$3));
      }

      public bst.a a(bss $$0, exa $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bst a(float $$0, float $$1) {
         Map<bss, List<exa>> $$2 = new EnumMap<>(bss.class);

         for (bss $$3 : bss.values()) {
            List<exa> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bst($$2);
      }
   }
}
