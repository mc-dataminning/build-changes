import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class evu {
   private static final String a = "command_storage_";
   private final Map<String, evu.a> b = Maps.newHashMap();
   private final evx c;

   public evu(evx $$0) {
      this.c = $$0;
   }

   private evu.a a(String $$0) {
      evu.a $$1 = new evu.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private evj.a<evu.a> b(String $$0) {
      return new evj.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), bbs.h);
   }

   public ux a(alz $$0) {
      String $$1 = $$0.b();
      evu.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new ux();
   }

   public void a(alz $$0, ux $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<alz> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends evj {
      private static final String a = "contents";
      private final Map<String, ux> b = Maps.newHashMap();

      evu.a a(ux $$0) {
         ux $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public ux a(ux $$0, js.a $$1) {
         ux $$2 = new ux();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public ux a(String $$0) {
         ux $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new ux();
      }

      public void a(String $$0, ux $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<alz> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> alz.a($$0, $$1));
      }
   }
}
