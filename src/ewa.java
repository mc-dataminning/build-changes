import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ewa implements ewb {
   protected final List<exy> g;
   private final Predicate<eun> a;

   protected ewa(List<exy> $$0) {
      this.g = $$0;
      this.a = ae.a($$0);
   }

   @Override
   public abstract ewc<? extends ewa> b();

   protected static <T extends ewa> P1<Mu<T>, List<exy>> a(Instance<T> $$0) {
      return $$0.group(exy.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cwm b(cwm $$0, eun $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cwm a(cwm var1, eun var2);

   @Override
   public void a(eut $$0) {
      ewb.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static ewa.a<?> a(Function<List<exy>, ewb> $$0) {
      return new ewa.b($$0);
   }

   public abstract static class a<T extends ewa.a<T>> implements ewb.a, exq<T> {
      private final Builder<exy> a = ImmutableList.builder();

      public T a(exy.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<exy> g() {
         return this.a.build();
      }
   }

   static final class b extends ewa.a<ewa.b> {
      private final Function<List<exy>, ewb> a;

      public b(Function<List<exy>, ewb> $$0) {
         this.a = $$0;
      }

      protected ewa.b a() {
         return this;
      }

      @Override
      public ewb b() {
         return this.a.apply(this.g());
      }
   }
}
