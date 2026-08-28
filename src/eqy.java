import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eqy implements eqq {
   protected final List<ets> e;
   private final Predicate<eqi> a;

   protected eqy(List<ets> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eqy> P1<Mu<T>, List<ets>> a(Instance<T> $$0) {
      return $$0.group(etu.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eqo $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eqi $$0) {
      return this.a.test($$0);
   }

   public abstract eqz a();

   public abstract static class a<T extends eqy.a<T>> implements etl<T> {
      private final Builder<ets> a = ImmutableList.builder();

      protected abstract T aA_();

      public T a(ets.a $$0) {
         this.a.add($$0.build());
         return this.aA_();
      }

      public final T e() {
         return this.aA_();
      }

      protected List<ets> f() {
         return this.a.build();
      }

      public eqp.a a(eqy.a<?> $$0) {
         return new eqp.a(this, $$0);
      }

      public equ.a b(eqy.a<?> $$0) {
         return new equ.a(this, $$0);
      }

      public erc.a c(eqy.a<?> $$0) {
         return new erc.a(this, $$0);
      }

      public abstract eqy b();
   }
}
