import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class elk implements ell {
   protected final List<emx> g;
   private final Predicate<ejy> a;

   protected elk(List<emx> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends elk> P1<Mu<T>, List<emx>> a(Instance<T> $$0) {
      return $$0.group(avu.a(emz.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cpq b(cpq $$0, ejy $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cpq a(cpq var1, ejy var2);

   @Override
   public void a(ekh $$0) {
      ell.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static elk.a<?> a(Function<List<emx>, ell> $$0) {
      return new elk.b($$0);
   }

   public abstract static class a<T extends elk.a<T>> implements ell.a, emq<T> {
      private final Builder<emx> a = ImmutableList.builder();

      public T a(emx.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<emx> g() {
         return this.a.build();
      }
   }

   static final class b extends elk.a<elk.b> {
      private final Function<List<emx>, ell> a;

      public b(Function<List<emx>, ell> $$0) {
         this.a = $$0;
      }

      protected elk.b a() {
         return this;
      }

      @Override
      public ell b() {
         return this.a.apply(this.g());
      }
   }
}
