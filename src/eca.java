import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class eca implements eck {
   final ckg a;
   final float[] b;

   eca(ckg $$0, float[] $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ecl b() {
      return ecm.k;
   }

   @Override
   public Set<ebt<?>> a() {
      return ImmutableSet.of(ebw.i);
   }

   public boolean a(dzk $$0) {
      cfz $$1 = $$0.c(ebw.i);
      int $$2 = $$1 != null ? cki.a(this.a, $$1) : 0;
      float $$3 = this.b[Math.min($$2, this.b.length - 1)];
      return $$0.b().i() < $$3;
   }

   public static eck.a a(ckg $$0, float... $$1) {
      return () -> new eca($$0, $$1);
   }

   public static class a implements dzt<eca> {
      public void a(JsonObject $$0, eca $$1, JsonSerializationContext $$2) {
         $$0.addProperty("enchantment", jb.g.b($$1.a).toString());
         $$0.add("chances", $$2.serialize($$1.b));
      }

      public eca b(JsonObject $$0, JsonDeserializationContext $$1) {
         acq $$2 = new acq(aor.i($$0, "enchantment"));
         ckg $$3 = jb.g.b($$2).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + $$2));
         float[] $$4 = aor.a($$0, "chances", $$1, float[].class);
         return new eca($$3, $$4);
      }
   }
}
