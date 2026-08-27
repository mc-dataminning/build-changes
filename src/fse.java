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

public class fse implements geg {
   private final List<fsf> a;

   public fse(List<fsf> $$0) {
      this.a = $$0;
   }

   public List<fsf> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fse $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<agi> f() {
      return this.a().stream().map(fsf::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<agi, geg> $$0) {
      this.a().stream().map(fsf::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gdv a(gdz $$0, Function<gdy, gbu> $$1, ged $$2, agi $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         geh.a $$4 = new geh.a();

         for (fsf $$5 : this.a()) {
            gdv $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fse> {
      public fse a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fsf> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fsf)$$2.deserialize($$5, fsf.class));
            }
         } else {
            $$3.add((fsf)$$2.deserialize($$0, fsf.class));
         }

         return new fse($$3);
      }
   }
}
