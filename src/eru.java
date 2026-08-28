import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eru implements erv {
   protected final List<ets> g;
   private final Predicate<eqi> a;

   protected eru(List<ets> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   @Override
   public abstract erw<? extends eru> b();

   protected static <T extends eru> P1<Mu<T>, List<ets>> a(Instance<T> $$0) {
      return $$0.group(etu.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cup b(cup $$0, eqi $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cup a(cup var1, eqi var2);

   @Override
   public void a(eqo $$0) {
      erv.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eru.a<?> a(Function<List<ets>, erv> $$0) {
      return new eru.b($$0);
   }

   public abstract static class a<T extends eru.a<T>> implements erv.a, etl<T> {
      private final Builder<ets> a = ImmutableList.builder();

      public T a(ets.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ets> g() {
         return this.a.build();
      }
   }

   static final class b extends eru.a<eru.b> {
      private final Function<List<ets>, erv> a;

      public b(Function<List<ets>, erv> $$0) {
         this.a = $$0;
      }

      protected eru.b a() {
         return this;
      }

      @Override
      public erv b() {
         return this.a.apply(this.g());
      }
   }
}
