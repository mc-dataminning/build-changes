import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class egj implements egk {
   protected final List<ehw> g;
   private final Predicate<eex> a;

   protected egj(List<ehw> $$0) {
      this.g = $$0;
      this.a = ehy.a($$0);
   }

   protected static <T extends egj> P1<Mu<T>, List<ehw>> a(Instance<T> $$0) {
      return $$0.group(asu.a(ehy.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final clj b(clj $$0, eex $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract clj a(clj var1, eex var2);

   @Override
   public void a(efg $$0) {
      egk.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static egj.a<?> a(Function<List<ehw>, egk> $$0) {
      return new egj.b($$0);
   }

   public abstract static class a<T extends egj.a<T>> implements egk.a, ehp<T> {
      private final Builder<ehw> a = ImmutableList.builder();

      public T a(ehw.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ehw> g() {
         return this.a.build();
      }
   }

   static final class b extends egj.a<egj.b> {
      private final Function<List<ehw>, egk> a;

      public b(Function<List<ehw>, egk> $$0) {
         this.a = $$0;
      }

      protected egj.b a() {
         return this;
      }

      @Override
      public egk b() {
         return this.a.apply(this.g());
      }
   }
}
