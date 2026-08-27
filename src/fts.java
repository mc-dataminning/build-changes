import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fts implements gga {
   private final List<ftt> a;

   public fts(List<ftt> $$0) {
      this.a = $$0;
   }

   public List<ftt> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fts $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<agt> f() {
      return this.a().stream().map(ftt::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<agt, gga> $$0) {
      this.a().stream().map(ftt::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gfp a(gft $$0, Function<gfs, gdo> $$1, gfx $$2, agt $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         ggb.a $$4 = new ggb.a();

         for (ftt $$5 : this.a()) {
            gfp $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fts> {
      public fts a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<ftt> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((ftt)$$2.deserialize($$5, ftt.class));
            }
         } else {
            $$3.add((ftt)$$2.deserialize($$0, ftt.class));
         }

         return new fts($$3);
      }
   }
}
