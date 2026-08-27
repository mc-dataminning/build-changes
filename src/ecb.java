import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ecb {
   private static final String a = "command_storage_";
   private final Map<String, ecb.a> b = Maps.newHashMap();
   private final ece c;

   public ecb(ece $$0) {
      this.c = $$0;
   }

   private ecb.a a(String $$0) {
      ecb.a $$1 = new ecb.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private ebt.a<ecb.a> b(String $$0) {
      return new ebt.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), atc.h);
   }

   public qy a(aey $$0) {
      String $$1 = $$0.b();
      ecb.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new qy();
   }

   public void a(aey $$0, qy $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<aey> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends ebt {
      private static final String a = "contents";
      private final Map<String, qy> b = Maps.newHashMap();

      ecb.a b(qy $$0) {
         qy $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public qy a(qy $$0) {
         qy $$1 = new qy();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public qy a(String $$0) {
         qy $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new qy();
      }

      public void a(String $$0, qy $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<aey> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new aey($$0, $$1));
      }
   }
}
