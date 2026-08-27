import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ecr {
   private static final String a = "command_storage_";
   private final Map<String, ecr.a> b = Maps.newHashMap();
   private final ecu c;

   public ecr(ecu $$0) {
      this.c = $$0;
   }

   private ecr.a a(String $$0) {
      ecr.a $$1 = new ecr.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private ecj.a<ecr.a> b(String $$0) {
      return new ecj.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), aud.h);
   }

   public rt a(afw $$0) {
      String $$1 = $$0.b();
      ecr.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new rt();
   }

   public void a(afw $$0, rt $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<afw> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends ecj {
      private static final String a = "contents";
      private final Map<String, rt> b = Maps.newHashMap();

      ecr.a b(rt $$0) {
         rt $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public rt a(rt $$0) {
         rt $$1 = new rt();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public rt a(String $$0) {
         rt $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new rt();
      }

      public void a(String $$0, rt $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<afw> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new afw($$0, $$1));
      }
   }
}
