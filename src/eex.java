import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class eex implements efh {
   final cnd a;
   final float[] b;

   eex(cnd $$0, float[] $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public efi b() {
      return efj.k;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.i);
   }

   public boolean a(ech $$0) {
      ciw $$1 = $$0.c(eet.i);
      int $$2 = $$1 != null ? cnf.a(this.a, $$1) : 0;
      float $$3 = this.b[Math.min($$2, this.b.length - 1)];
      return $$0.b().i() < $$3;
   }

   public static efh.a a(cnd $$0, float... $$1) {
      return () -> new eex($$0, $$1);
   }

   public static class a implements ecq<eex> {
      public void a(JsonObject $$0, eex $$1, JsonSerializationContext $$2) {
         $$0.addProperty("enchantment", jc.g.b($$1.a).toString());
         $$0.add("chances", $$2.serialize($$1.b));
      }

      public eex b(JsonObject $$0, JsonDeserializationContext $$1) {
         aep $$2 = new aep(arf.i($$0, "enchantment"));
         cnd $$3 = jc.g.b($$2).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + $$2));
         float[] $$4 = arf.a($$0, "chances", $$1, float[].class);
         return new eex($$3, $$4);
      }
   }
}
