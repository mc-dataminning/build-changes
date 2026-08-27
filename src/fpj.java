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

public class fpj implements gbl {
   private final List<fpk> a;

   public fpj(List<fpk> $$0) {
      this.a = $$0;
   }

   public List<fpk> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fpj $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<aeu> f() {
      return this.a().stream().map(fpk::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aeu, gbl> $$0) {
      this.a().stream().map(fpk::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gba a(gbe $$0, Function<gbd, fyz> $$1, gbi $$2, aeu $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gbm.a $$4 = new gbm.a();

         for (fpk $$5 : this.a()) {
            gba $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fpj> {
      public fpj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fpk> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fpk)$$2.deserialize($$5, fpk.class));
            }
         } else {
            $$3.add((fpk)$$2.deserialize($$0, fpk.class));
         }

         return new fpj($$3);
      }
   }
}
