import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;

public abstract class edc implements ecu {
   protected final efh[] d;
   private final Predicate<ech> c;

   protected edc(efh[] $$0) {
      this.d = $$0;
      this.c = efj.a($$0);
   }

   public void a(ecs $$0) {
      for (int $$1 = 0; $$1 < this.d.length; $$1++) {
         this.d[$$1].a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ech $$0) {
      return this.c.test($$0);
   }

   public abstract edd a();

   public abstract static class a<T extends edc.a<T>> implements efa<T> {
      private final List<efh> a = Lists.newArrayList();

      protected abstract T at_();

      public T a(efh.a $$0) {
         this.a.add($$0.build());
         return this.at_();
      }

      public final T e() {
         return this.at_();
      }

      protected efh[] f() {
         return this.a.toArray(new efh[0]);
      }

      public ect.a a(edc.a<?> $$0) {
         return new ect.a(this, $$0);
      }

      public ecy.a b(edc.a<?> $$0) {
         return new ecy.a(this, $$0);
      }

      public edg.a c(edc.a<?> $$0) {
         return new edg.a(this, $$0);
      }

      public abstract edc b();
   }

   public abstract static class b<T extends edc> implements ecq<T> {
      public final void b(JsonObject $$0, T $$1, JsonSerializationContext $$2) {
         if (!ArrayUtils.isEmpty($$1.d)) {
            $$0.add("conditions", $$2.serialize($$1.d));
         }

         this.a($$0, $$1, $$2);
      }

      public final T b(JsonObject $$0, JsonDeserializationContext $$1) {
         efh[] $$2 = arf.a($$0, "conditions", new efh[0], $$1, efh[].class);
         return this.b($$0, $$1, $$2);
      }

      public abstract void a(JsonObject var1, T var2, JsonSerializationContext var3);

      public abstract T b(JsonObject var1, JsonDeserializationContext var2, efh[] var3);
   }
}
