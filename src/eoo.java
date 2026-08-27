import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eoo implements eop {
   protected final List<eqc> g;
   private final Predicate<enb> a;

   protected eoo(List<eqc> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eoo> P1<Mu<T>, List<eqc>> a(Instance<T> $$0) {
      return $$0.group(aws.a(eqe.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final crj b(crj $$0, enb $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract crj a(crj var1, enb var2);

   @Override
   public void a(enk $$0) {
      eop.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eoo.a<?> a(Function<List<eqc>, eop> $$0) {
      return new eoo.b($$0);
   }

   public abstract static class a<T extends eoo.a<T>> implements eop.a, epv<T> {
      private final Builder<eqc> a = ImmutableList.builder();

      public T a(eqc.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<eqc> g() {
         return this.a.build();
      }
   }

   static final class b extends eoo.a<eoo.b> {
      private final Function<List<eqc>, eop> a;

      public b(Function<List<eqc>, eop> $$0) {
         this.a = $$0;
      }

      protected eoo.b a() {
         return this;
      }

      @Override
      public eop b() {
         return this.a.apply(this.g());
      }
   }
}
