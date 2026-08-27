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

public class fpo implements gbl {
   private final dff<csq, dfe> a;
   private final List<fpq> b;

   public fpo(dff<csq, dfe> $$0, List<fpq> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fpq> a() {
      return this.b;
   }

   public Set<fpj> b() {
      Set<fpj> $$0 = Sets.newHashSet();

      for (fpq $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fpo $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<aeu> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aeu, gbl> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gba a(gbe $$0, Function<gbd, fyz> $$1, gbi $$2, aeu $$3) {
      gbj.a $$4 = new gbj.a();

      for (fpq $$5 : this.a()) {
         gba $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fpo> {
      private final fpc.a a;

      public a(fpc.a $$0) {
         this.a = $$0;
      }

      public fpo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fpo(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fpq> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fpq> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fpq)$$0.deserialize($$3, fpq.class));
         }

         return $$2;
      }
   }
}
