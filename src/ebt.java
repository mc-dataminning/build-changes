import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ebt {
   private static final String a = "command_storage_";
   private final Map<String, ebt.a> b = Maps.newHashMap();
   private final ebw c;

   public ebt(ebw $$0) {
      this.c = $$0;
   }

   private ebt.a a(String $$0) {
      ebt.a $$1 = new ebt.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private ebl.a<ebt.a> b(String $$0) {
      return new ebl.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), atg.h);
   }

   public qw a(aez $$0) {
      String $$1 = $$0.b();
      ebt.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new qw();
   }

   public void a(aez $$0, qw $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<aez> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends ebl {
      private static final String a = "contents";
      private final Map<String, qw> b = Maps.newHashMap();

      ebt.a b(qw $$0) {
         qw $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public qw a(qw $$0) {
         qw $$1 = new qw();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public qw a(String $$0) {
         qw $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new qw();
      }

      public void a(String $$0, qw $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<aez> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new aez($$0, $$1));
      }
   }
}
