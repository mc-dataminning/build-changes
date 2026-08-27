import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ebq {
   private static final String a = "command_storage_";
   private final Map<String, ebq.a> b = Maps.newHashMap();
   private final ebt c;

   public ebq(ebt $$0) {
      this.c = $$0;
   }

   private ebq.a a(String $$0) {
      ebq.a $$1 = new ebq.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private ebi.a<ebq.a> b(String $$0) {
      return new ebi.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), ass.h);
   }

   public qr a(aer $$0) {
      String $$1 = $$0.b();
      ebq.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new qr();
   }

   public void a(aer $$0, qr $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<aer> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends ebi {
      private static final String a = "contents";
      private final Map<String, qr> b = Maps.newHashMap();

      ebq.a b(qr $$0) {
         qr $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public qr a(qr $$0) {
         qr $$1 = new qr();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public qr a(String $$0) {
         qr $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new qr();
      }

      public void a(String $$0, qr $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<aer> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new aer($$0, $$1));
      }
   }
}
