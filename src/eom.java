import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class eom {
   private static final String a = "command_storage_";
   private final Map<String, eom.a> b = Maps.newHashMap();
   private final eop c;

   public eom(eop $$0) {
      this.c = $$0;
   }

   private eom.a a(String $$0) {
      eom.a $$1 = new eom.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private eob.a<eom.a> b(String $$0) {
      return new eob.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), azj.h);
   }

   public ud a(akm $$0) {
      String $$1 = $$0.b();
      eom.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new ud();
   }

   public void a(akm $$0, ud $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<akm> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends eob {
      private static final String a = "contents";
      private final Map<String, ud> b = Maps.newHashMap();

      eom.a a(ud $$0) {
         ud $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public ud a(ud $$0, iz.a $$1) {
         ud $$2 = new ud();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.h()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public ud a(String $$0) {
         ud $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new ud();
      }

      public void a(String $$0, ud $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<akm> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new akm($$0, $$1));
      }
   }
}
