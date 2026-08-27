import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class efm {
   private static final String a = "command_storage_";
   private final Map<String, efm.a> b = Maps.newHashMap();
   private final efp c;

   public efm(efp $$0) {
      this.c = $$0;
   }

   private efm.a a(String $$0) {
      efm.a $$1 = new efm.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private efe.a<efm.a> b(String $$0) {
      return new efe.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), avg.h);
   }

   public sj a(agt $$0) {
      String $$1 = $$0.b();
      efm.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new sj();
   }

   public void a(agt $$0, sj $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<agt> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends efe {
      private static final String a = "contents";
      private final Map<String, sj> b = Maps.newHashMap();

      efm.a b(sj $$0) {
         sj $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public sj a(sj $$0) {
         sj $$1 = new sj();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public sj a(String $$0) {
         sj $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new sj();
      }

      public void a(String $$0, sj $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<agt> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new agt($$0, $$1));
      }
   }
}
