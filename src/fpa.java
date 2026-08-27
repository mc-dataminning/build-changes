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

public class fpa implements gax {
   private final dfb<csm, dfa> a;
   private final List<fpc> b;

   public fpa(dfb<csm, dfa> $$0, List<fpc> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fpc> a() {
      return this.b;
   }

   public Set<fov> b() {
      Set<fov> $$0 = Sets.newHashSet();

      for (fpc $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fpa $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
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
   public void a(Function<aer, gax> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gam a(gaq $$0, Function<gap, fyl> $$1, gau $$2, aer $$3) {
      gav.a $$4 = new gav.a();

      for (fpc $$5 : this.a()) {
         gam $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fpa> {
      private final fon.a a;

      public a(fon.a $$0) {
         this.a = $$0;
      }

      public fpa a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fpa(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fpc> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fpc> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fpc)$$0.deserialize($$3, fpc.class));
         }

         return $$2;
      }
   }
}
