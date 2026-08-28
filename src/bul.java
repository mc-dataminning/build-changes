import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bul {
   private final Map<buk, List<fay>> a;

   bul(Map<buk, List<fay>> $$0) {
      this.a = $$0;
   }

   public static bul a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bul.a a() {
      return new bul.a();
   }

   public bul a(float $$0, float $$1, float $$2) {
      Map<buk, List<fay>> $$3 = new EnumMap<>(buk.class);

      for (Entry<buk, List<fay>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bul($$3);
   }

   private static List<fay> a(List<fay> $$0, float $$1, float $$2, float $$3) {
      List<fay> $$4 = new ArrayList<>($$0.size());

      for (fay $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public fay a(buk $$0, int $$1, float $$2) {
      List<fay> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fay b(buk $$0, int $$1, float $$2) {
      fay $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fay c(buk $$0, int $$1, float $$2) {
      List<fay> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fay $$4 = $$3.get(ayy.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fay a(fay $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<buk, List<fay>> a = new EnumMap<>(buk.class);

      a() {
      }

      public bul.a a(buk $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fay((double)$$1, (double)$$2, (double)$$3));
      }

      public bul.a a(buk $$0, fay $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bul a(float $$0, float $$1) {
         Map<buk, List<fay>> $$2 = new EnumMap<>(buk.class);

         for (buk $$3 : buk.values()) {
            List<fay> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bul($$2);
      }
   }
}
