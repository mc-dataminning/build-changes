import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class eff implements efh {
   final ch a;
   final gv b;

   eff(ch $$0, gv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public efi b() {
      return efj.n;
   }

   public boolean a(ech $$0) {
      ehf $$1 = $$0.c(eet.f);
      return $$1 != null && this.a.a($$0.d(), $$1.a() + (double)this.b.u(), $$1.b() + (double)this.b.v(), $$1.c() + (double)this.b.w());
   }

   public static efh.a a(ch.a $$0) {
      return () -> new eff($$0.b(), gv.b);
   }

   public static efh.a a(ch.a $$0, gv $$1) {
      return () -> new eff($$0.b(), $$1);
   }

   public static class a implements ecq<eff> {
      public void a(JsonObject $$0, eff $$1, JsonSerializationContext $$2) {
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

      public eff b(JsonObject $$0, JsonDeserializationContext $$1) {
         ch $$2 = ch.a($$0.get("predicate"));
         int $$3 = arf.a($$0, "offsetX", 0);
         int $$4 = arf.a($$0, "offsetY", 0);
         int $$5 = arf.a($$0, "offsetZ", 0);
         return new eff($$2, new gv($$3, $$4, $$5));
      }
   }
}
