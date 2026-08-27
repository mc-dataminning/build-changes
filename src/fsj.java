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

public class fsj implements geg {
   private final dhj<cva, dhi> a;
   private final List<fsl> b;

   public fsj(dhj<cva, dhi> $$0, List<fsl> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fsl> a() {
      return this.b;
   }

   public Set<fse> b() {
      Set<fse> $$0 = Sets.newHashSet();

      for (fsl $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fsj $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<agi> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<agi, geg> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gdv a(gdz $$0, Function<gdy, gbu> $$1, ged $$2, agi $$3) {
      gee.a $$4 = new gee.a();

      for (fsl $$5 : this.a()) {
         gdv $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fsj> {
      private final frx.a a;

      public a(frx.a $$0) {
         this.a = $$0;
      }

      public fsj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fsj(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fsl> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fsl> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fsl)$$0.deserialize($$3, fsl.class));
         }

         return $$2;
      }
   }
}
