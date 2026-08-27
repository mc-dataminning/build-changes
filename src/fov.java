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

public class fov implements gas {
   private final dez<csk, dey> a;
   private final List<fox> b;

   public fov(dez<csk, dey> $$0, List<fox> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fox> a() {
      return this.b;
   }

   public Set<fop> b() {
      Set<fop> $$0 = Sets.newHashSet();

      for (fox $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fov $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<aep> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aep, gas> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gah a(gal $$0, Function<gak, fyg> $$1, gap $$2, aep $$3) {
      gaq.a $$4 = new gaq.a();

      for (fox $$5 : this.a()) {
         gah $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fov> {
      private final foi.a a;

      public a(foi.a $$0) {
         this.a = $$0;
      }

      public fov a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fov(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fox> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fox> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fox)$$0.deserialize($$3, fox.class));
         }

         return $$2;
      }
   }
}
