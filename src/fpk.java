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

public class fpk implements gbm {
   private final List<fpl> a;

   public fpk(List<fpl> $$0) {
      this.a = $$0;
   }

   public List<fpl> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fpk $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<aez> f() {
      return this.a().stream().map(fpl::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aez, gbm> $$0) {
      this.a().stream().map(fpl::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gbb a(gbf $$0, Function<gbe, fza> $$1, gbj $$2, aez $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gbn.a $$4 = new gbn.a();

         for (fpl $$5 : this.a()) {
            gbb $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fpk> {
      public fpk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fpl> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fpl)$$2.deserialize($$5, fpl.class));
            }
         } else {
            $$3.add((fpl)$$2.deserialize($$0, fpl.class));
         }

         return new fpk($$3);
      }
   }
}
