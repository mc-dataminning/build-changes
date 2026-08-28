import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class epl {
   private static final String a = "command_storage_";
   private final Map<String, epl.a> b = Maps.newHashMap();
   private final epo c;

   public epl(epo $$0) {
      this.c = $$0;
   }

   private epl.a a(String $$0) {
      epl.a $$1 = new epl.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private epa.a<epl.a> b(String $$0) {
      return new epa.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bae.h);
   }

   public ur a(ale $$0) {
      String $$1 = $$0.b();
      epl.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new ur();
   }

   public void a(ale $$0, ur $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<ale> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends epa {
      private static final String a = "contents";
      private final Map<String, ur> b = Maps.newHashMap();

      epl.a a(ur $$0) {
         ur $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public ur a(ur $$0, jk.a $$1) {
         ur $$2 = new ur();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.h()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public ur a(String $$0) {
         ur $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new ur();
      }

      public void a(String $$0, ur $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<ale> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new ale($$0, $$1));
      }
   }
}
