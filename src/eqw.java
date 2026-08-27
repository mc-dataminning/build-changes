import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class eqw {
   private static final String a = "command_storage_";
   private final Map<String, eqw.a> b = Maps.newHashMap();
   private final eqz c;

   public eqw(eqz $$0) {
      this.c = $$0;
   }

   private eqw.a a(String $$0) {
      eqw.a $$1 = new eqw.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private eql.a<eqw.a> b(String $$0) {
      return new eql.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), azs.h);
   }

   public uk a(akt $$0) {
      String $$1 = $$0.b();
      eqw.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new uk();
   }

   public void a(akt $$0, uk $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<akt> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends eql {
      private static final String a = "contents";
      private final Map<String, uk> b = Maps.newHashMap();

      eqw.a a(uk $$0) {
         uk $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public uk a(uk $$0, jc.a $$1) {
         uk $$2 = new uk();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.h()));
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

      public Stream<akt> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new akt($$0, $$1));
      }
   }
}
