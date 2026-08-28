import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eqx implements eqp {
   protected final List<etr> e;
   private final Predicate<eqh> a;

   protected eqx(List<etr> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eqx> P1<Mu<T>, List<etr>> a(Instance<T> $$0) {
      return $$0.group(ett.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eqn $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eqh $$0) {
      return this.a.test($$0);
   }

   public abstract eqy a();

   public abstract static class a<T extends eqx.a<T>> implements etk<T> {
      private final Builder<etr> a = ImmutableList.builder();

      protected abstract T aA_();

      public T a(etr.a $$0) {
         this.a.add($$0.build());
         return this.aA_();
      }

      public final T e() {
         return this.aA_();
      }

      protected List<etr> f() {
         return this.a.build();
      }

      public eqo.a a(eqx.a<?> $$0) {
         return new eqo.a(this, $$0);
      }

      public eqt.a b(eqx.a<?> $$0) {
         return new eqt.a(this, $$0);
      }

      public erb.a c(eqx.a<?> $$0) {
         return new erb.a(this, $$0);
      }

      public abstract eqx b();
   }
}
