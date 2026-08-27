import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eec implements eed {
   protected final List<efp> g;
   private final Predicate<ecq> a;

   protected eec(List<efp> $$0) {
      this.g = $$0;
      this.a = efr.a($$0);
   }

   protected static <T extends eec> P1<Mu<T>, List<efp>> a(Instance<T> $$0) {
      return $$0.group(arg.a(efr.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cjf b(cjf $$0, ecq $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cjf a(cjf var1, ecq var2);

   @Override
   public void a(ecz $$0) {
      eed.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static eec.a<?> a(Function<List<efp>, eed> $$0) {
      return new eec.b($$0);
   }

   public abstract static class a<T extends eec.a<T>> implements eed.a, efi<T> {
      private final Builder<efp> a = ImmutableList.builder();

      public T a(efp.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<efp> g() {
         return this.a.build();
      }
   }

   static final class b extends eec.a<eec.b> {
      private final Function<List<efp>, eed> a;

      public b(Function<List<efp>, eed> $$0) {
         this.a = $$0;
      }

      protected eec.b a() {
         return this;
      }

      @Override
      public eed b() {
         return this.a.apply(this.g());
      }
   }
}
