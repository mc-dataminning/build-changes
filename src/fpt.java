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

public class fpt implements gbq {
   private final dfk<csv, dfj> a;
   private final List<fpv> b;

   public fpt(dfk<csv, dfj> $$0, List<fpv> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fpv> a() {
      return this.b;
   }

   public Set<fpo> b() {
      Set<fpo> $$0 = Sets.newHashSet();

      for (fpv $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fpt $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<aex> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aex, gbq> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gbf a(gbj $$0, Function<gbi, fze> $$1, gbn $$2, aex $$3) {
      gbo.a $$4 = new gbo.a();

      for (fpv $$5 : this.a()) {
         gbf $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fpt> {
      private final fph.a a;

      public a(fph.a $$0) {
         this.a = $$0;
      }

      public fpt a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fpt(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fpv> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fpv> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fpv)$$0.deserialize($$3, fpv.class));
         }

         return $$2;
      }
   }
}
