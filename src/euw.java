import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class euw {
   private static final String a = "command_storage_";
   private final Map<String, euw.a> b = Maps.newHashMap();
   private final euz c;

   public euw(euz $$0) {
      this.c = $$0;
   }

   private euw.a a(String $$0) {
      euw.a $$1 = new euw.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private eul.a<euw.a> b(String $$0) {
      return new eul.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), ban.h);
   }

   public tq a(aku $$0) {
      String $$1 = $$0.b();
      euw.a $$2 = this.c.b(this.b($$1), c($$1));
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

   static class a extends eul {
      private static final String a = "contents";
      private final Map<String, tq> b = Maps.newHashMap();

      euw.a a(tq $$0) {
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
