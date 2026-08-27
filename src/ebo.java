import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ebo {
   private static final String a = "command_storage_";
   private final Map<String, ebo.a> b = Maps.newHashMap();
   private final ebr c;

   public ebo(ebr $$0) {
      this.c = $$0;
   }

   private ebo.a a(String $$0) {
      ebo.a $$1 = new ebo.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private ebg.a<ebo.a> b(String $$0) {
      return new ebg.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), asq.h);
   }

   public qs a(aep $$0) {
      String $$1 = $$0.b();
      ebo.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new qs();
   }

   public void a(aep $$0, qs $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<aep> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends ebg {
      private static final String a = "contents";
      private final Map<String, qs> b = Maps.newHashMap();

      ebo.a b(qs $$0) {
         qs $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public qs a(qs $$0) {
         qs $$1 = new qs();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public qs a(String $$0) {
         qs $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new qs();
      }

      public void a(String $$0, qs $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<aep> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new aep($$0, $$1));
      }
   }
}
