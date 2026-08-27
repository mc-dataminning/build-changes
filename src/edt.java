import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class edt {
   private static final String a = "command_storage_";
   private final Map<String, edt.a> b = Maps.newHashMap();
   private final edw c;

   public edt(edw $$0) {
      this.c = $$0;
   }

   private edt.a a(String $$0) {
      edt.a $$1 = new edt.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private edl.a<edt.a> b(String $$0) {
      return new edl.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), aun.h);
   }

   public rz a(agg $$0) {
      String $$1 = $$0.b();
      edt.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new rz();
   }

   public void a(agg $$0, rz $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<agg> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends edl {
      private static final String a = "contents";
      private final Map<String, rz> b = Maps.newHashMap();

      edt.a b(rz $$0) {
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

      public Stream<agg> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new agg($$0, $$1));
      }
   }
}
