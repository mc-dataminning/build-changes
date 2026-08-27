import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class efx {
   private static final String a = "command_storage_";
   private final Map<String, efx.a> b = Maps.newHashMap();
   private final ega c;

   public efx(ega $$0) {
      this.c = $$0;
   }

   private efx.a a(String $$0) {
      efx.a $$1 = new efx.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private efp.a<efx.a> b(String $$0) {
      return new efp.a<>(() -> this.a($$0), $$1 -> this.a($$0).b($$1), avq.h);
   }

   public sl a(ahd $$0) {
      String $$1 = $$0.b();
      efx.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new sl();
   }

   public void a(ahd $$0, sl $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<ahd> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends efp {
      private static final String a = "contents";
      private final Map<String, sl> b = Maps.newHashMap();

      efx.a b(sl $$0) {
         sl $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public sl a(sl $$0) {
         sl $$1 = new sl();
         this.b.forEach(($$1x, $$2) -> $$1.a($$1x, $$2.h()));
         $$0.a("contents", $$1);
         return $$0;
      }

      public sl a(String $$0) {
         sl $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new sl();
      }

      public void a(String $$0, sl $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<ahd> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new ahd($$0, $$1));
      }
   }
}
