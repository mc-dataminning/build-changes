import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class egd {
   private static final String a = "command_storage_";
   private final Map<String, egd.a> b = Maps.newHashMap();
   private final egg c;

   public egd(egg $$0) {
      this.c = $$0;
   }

   private egd.a a(String $$0) {
      egd.a $$1 = new egd.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private efv.a<egd.a> b(String $$0) {
      return new efv.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), avv.h);
   }

   public sn a(ahg $$0) {
      String $$1 = $$0.b();
      egd.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new sn();
   }

   public void a(ahg $$0, sn $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<ahg> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends efv {
      private static final String a = "contents";
      private final Map<String, sn> b = Maps.newHashMap();

      egd.a b(sn $$0) {
         sn $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public sn a(sn $$0) {
         sn $$1 = new sn();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public sn a(String $$0) {
         sn $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new sn();
      }

      public void a(String $$0, sn $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<ahg> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new ahg($$0, $$1));
      }
   }
}
