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

public class fov implements gax {
   private final List<fow> a;

   public fov(List<fow> $$0) {
      this.a = $$0;
   }

   public List<fow> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fov $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<aer> f() {
      return this.a().stream().map(fow::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aer, gax> $$0) {
      this.a().stream().map(fow::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gam a(gaq $$0, Function<gap, fyl> $$1, gau $$2, aer $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gay.a $$4 = new gay.a();

         for (fow $$5 : this.a()) {
            gam $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fov> {
      public fov a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fow> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fow)$$2.deserialize($$5, fow.class));
            }
         } else {
            $$3.add((fow)$$2.deserialize($$0, fow.class));
         }

         return new fov($$3);
      }
   }
}
