import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class buk {
   private final Map<buj, List<ezr>> a;

   buk(Map<buj, List<ezr>> $$0) {
      this.a = $$0;
   }

   public static buk a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static buk.a a() {
      return new buk.a();
   }

   public buk a(float $$0, float $$1, float $$2) {
      Map<buj, List<ezr>> $$3 = new EnumMap<>(buj.class);

      for (Entry<buj, List<ezr>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new buk($$3);
   }

   private static List<ezr> a(List<ezr> $$0, float $$1, float $$2, float $$3) {
      List<ezr> $$4 = new ArrayList<>($$0.size());

      for (ezr $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public ezr a(buj $$0, int $$1, float $$2) {
      List<ezr> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public ezr b(buj $$0, int $$1, float $$2) {
      ezr $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public ezr c(buj $$0, int $$1, float $$2) {
      List<ezr> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         ezr $$4 = $$3.get(azn.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static ezr a(ezr $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<buj, List<ezr>> a = new EnumMap<>(buj.class);

      a() {
      }

      public buk.a a(buj $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new ezr((double)$$1, (double)$$2, (double)$$3));
      }

      public buk.a a(buj $$0, ezr $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public buk a(float $$0, float $$1) {
         Map<buj, List<ezr>> $$2 = new EnumMap<>(buj.class);

         for (buj $$3 : buj.values()) {
            List<ezr> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new buk($$2);
      }
   }
}
