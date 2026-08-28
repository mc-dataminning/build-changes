import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ewq {
   private static final String a = "command_storage_";
   private final Map<String, ewq.a> b = Maps.newHashMap();
   private final ewt c;

   public ewq(ewt $$0) {
      this.c = $$0;
   }

   private ewq.a a(String $$0) {
      ewq.a $$1 = new ewq.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private ewf.a<ewq.a> b(String $$0) {
      return new ewf.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bax.h);
   }

   public tw a(ald $$0) {
      String $$1 = $$0.b();
      ewq.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new tw();
   }

   public void a(ald $$0, tw $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<ald> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends ewf {
      private static final String a = "contents";
      private final Map<String, tw> b = Maps.newHashMap();

      ewq.a a(tw $$0) {
         tw $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public tw a(tw $$0, ju.a $$1) {
         tw $$2 = new tw();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public tw a(String $$0) {
         tw $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new tw();
      }

      public void a(String $$0, tw $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.g();
      }

      public Stream<ald> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> ald.a($$0, $$1));
      }
   }
}
