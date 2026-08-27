import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ekd {
   private static final String a = "command_storage_";
   private final Map<String, ekd.a> b = Maps.newHashMap();
   private final ekg c;

   public ekd(ekg $$0) {
      this.c = $$0;
   }

   private ekd.a a(String $$0) {
      ekd.a $$1 = new ekd.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private eju.a<ekd.a> b(String $$0) {
      return new eju.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), ayc.h);
   }

   public ta a(ajh $$0) {
      String $$1 = $$0.b();
      ekd.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new ta();
   }

   public void a(ajh $$0, ta $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<ajh> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends eju {
      private static final String a = "contents";
      private final Map<String, ta> b = Maps.newHashMap();

      ekd.a a(ta $$0) {
         ta $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public ta a(ta $$0, in.a $$1) {
         ta $$2 = new ta();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.h()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public ta a(String $$0) {
         ta $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new ta();
      }

      public void a(String $$0, ta $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<ajh> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new ajh($$0, $$1));
      }
   }
}
