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

public class fpe implements gbg {
   private final List<fpf> a;

   public fpe(List<fpf> $$0) {
      this.a = $$0;
   }

   public List<fpf> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fpe $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<aer> f() {
      return this.a().stream().map(fpf::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aer, gbg> $$0) {
      this.a().stream().map(fpf::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gav a(gaz $$0, Function<gay, fyu> $$1, gbd $$2, aer $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gbh.a $$4 = new gbh.a();

         for (fpf $$5 : this.a()) {
            gav $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fpe> {
      public fpe a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fpf> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fpf)$$2.deserialize($$5, fpf.class));
            }
         } else {
            $$3.add((fpf)$$2.deserialize($$0, fpf.class));
         }

         return new fpe($$3);
      }
   }
}
