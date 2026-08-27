import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class eij {
   private static final String a = "command_storage_";
   private final Map<String, eij.a> b = Maps.newHashMap();
   private final eim c;

   public eij(eim $$0) {
      this.c = $$0;
   }

   private eij.a a(String $$0) {
      eij.a $$1 = new eij.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private eib.a<eij.a> b(String $$0) {
      return new eib.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), axo.h);
   }

   public sw a(aiy $$0) {
      String $$1 = $$0.b();
      eij.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new sw();
   }

   public void a(aiy $$0, sw $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<aiy> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends eib {
      private static final String a = "contents";
      private final Map<String, sw> b = Maps.newHashMap();

      eij.a b(sw $$0) {
         sw $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public sw a(sw $$0) {
         sw $$1 = new sw();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public sw a(String $$0) {
         sw $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new sw();
      }

      public void a(String $$0, sw $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<aiy> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new aiy($$0, $$1));
      }
   }
}
