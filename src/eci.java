import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class eci implements eck {
   final ch a;
   final gu b;

   eci(ch $$0, gu $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ecl b() {
      return ecm.n;
   }

   public boolean a(dzk $$0) {
      eei $$1 = $$0.c(ebw.f);
      return $$1 != null && this.a.a($$0.d(), $$1.a() + (double)this.b.u(), $$1.b() + (double)this.b.v(), $$1.c() + (double)this.b.w());
   }

   public static eck.a a(ch.a $$0) {
      return () -> new eci($$0.b(), gu.b);
   }

   public static eck.a a(ch.a $$0, gu $$1) {
      return () -> new eci($$0.b(), $$1);
   }

   public static class a implements dzt<eci> {
      public void a(JsonObject $$0, eci $$1, JsonSerializationContext $$2) {
         $$0.add("predicate", $$1.a.a());
         if ($$1.b.u() != 0) {
            $$0.addProperty("offsetX", $$1.b.u());
         }

         if ($$1.b.v() != 0) {
            $$0.addProperty("offsetY", $$1.b.v());
         }

         if ($$1.b.w() != 0) {
            $$0.addProperty("offsetZ", $$1.b.w());
         }
      }

      public eci b(JsonObject $$0, JsonDeserializationContext $$1) {
         ch $$2 = ch.a($$0.get("predicate"));
         int $$3 = aor.a($$0, "offsetX", 0);
         int $$4 = aor.a($$0, "offsetY", 0);
         int $$5 = aor.a($$0, "offsetZ", 0);
         return new eci($$2, new gu($$3, $$4, $$5));
      }
   }
}
