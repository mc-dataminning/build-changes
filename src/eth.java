import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class eth {
   private static final String a = "command_storage_";
   private final Map<String, eth.a> b = Maps.newHashMap();
   private final etk c;

   public eth(etk $$0) {
      this.c = $$0;
   }

   private eth.a a(String $$0) {
      eth.a $$1 = new eth.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private esw.a<eth.a> b(String $$0) {
      return new esw.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bat.h);
   }

   public uk a(ali $$0) {
      String $$1 = $$0.b();
      eth.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new uk();
   }

   public void a(ali $$0, uk $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<ali> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends esw {
      private static final String a = "contents";
      private final Map<String, uk> b = Maps.newHashMap();

      eth.a a(uk $$0) {
         uk $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public uk a(uk $$0, js.a $$1) {
         uk $$2 = new uk();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public uk a(String $$0) {
         uk $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new uk();
      }

      public void a(String $$0, uk $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<ali> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> ali.a($$0, $$1));
      }
   }
}
