import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;

public abstract class eay implements eaz {
   protected final eck[] g;
   private final Predicate<dzk> a;

   protected eay(eck[] $$0) {
      this.g = $$0;
      this.a = ecm.a($$0);
   }

   public final cfz b(cfz $$0, dzk $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cfz a(cfz var1, dzk var2);

   @Override
   public void a(dzv $$0) {
      eaz.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.length; $$1++) {
         this.g[$$1].a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static eay.a<?> a(Function<eck[], eaz> $$0) {
      return new eay.b($$0);
   }

   public abstract static class a<T extends eay.a<T>> implements eaz.a, ecd<T> {
      private final List<eck> a = Lists.newArrayList();

      public T a(eck.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected eck[] g() {
         return this.a.toArray(new eck[0]);
      }
   }

   static final class b extends eay.a<eay.b> {
      private final Function<eck[], eaz> a;

      public b(Function<eck[], eaz> $$0) {
         this.a = $$0;
      }

      protected eay.b a() {
         return this;
      }

      @Override
      public eaz b() {
         return this.a.apply(this.g());
      }
   }

   public abstract static class c<T extends eay> implements dzt<T> {
      public void a(JsonObject $$0, T $$1, JsonSerializationContext $$2) {
         if (!ArrayUtils.isEmpty($$1.g)) {
            $$0.add("conditions", $$2.serialize($$1.g));
         }
      }

      public final T b(JsonObject $$0, JsonDeserializationContext $$1) {
         eck[] $$2 = aor.a($$0, "conditions", new eck[0], $$1, eck[].class);
         return this.b($$0, $$1, $$2);
      }

      public abstract T b(JsonObject var1, JsonDeserializationContext var2, eck[] var3);
   }
}
