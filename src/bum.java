import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bum {
   private final Map<bul, List<faz>> a;

   bum(Map<bul, List<faz>> $$0) {
      this.a = $$0;
   }

   public static bum a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bum.a a() {
      return new bum.a();
   }

   public bum a(float $$0, float $$1, float $$2) {
      Map<bul, List<faz>> $$3 = new EnumMap<>(bul.class);

      for (Entry<bul, List<faz>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bum($$3);
   }

   private static List<faz> a(List<faz> $$0, float $$1, float $$2, float $$3) {
      List<faz> $$4 = new ArrayList<>($$0.size());

      for (faz $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public faz a(bul $$0, int $$1, float $$2) {
      List<faz> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public faz b(bul $$0, int $$1, float $$2) {
      faz $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public faz c(bul $$0, int $$1, float $$2) {
      List<faz> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         faz $$4 = $$3.get(ayz.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static faz a(faz $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bul, List<faz>> a = new EnumMap<>(bul.class);

      a() {
      }

      public bum.a a(bul $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new faz((double)$$1, (double)$$2, (double)$$3));
      }

      public bum.a a(bul $$0, faz $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bum a(float $$0, float $$1) {
         Map<bul, List<faz>> $$2 = new EnumMap<>(bul.class);

         for (bul $$3 : bul.values()) {
            List<faz> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bum($$2);
      }
   }
}
