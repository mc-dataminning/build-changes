import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;

public abstract class edv implements edw {
   protected final efh[] g;
   private final Predicate<ech> a;

   protected edv(efh[] $$0) {
      this.g = $$0;
      this.a = efj.a($$0);
   }

   public final ciw b(ciw $$0, ech $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract ciw a(ciw var1, ech var2);

   @Override
   public void a(ecs $$0) {
      edw.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.length; $$1++) {
         this.g[$$1].a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static edv.a<?> a(Function<efh[], edw> $$0) {
      return new edv.b($$0);
   }

   public abstract static class a<T extends edv.a<T>> implements edw.a, efa<T> {
      private final List<efh> a = Lists.newArrayList();

      public T a(efh.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected efh[] g() {
         return this.a.toArray(new efh[0]);
      }
   }

   static final class b extends edv.a<edv.b> {
      private final Function<efh[], edw> a;

      public b(Function<efh[], edw> $$0) {
         this.a = $$0;
      }

      protected edv.b a() {
         return this;
      }

      @Override
      public edw b() {
         return this.a.apply(this.g());
      }
   }

   public abstract static class c<T extends edv> implements ecq<T> {
      public void a(JsonObject $$0, T $$1, JsonSerializationContext $$2) {
         if (!ArrayUtils.isEmpty($$1.g)) {
            $$0.add("conditions", $$2.serialize($$1.g));
         }
      }

      public final T b(JsonObject $$0, JsonDeserializationContext $$1) {
         efh[] $$2 = arf.a($$0, "conditions", new efh[0], $$1, efh[].class);
         return this.b($$0, $$1, $$2);
      }

      public abstract T b(JsonObject var1, JsonDeserializationContext var2, efh[] var3);
   }
}
