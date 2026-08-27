import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class eey implements efh {
   final efh[] a;
   private final Predicate<ech> b;

   protected eey(efh[] $$0, Predicate<ech> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public final boolean a(ech $$0) {
      return this.b.test($$0);
   }

   @Override
   public void a(ecs $$0) {
      efh.super.a($$0);

      for (int $$1 = 0; $$1 < this.a.length; $$1++) {
         this.a[$$1].a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements efh.a {
      private final List<efh> a = new ArrayList<>();

      public a(efh.a... $$0) {
         for (efh.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(efh.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public efh build() {
         efh[] $$0 = this.a.toArray(efh[]::new);
         return this.a($$0);
      }

      protected abstract efh a(efh[] var1);
   }

   public abstract static class b<T extends eey> implements ecq<T> {
      public void a(JsonObject $$0, eey $$1, JsonSerializationContext $$2) {
         $$0.add("terms", $$2.serialize($$1.a));
      }

      public T b(JsonObject $$0, JsonDeserializationContext $$1) {
         efh[] $$2 = arf.a($$0, "terms", $$1, efh[].class);
         return this.b($$2);
      }

      protected abstract T b(efh[] var1);
   }
}
