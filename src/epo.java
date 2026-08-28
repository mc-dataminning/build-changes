import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class epo {
   private static final String a = "command_storage_";
   private final Map<String, epo.a> b = Maps.newHashMap();
   private final epr c;

   public epo(epr $$0) {
      this.c = $$0;
   }

   private epo.a a(String $$0) {
      epo.a $$1 = new epo.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private epd.a<epo.a> b(String $$0) {
      return new epd.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bag.h);
   }

   public us a(alf $$0) {
      String $$1 = $$0.b();
      epo.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new us();
   }

   public void a(alf $$0, us $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<alf> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends epd {
      private static final String a = "contents";
      private final Map<String, us> b = Maps.newHashMap();

      epo.a a(us $$0) {
         us $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public us a(us $$0, jk.a $$1) {
         us $$2 = new us();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public us a(String $$0) {
         us $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new us();
      }

      public void a(String $$0, us $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<alf> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new alf($$0, $$1));
      }
   }
}
