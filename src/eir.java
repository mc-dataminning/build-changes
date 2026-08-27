import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eir implements eis {
   protected final List<eke> g;
   private final Predicate<ehf> a;

   protected eir(List<eke> $$0) {
      this.g = $$0;
      this.a = ekg.a($$0);
   }

   protected static <T extends eir> P1<Mu<T>, List<eke>> a(Instance<T> $$0) {
      return $$0.group(atx.a(ekg.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cng b(cng $$0, ehf $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cng a(cng var1, ehf var2);

   @Override
   public void a(eho $$0) {
      eis.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eir.a<?> a(Function<List<eke>, eis> $$0) {
      return new eir.b($$0);
   }

   public abstract static class a<T extends eir.a<T>> implements eis.a, ejx<T> {
      private final Builder<eke> a = ImmutableList.builder();

      public T a(eke.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<eke> g() {
         return this.a.build();
      }
   }

   static final class b extends eir.a<eir.b> {
      private final Function<List<eke>, eis> a;

      public b(Function<List<eke>, eis> $$0) {
         this.a = $$0;
      }

      protected eir.b a() {
         return this;
      }

      @Override
      public eis b() {
         return this.a.apply(this.g());
      }
   }
}
