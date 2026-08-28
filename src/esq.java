import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class esq {
   private static final String a = "command_storage_";
   private final Map<String, esq.a> b = Maps.newHashMap();
   private final est c;

   public esq(est $$0) {
      this.c = $$0;
   }

   private esq.a a(String $$0) {
      esq.a $$1 = new esq.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private esf.a<esq.a> b(String $$0) {
      return new esf.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bao.h);
   }

   public ug a(ale $$0) {
      String $$1 = $$0.b();
      esq.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new ug();
   }

   public void a(ale $$0, ug $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<ale> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends esf {
      private static final String a = "contents";
      private final Map<String, ug> b = Maps.newHashMap();

      esq.a a(ug $$0) {
         ug $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public ug a(ug $$0, jq.a $$1) {
         ug $$2 = new ug();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public ug a(String $$0) {
         ug $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new ug();
      }

      public void a(String $$0, ug $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<ale> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> ale.a($$0, $$1));
      }
   }
}
