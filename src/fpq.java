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

public class fpq implements gbs {
   private final List<fpr> a;

   public fpq(List<fpr> $$0) {
      this.a = $$0;
   }

   public List<fpr> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fpq $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<aey> f() {
      return this.a().stream().map(fpr::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aey, gbs> $$0) {
      this.a().stream().map(fpr::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gbh a(gbl $$0, Function<gbk, fzg> $$1, gbp $$2, aey $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gbt.a $$4 = new gbt.a();

         for (fpr $$5 : this.a()) {
            gbh $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fpq> {
      public fpq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fpr> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fpr)$$2.deserialize($$5, fpr.class));
            }
         } else {
            $$3.add((fpr)$$2.deserialize($$0, fpr.class));
         }

         return new fpq($$3);
      }
   }
}
