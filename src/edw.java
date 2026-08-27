import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class edw implements edx {
   protected final List<efj> g;
   private final Predicate<eck> a;

   protected edw(List<efj> $$0) {
      this.g = $$0;
      this.a = efl.a($$0);
   }

   protected static <T extends edw> P1<Mu<T>, List<efj>> a(Instance<T> $$0) {
      return $$0.group(arj.a(efl.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cjl b(cjl $$0, eck $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cjl a(cjl var1, eck var2);

   @Override
   public void a(ect $$0) {
      edx.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static edw.a<?> a(Function<List<efj>, edx> $$0) {
      return new edw.b($$0);
   }

   public abstract static class a<T extends edw.a<T>> implements edx.a, efc<T> {
      private final Builder<efj> a = ImmutableList.builder();

      public T a(efj.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<efj> g() {
         return this.a.build();
      }
   }

   static final class b extends edw.a<edw.b> {
      private final Function<List<efj>, edx> a;

      public b(Function<List<efj>, edx> $$0) {
         this.a = $$0;
      }

      protected edw.b a() {
         return this;
      }

      @Override
      public edx b() {
         return this.a.apply(this.g());
      }
   }
}
