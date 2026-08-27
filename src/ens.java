import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class ens {
   private static final String a = "command_storage_";
   private final Map<String, ens.a> b = Maps.newHashMap();
   private final env c;

   public ens(env $$0) {
      this.c = $$0;
   }

   private ens.a a(String $$0) {
      ens.a $$1 = new ens.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private enh.a<ens.a> b(String $$0) {
      return new enh.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), azf.h);
   }

   public ua a(akh $$0) {
      String $$1 = $$0.b();
      ens.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new ua();
   }

   public void a(akh $$0, ua $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<akh> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends enh {
      private static final String a = "contents";
      private final Map<String, ua> b = Maps.newHashMap();

      ens.a a(ua $$0) {
         ua $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public ua a(ua $$0, iy.a $$1) {
         ua $$2 = new ua();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.h()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public ua a(String $$0) {
         ua $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new ua();
      }

      public void a(String $$0, ua $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<akh> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> new akh($$0, $$1));
      }
   }
}
