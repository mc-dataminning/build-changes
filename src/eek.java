import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class eek {
   private static final String a = "command_storage_";
   private final Map<String, eek.a> b = Maps.newHashMap();
   private final een c;

   public eek(een $$0) {
      this.c = $$0;
   }

   private eek.a a(String $$0) {
      eek.a $$1 = new eek.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private eec.a<eek.a> b(String $$0) {
      return new eec.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), auw.h);
   }

   public sd a(agm $$0) {
      String $$1 = $$0.b();
      eek.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new sd();
   }

   public void a(agm $$0, sd $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<agm> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends eec {
      private static final String a = "contents";
      private final Map<String, sd> b = Maps.newHashMap();

      eek.a b(sd $$0) {
         sd $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public sd a(sd $$0) {
         sd $$1 = new sd();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public sd a(String $$0) {
         sd $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new sd();
      }

      public void a(String $$0, sd $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<agm> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new agm($$0, $$1));
      }
   }
}
