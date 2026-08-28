import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class evn {
   private static final String a = "command_storage_";
   private final Map<String, evn.a> b = Maps.newHashMap();
   private final evq c;

   public evn(evq $$0) {
      this.c = $$0;
   }

   private evn.a a(String $$0) {
      evn.a $$1 = new evn.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private evc.a<evn.a> b(String $$0) {
      return new evc.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bbi.h);
   }

   public um a(alp $$0) {
      String $$1 = $$0.b();
      evn.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new um();
   }

   public void a(alp $$0, um $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<alp> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends evc {
      private static final String a = "contents";
      private final Map<String, um> b = Maps.newHashMap();

      evn.a a(um $$0) {
         um $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public um a(um $$0, js.a $$1) {
         um $$2 = new um();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public um a(String $$0) {
         um $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new um();
      }

      public void a(String $$0, um $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<alp> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> alp.a($$0, $$1));
      }
   }
}
