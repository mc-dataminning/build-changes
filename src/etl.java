import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class etl {
   private static final String a = "command_storage_";
   private final Map<String, etl.a> b = Maps.newHashMap();
   private final eto c;

   public etl(eto $$0) {
      this.c = $$0;
   }

   private etl.a a(String $$0) {
      etl.a $$1 = new etl.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private eta.a<etl.a> b(String $$0) {
      return new eta.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bax.h);
   }

   public un a(all $$0) {
      String $$1 = $$0.b();
      etl.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new un();
   }

   public void a(all $$0, un $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<all> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends eta {
      private static final String a = "contents";
      private final Map<String, un> b = Maps.newHashMap();

      etl.a a(un $$0) {
         un $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public un a(un $$0, js.a $$1) {
         un $$2 = new un();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public un a(String $$0) {
         un $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new un();
      }

      public void a(String $$0, un $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<all> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> all.a($$0, $$1));
      }
   }
}
