import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class eqb {
   private static final String a = "command_storage_";
   private final Map<String, eqb.a> b = Maps.newHashMap();
   private final eqe c;

   public eqb(eqe $$0) {
      this.c = $$0;
   }

   private eqb.a a(String $$0) {
      eqb.a $$1 = new eqb.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private epq.a<eqb.a> b(String $$0) {
      return new epq.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), azo.h);
   }

   public tx a(akk $$0) {
      String $$1 = $$0.b();
      eqb.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new tx();
   }

   public void a(akk $$0, tx $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<akk> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends epq {
      private static final String a = "contents";
      private final Map<String, tx> b = Maps.newHashMap();

      eqb.a a(tx $$0) {
         tx $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public tx a(tx $$0, jl.a $$1) {
         tx $$2 = new tx();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public tx a(String $$0) {
         tx $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new tx();
      }

      public void a(String $$0, tx $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<akk> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new akk($$0, $$1));
      }
   }
}
