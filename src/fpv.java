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

public class fpv implements gbs {
   private final dfm<csx, dfl> a;
   private final List<fpx> b;

   public fpv(dfm<csx, dfl> $$0, List<fpx> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fpx> a() {
      return this.b;
   }

   public Set<fpq> b() {
      Set<fpq> $$0 = Sets.newHashSet();

      for (fpx $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fpv $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<aey> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aey, gbs> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gbh a(gbl $$0, Function<gbk, fzg> $$1, gbp $$2, aey $$3) {
      gbq.a $$4 = new gbq.a();

      for (fpx $$5 : this.a()) {
         gbh $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fpv> {
      private final fpj.a a;

      public a(fpj.a $$0) {
         this.a = $$0;
      }

      public fpv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fpv(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fpx> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fpx> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fpx)$$0.deserialize($$3, fpx.class));
         }

         return $$2;
      }
   }
}
