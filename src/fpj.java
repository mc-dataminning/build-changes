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

public class fpj implements gbg {
   private final dfa<csl, dez> a;
   private final List<fpl> b;

   public fpj(dfa<csl, dez> $$0, List<fpl> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fpl> a() {
      return this.b;
   }

   public Set<fpe> b() {
      Set<fpe> $$0 = Sets.newHashSet();

      for (fpl $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fpj $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<aer> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aer, gbg> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gav a(gaz $$0, Function<gay, fyu> $$1, gbd $$2, aer $$3) {
      gbe.a $$4 = new gbe.a();

      for (fpl $$5 : this.a()) {
         gav $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fpj> {
      private final fox.a a;

      public a(fox.a $$0) {
         this.a = $$0;
      }

      public fpj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fpj(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fpl> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fpl> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fpl)$$0.deserialize($$3, fpl.class));
         }

         return $$2;
      }
   }
}
