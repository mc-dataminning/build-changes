import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class edx implements edy {
   protected final List<efk> g;
   private final Predicate<ecl> a;

   protected edx(List<efk> $$0) {
      this.g = $$0;
      this.a = efm.a($$0);
   }

   protected static <T extends edx> P1<Mu<T>, List<efk>> a(Instance<T> $$0) {
      return $$0.group(arb.a(efm.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cja b(cja $$0, ecl $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cja a(cja var1, ecl var2);

   @Override
   public void a(ecu $$0) {
      edy.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static edx.a<?> a(Function<List<efk>, edy> $$0) {
      return new edx.b($$0);
   }

   public abstract static class a<T extends edx.a<T>> implements edy.a, efd<T> {
      private final Builder<efk> a = ImmutableList.builder();

      public T a(efk.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<efk> g() {
         return this.a.build();
      }
   }

   static final class b extends edx.a<edx.b> {
      private final Function<List<efk>, edy> a;

      public b(Function<List<efk>, edy> $$0) {
         this.a = $$0;
      }

      protected edx.b a() {
         return this;
      }

      @Override
      public edy b() {
         return this.a.apply(this.g());
      }
   }
}
