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

public class fpp implements gbm {
   private final dfe<ctc, dfd> a;
   private final List<fpr> b;

   public fpp(dfe<ctc, dfd> $$0, List<fpr> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fpr> a() {
      return this.b;
   }

   public Set<fpk> b() {
      Set<fpk> $$0 = Sets.newHashSet();

      for (fpr $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fpp $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<aez> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aez, gbm> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gbb a(gbf $$0, Function<gbe, fza> $$1, gbj $$2, aez $$3) {
      gbk.a $$4 = new gbk.a();

      for (fpr $$5 : this.a()) {
         gbb $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fpp> {
      private final fpd.a a;

      public a(fpd.a $$0) {
         this.a = $$0;
      }

      public fpp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fpp(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fpr> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fpr> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fpr)$$0.deserialize($$3, fpr.class));
         }

         return $$2;
      }
   }
}
