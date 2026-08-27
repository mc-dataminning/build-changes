import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class enh {
   private static final String a = "command_storage_";
   private final Map<String, enh.a> b = Maps.newHashMap();
   private final enk c;

   public enh(enk $$0) {
      this.c = $$0;
   }

   private enh.a a(String $$0) {
      enh.a $$1 = new enh.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private emy.a<enh.a> b(String $$0) {
      return new emy.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), azc.h);
   }

   public ty a(akf $$0) {
      String $$1 = $$0.b();
      enh.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new ty();
   }

   public void a(akf $$0, ty $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<akf> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends emy {
      private static final String a = "contents";
      private final Map<String, ty> b = Maps.newHashMap();

      enh.a a(ty $$0) {
         ty $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public ty a(ty $$0, ix.a $$1) {
         ty $$2 = new ty();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.h()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public ty a(String $$0) {
         ty $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new ty();
      }

      public void a(String $$0, ty $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<akf> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new akf($$0, $$1));
      }
   }
}
