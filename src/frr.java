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

public class frr implements gdt {
   private final List<frs> a;

   public frr(List<frs> $$0) {
      this.a = $$0;
   }

   public List<frs> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof frr $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<agg> f() {
      return this.a().stream().map(frs::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<agg, gdt> $$0) {
      this.a().stream().map(frs::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gdi a(gdm $$0, Function<gdl, gbh> $$1, gdq $$2, agg $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gdu.a $$4 = new gdu.a();

         for (frs $$5 : this.a()) {
            gdi $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<frr> {
      public frr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<frs> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((frs)$$2.deserialize($$5, frs.class));
            }
         } else {
            $$3.add((frs)$$2.deserialize($$0, frs.class));
         }

         return new frr($$3);
      }
   }
}
