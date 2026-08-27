import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class efv implements efn {
   protected final List<eib> e;
   private final Predicate<efc> a;

   protected efv(List<eib> $$0) {
      this.e = $$0;
      this.a = eid.a($$0);
   }

   protected static <T extends efv> P1<Mu<T>, List<eib>> a(Instance<T> $$0) {
      return $$0.group(asy.a(eid.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(efl $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(efc $$0) {
      return this.a.test($$0);
   }

   public abstract efw a();

   public abstract static class a<T extends efv.a<T>> implements ehu<T> {
      private final Builder<eib> a = ImmutableList.builder();

      protected abstract T aE_();

      public T a(eib.a $$0) {
         this.a.add($$0.build());
         return this.aE_();
      }

      public final T e() {
         return this.aE_();
      }

      protected List<eib> f() {
         return this.a.build();
      }

      public efm.a a(efv.a<?> $$0) {
         return new efm.a(this, $$0);
      }

      public efr.a b(efv.a<?> $$0) {
         return new efr.a(this, $$0);
      }

      public efz.a c(efv.a<?> $$0) {
         return new efz.a(this, $$0);
      }

      public abstract efv b();
   }
}
