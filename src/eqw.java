import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eqw implements eqo {
   protected final List<etq> e;
   private final Predicate<eqg> a;

   protected eqw(List<etq> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eqw> P1<Mu<T>, List<etq>> a(Instance<T> $$0) {
      return $$0.group(ets.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eqm $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eqg $$0) {
      return this.a.test($$0);
   }

   public abstract eqx a();

   public abstract static class a<T extends eqw.a<T>> implements etj<T> {
      private final Builder<etq> a = ImmutableList.builder();

      protected abstract T aB_();

      public T a(etq.a $$0) {
         this.a.add($$0.build());
         return this.aB_();
      }

      public final T e() {
         return this.aB_();
      }

      protected List<etq> f() {
         return this.a.build();
      }

      public eqn.a a(eqw.a<?> $$0) {
         return new eqn.a(this, $$0);
      }

      public eqs.a b(eqw.a<?> $$0) {
         return new eqs.a(this, $$0);
      }

      public era.a c(eqw.a<?> $$0) {
         return new era.a(this, $$0);
      }

      public abstract eqw b();
   }
}
