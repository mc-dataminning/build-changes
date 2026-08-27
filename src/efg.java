import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Set;

public class efg implements efh {
   final csk a;
   final cz b;

   efg(csk $$0, cz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public efi b() {
      return efj.i;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.g);
   }

   public boolean a(ech $$0) {
      dey $$1 = $$0.c(eet.g);
      return $$1 != null && $$1.a(this.a) && this.b.a($$1);
   }

   public static efg.a a(csk $$0) {
      return new efg.a($$0);
   }

   public static class a implements efh.a {
      private final csk a;
      private cz b = cz.a;

      public a(csk $$0) {
         this.a = $$0;
      }

      public efg.a a(cz.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public efh build() {
         return new efg(this.a, this.b);
      }
   }

   public static class b implements ecq<efg> {
      public void a(JsonObject $$0, efg $$1, JsonSerializationContext $$2) {
         $$0.addProperty("block", jc.f.b($$1.a).toString());
         $$0.add("properties", $$1.b.a());
      }

      public efg b(JsonObject $$0, JsonDeserializationContext $$1) {
         aep $$2 = new aep(arf.i($$0, "block"));
         csk $$3 = jc.f.b($$2).orElseThrow(() -> new IllegalArgumentException("Can't find block " + $$2));
         cz $$4 = cz.a($$0.get("properties"));
         $$4.a($$3.l(), $$1x -> {
            throw new JsonSyntaxException("Block " + $$3 + " has no property " + $$1x);
         });
         return new efg($$3, $$4);
      }
   }
}
