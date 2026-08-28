import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class euu {
   private static final String a = "command_storage_";
   private final Map<String, euu.a> b = Maps.newHashMap();
   private final eux c;

   public euu(eux $$0) {
      this.c = $$0;
   }

   private euu.a a(String $$0) {
      euu.a $$1 = new euu.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private euj.a<euu.a> b(String $$0) {
      return new euj.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bam.h);
   }

   public tq a(aku $$0) {
      String $$1 = $$0.b();
      euu.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new tq();
   }

   public void a(aku $$0, tq $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<aku> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends euj {
      private static final String a = "contents";
      private final Map<String, tq> b = Maps.newHashMap();

      euu.a a(tq $$0) {
         tq $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public tq a(tq $$0, jt.a $$1) {
         tq $$2 = new tq();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public tq a(String $$0) {
         tq $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new tq();
      }

      public void a(String $$0, tq $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<aku> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> aku.a($$0, $$1));
      }
   }
}
