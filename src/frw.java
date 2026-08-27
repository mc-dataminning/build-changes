import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class frw implements gdt {
   private final dgx<cut, dgw> a;
   private final List<fry> b;

   public frw(dgx<cut, dgw> $$0, List<fry> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fry> a() {
      return this.b;
   }

   public Set<frr> b() {
      Set<frr> $$0 = Sets.newHashSet();

      for (fry $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof frw $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<agg> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<agg, gdt> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gdi a(gdm $$0, Function<gdl, gbh> $$1, gdq $$2, agg $$3) {
      gdr.a $$4 = new gdr.a();

      for (fry $$5 : this.a()) {
         gdi $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<frw> {
      private final frk.a a;

      public a(frk.a $$0) {
         this.a = $$0;
      }

      public frw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new frw(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fry> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fry> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fry)$$0.deserialize($$3, fry.class));
         }

         return $$2;
      }
   }
}
