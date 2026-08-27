import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class emr {
   private static final String a = "command_storage_";
   private final Map<String, emr.a> b = Maps.newHashMap();
   private final emu c;

   public emr(emu $$0) {
      this.c = $$0;
   }

   private emr.a a(String $$0) {
      emr.a $$1 = new emr.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private emi.a<emr.a> b(String $$0) {
      return new emi.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), ays.h);
   }

   public to a(ajv $$0) {
      String $$1 = $$0.b();
      emr.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new to();
   }

   public void a(ajv $$0, to $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<ajv> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends emi {
      private static final String a = "contents";
      private final Map<String, to> b = Maps.newHashMap();

      emr.a a(to $$0) {
         to $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public to a(to $$0, ip.a $$1) {
         to $$2 = new to();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.h()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public to a(String $$0) {
         to $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new to();
      }

      public void a(String $$0, to $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<ajv> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new ajv($$0, $$1));
      }
   }
}
