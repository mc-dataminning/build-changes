import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class equ {
   private static final String a = "command_storage_";
   private final Map<String, equ.a> b = Maps.newHashMap();
   private final eqx c;

   public equ(eqx $$0) {
      this.c = $$0;
   }

   private equ.a a(String $$0) {
      equ.a $$1 = new equ.a();
      this.b.put($$0, $$1);
      return $$1;
   }

   private eqj.a<equ.a> b(String $$0) {
      return new eqj.a<>(() -> this.a($$0), ($$1, $$2) -> this.a($$0).a($$1), azw.h);
   }

   public ub a(akr $$0) {
      String $$1 = $$0.b();
      equ.a $$2 = this.c.b(this.b($$1), c($$1));
      return $$2 != null ? $$2.a($$0.a()) : new ub();
   }

   public void a(akr $$0, ub $$1) {
      String $$2 = $$0.b();
      this.c.a(this.b($$2), c($$2)).a($$0.a(), $$1);
   }

   public Stream<akr> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().b($$0.getKey()));
   }

   private static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends eqj {
      private static final String a = "contents";
      private final Map<String, ub> b = Maps.newHashMap();

      equ.a a(ub $$0) {
         ub $$1 = $$0.p("contents");

         for (String $$2 : $$1.e()) {
            this.b.put($$2, $$1.p($$2));
         }

         return this;
      }

      @Override
      public ub a(ub $$0, jo.a $$1) {
         ub $$2 = new ub();
         this.b.forEach(($$1x, $$2x) -> $$2.a($$1x, $$2x.i()));
         $$0.a("contents", $$2);
         return $$0;
      }

      public ub a(String $$0) {
         ub $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new ub();
      }

      public void a(String $$0, ub $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.c();
      }

      public Stream<akr> b(String $$0) {
         return this.b.keySet().stream().map($$1 -> akr.a($$0, $$1));
      }
   }
}
