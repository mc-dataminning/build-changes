import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class egm {
   private static final String a = "command_storage_";
   private final Map<String, egm.a> b = Maps.newHashMap();
   private final egp c;

   public egm(egp $$0) {
      this.c = $$0;
   }

   private egm.a a(String $$0) {
      egm.a $$1 = new egm.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private ege.a<egm.a> b(String $$0) {
      return new ege.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), avx.h);
   }

   public so a(ahh $$0) {
      String $$1 = $$0.b();
      egm.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new so();
   }

   public void a(ahh $$0, so $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<ahh> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends ege {
      private static final String a = "contents";
      private final Map<String, so> b = Maps.newHashMap();

      egm.a b(so $$0) {
         so $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public so a(so $$0) {
         so $$1 = new so();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public so a(String $$0) {
         so $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new so();
      }

      public void a(String $$0, so $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<ahh> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new ahh($$0, $$1));
      }
   }
}
