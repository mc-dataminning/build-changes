import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class evj implements evk {
   protected final List<exh> g;
   private final Predicate<etw> a;

   protected evj(List<exh> $$0) {
      this.g = $$0;
      this.a = ad.a($$0);
   }

   @Override
   public abstract evl<? extends evj> b();

   protected static <T extends evj> P1<Mu<T>, List<exh>> a(Instance<T> $$0) {
      return $$0.group(exh.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cvx b(cvx $$0, etw $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cvx a(cvx var1, etw var2);

   @Override
   public void a(euc $$0) {
      evk.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static evj.a<?> a(Function<List<exh>, evk> $$0) {
      return new evj.b($$0);
   }

   public abstract static class a<T extends evj.a<T>> implements evk.a, ewz<T> {
      private final Builder<exh> a = ImmutableList.builder();

      public T a(exh.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<exh> g() {
         return this.a.build();
      }
   }

   static final class b extends evj.a<evj.b> {
      private final Function<List<exh>, evk> a;

      public b(Function<List<exh>, evk> $$0) {
         this.a = $$0;
      }

      protected evj.b a() {
         return this;
      }

      @Override
      public evk b() {
         return this.a.apply(this.g());
      }
   }
}
