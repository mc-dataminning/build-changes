import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class esm {
   private static final String a = "command_storage_";
   private final Map<String, esm.a> b = Maps.newHashMap();
   private final esp c;

   public esm(esp $$0) {
      this.c = $$0;
   }

   private esm.a a(String $$0) {
      esm.a $$1 = new esm.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private esb.a<esm.a> b(String $$0) {
      return new esb.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bam.h);
   }

   public uf a(alc $$0) {
      String $$1 = $$0.b();
      esm.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new uf();
   }

   public void a(alc $$0, uf $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<alc> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends esb {
      private static final String a = "contents";
      private final Map<String, uf> b = Maps.newHashMap();

      esm.a a(uf $$0) {
         uf $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public uf a(uf $$0, jp.a $$1) {
         uf $$2 = new uf();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public uf a(String $$0) {
         uf $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new uf();
      }

      public void a(String $$0, uf $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<alc> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> alc.a($$0, $$1));
      }
   }
}
