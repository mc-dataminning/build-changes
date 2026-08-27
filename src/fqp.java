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

public class fqp implements gcm {
   private final dgc<cua, dgb> a;
   private final List<fqr> b;

   public fqp(dgc<cua, dgb> $$0, List<fqr> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fqr> a() {
      return this.b;
   }

   public Set<fqk> b() {
      Set<fqk> $$0 = Sets.newHashSet();

      for (fqr $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fqp $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<afw> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<afw, gcm> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gcb a(gcf $$0, Function<gce, gaa> $$1, gcj $$2, afw $$3) {
      gck.a $$4 = new gck.a();

      for (fqr $$5 : this.a()) {
         gcb $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fqp> {
      private final fqd.a a;

      public a(fqd.a $$0) {
         this.a = $$0;
      }

      public fqp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fqp(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fqr> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fqr> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fqr)$$0.deserialize($$3, fqr.class));
         }

         return $$2;
      }
   }
}
