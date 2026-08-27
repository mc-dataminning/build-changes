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

public class fso implements gel {
   private final dho<cvf, dhn> a;
   private final List<fsq> b;

   public fso(dho<cvf, dhn> $$0, List<fsq> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fsq> a() {
      return this.b;
   }

   public Set<fsj> b() {
      Set<fsj> $$0 = Sets.newHashSet();

      for (fsq $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fso $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<agm> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<agm, gel> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gea a(gee $$0, Function<ged, gbz> $$1, gei $$2, agm $$3) {
      gej.a $$4 = new gej.a();

      for (fsq $$5 : this.a()) {
         gea $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fso> {
      private final fsc.a a;

      public a(fsc.a $$0) {
         this.a = $$0;
      }

      public fso a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fso(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fsq> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fsq> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fsq)$$0.deserialize($$3, fsq.class));
         }

         return $$2;
      }
   }
}
