import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ejf {
   private static final String a = "command_storage_";
   private final Map<String, ejf.a> b = Maps.newHashMap();
   private final eji c;

   public ejf(eji $$0) {
      this.c = $$0;
   }

   private ejf.a a(String $$0) {
      ejf.a $$1 = new ejf.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private eiw.a<ejf.a> b(String $$0) {
      return new eiw.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), axs.h);
   }

   public sy a(ajc $$0) {
      String $$1 = $$0.b();
      ejf.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new sy();
   }

   public void a(ajc $$0, sy $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<ajc> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends eiw {
      private static final String a = "contents";
      private final Map<String, sy> b = Maps.newHashMap();

      ejf.a a(sy $$0) {
         sy $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public sy a(sy $$0, in.a $$1) {
         sy $$2 = new sy();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.h()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public sy a(String $$0) {
         sy $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new sy();
      }

      public void a(String $$0, sy $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<ajc> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new ajc($$0, $$1));
      }
   }
}
