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

public class ftx implements gga {
   private final diq<cvz, dip> a;
   private final List<ftz> b;

   public ftx(diq<cvz, dip> $$0, List<ftz> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<ftz> a() {
      return this.b;
   }

   public Set<fts> b() {
      Set<fts> $$0 = Sets.newHashSet();

      for (ftz $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ftx $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<agt> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<agt, gga> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gfp a(gft $$0, Function<gfs, gdo> $$1, gfx $$2, agt $$3) {
      gfy.a $$4 = new gfy.a();

      for (ftz $$5 : this.a()) {
         gfp $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<ftx> {
      private final ftl.a a;

      public a(ftl.a $$0) {
         this.a = $$0;
      }

      public ftx a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new ftx(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<ftz> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<ftz> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((ftz)$$0.deserialize($$3, ftz.class));
         }

         return $$2;
      }
   }
}
