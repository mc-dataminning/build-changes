import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bug {
   private final Map<buf, List<ezn>> a;

   bug(Map<buf, List<ezn>> $$0) {
      this.a = $$0;
   }

   public static bug a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bug.a a() {
      return new bug.a();
   }

   public bug a(float $$0, float $$1, float $$2) {
      Map<buf, List<ezn>> $$3 = new EnumMap<>(buf.class);

      for (Entry<buf, List<ezn>> $$4 : this.a.entrySet()) {
         $$3.put($$4.getKey(), a($$4.getValue(), $$0, $$1, $$2));
      }

      return new bug($$3);
   }

   private static List<ezn> a(List<ezn> $$0, float $$1, float $$2, float $$3) {
      List<ezn> $$4 = new ArrayList<>($$0.size());

      for (ezn $$5 : $$0) {
         $$4.add($$5.d((double)$$1, (double)$$2, (double)$$3));
      }

      return $$4;
   }

   @Nullable
   public ezn a(buf $$0, int $$1, float $$2) {
      List<ezn> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public ezn b(buf $$0, int $$1, float $$2) {
      ezn $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public ezn c(buf $$0, int $$1, float $$2) {
      List<ezn> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         ezn $$4 = $$3.get(azk.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static ezn a(ezn $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<buf, List<ezn>> a = new EnumMap<>(buf.class);

      a() {
      }

      public bug.a a(buf $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new ezn((double)$$1, (double)$$2, (double)$$3));
      }

      public bug.a a(buf $$0, ezn $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bug a(float $$0, float $$1) {
         Map<buf, List<ezn>> $$2 = new EnumMap<>(buf.class);

         for (buf $$3 : buf.values()) {
            List<ezn> $$4 = this.a.get($$3);
            $$2.put($$3, $$4 != null ? List.copyOf($$4) : $$3.a($$0, $$1));
         }

         return new bug($$2);
      }
   }
}
