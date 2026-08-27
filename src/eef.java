import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class eef {
   private static final String a = "command_storage_";
   private final Map<String, eef.a> b = Maps.newHashMap();
   private final eei c;

   public eef(eei $$0) {
      this.c = $$0;
   }

   private eef.a a(String $$0) {
      eef.a $$1 = new eef.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private edx.a<eef.a> b(String $$0) {
      return new edx.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), aus.h);
   }

   public rz a(agi $$0) {
      String $$1 = $$0.b();
      eef.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new rz();
   }

   public void a(agi $$0, rz $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<agi> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends edx {
      private static final String a = "contents";
      private final Map<String, rz> b = Maps.newHashMap();

      eef.a b(rz $$0) {
         rz $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public rz a(rz $$0) {
         rz $$1 = new rz();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public rz a(String $$0) {
         rz $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new rz();
      }

      public void a(String $$0, rz $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<agi> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new agi($$0, $$1));
      }
   }
}
