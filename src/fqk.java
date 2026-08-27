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

public class fqk implements gcm {
   private final List<fql> a;

   public fqk(List<fql> $$0) {
      this.a = $$0;
   }

   public List<fql> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fqk $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<afw> f() {
      return this.a().stream().map(fql::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<afw, gcm> $$0) {
      this.a().stream().map(fql::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gcb a(gcf $$0, Function<gce, gaa> $$1, gcj $$2, afw $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gcn.a $$4 = new gcn.a();

         for (fql $$5 : this.a()) {
            gcb $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fqk> {
      public fqk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fql> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fql)$$2.deserialize($$5, fql.class));
            }
         } else {
            $$3.add((fql)$$2.deserialize($$0, fql.class));
         }

         return new fqk($$3);
      }
   }
}
