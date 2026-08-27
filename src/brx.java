import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class brx {
   private final Map<brw, List<ewu>> a;

   brx(Map<brw, List<ewu>> $$0) {
      this.a = $$0;
   }

   public static brx a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static brx.a a() {
      return new brx.a();
   }

   public brx a(float $$0, float $$1, float $$2) {
      Map<brw, List<ewu>> $$3 = new EnumMap<>(brw.class);

      for (Entry<brw, List<ewu>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new brx($$3);
   }

   private static List<ewu> a(List<ewu> $$0, float $$1, float $$2, float $$3) {
      List<ewu> $$4 = new ArrayList<>($$0.size());

      for (ewu $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public ewu a(brw $$0, int $$1, float $$2) {
      List<ewu> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public ewu b(brw $$0, int $$1, float $$2) {
      ewu $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public ewu c(brw $$0, int $$1, float $$2) {
      List<ewu> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         ewu $$4 = $$3.get(aym.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static ewu a(ewu $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<brw, List<ewu>> a = new EnumMap<>(brw.class);

      a() {
      }

      public brx.a a(brw $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new ewu((double)$$1, (double)$$2, (double)$$3));
      }

      public brx.a a(brw $$0, ewu $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public brx a(float $$0, float $$1) {
         Map<brw, List<ewu>> $$2 = new EnumMap<>(brw.class);

         for (brw $$3 : brw.values()) {
            List<ewu> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new brx($$2);
      }
   }
}
