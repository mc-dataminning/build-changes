import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class ege implements egc {
   final egk a;
   final String b;
   final float c;

   ege(egk $$0, String $$1, float $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public egb b() {
      return egd.d;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.a.b();
   }

   public static ege a(ech.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ege a(ech.b $$0, String $$1, float $$2) {
      return new ege(egh.a($$0), $$1, $$2);
   }

   @Override
   public float b(ech $$0) {
      String $$1 = this.a.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eie $$2 = $$0.d().f();
         eib $$3 = $$2.b(this.b);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.c;
         }
      }
   }

   public static class a implements ecq<ege> {
      public ege b(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = arf.i($$0, "score");
         float $$3 = arf.a($$0, "scale", 1.0F);
         egk $$4 = arf.a($$0, "target", $$1, egk.class);
         return new ege($$4, $$2, $$3);
      }

      public void a(JsonObject $$0, ege $$1, JsonSerializationContext $$2) {
         $$0.addProperty("score", $$1.b);
         $$0.add("target", $$2.serialize($$1.a));
         $$0.addProperty("scale", $$1.c);
      }
   }
}
