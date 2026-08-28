import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ery {
   private static final String a = "command_storage_";
   private final Map<String, ery.a> b = Maps.newHashMap();
   private final esb c;

   public ery(esb $$0) {
      this.c = $$0;
   }

   private ery.a a(String $$0) {
      ery.a $$1 = new ery.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private ern.a<ery.a> b(String $$0) {
      return new ern.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bal.h);
   }

   public uf a(alb $$0) {
      String $$1 = $$0.b();
      ery.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new uf();
   }

   public void a(alb $$0, uf $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<alb> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends ern {
      private static final String a = "contents";
      private final Map<String, uf> b = Maps.newHashMap();

      ery.a a(uf $$0) {
         uf $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public uf a(uf $$0, jp.a $$1) {
         uf $$2 = new uf();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public uf a(String $$0) {
         uf $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new uf();
      }

      public void a(String $$0, uf $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<alb> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> alb.a($$0, $$1));
      }
   }
}
