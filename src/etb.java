import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class etb {
   private static final String a = "command_storage_";
   private final Map<String, etb.a> b = Maps.newHashMap();
   private final ete c;

   public etb(ete $$0) {
      this.c = $$0;
   }

   private etb.a a(String $$0) {
      etb.a $$1 = new etb.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private esq.a<etb.a> b(String $$0) {
      return new esq.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bas.h);
   }

   public uj a(alh $$0) {
      String $$1 = $$0.b();
      etb.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new uj();
   }

   public void a(alh $$0, uj $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<alh> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends esq {
      private static final String a = "contents";
      private final Map<String, uj> b = Maps.newHashMap();

      etb.a a(uj $$0) {
         uj $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public uj a(uj $$0, jr.a $$1) {
         uj $$2 = new uj();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public uj a(String $$0) {
         uj $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new uj();
      }

      public void a(String $$0, uj $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<alh> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> alh.a($$0, $$1));
      }
   }
}
