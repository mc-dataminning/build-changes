import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class evt implements evu {
   protected final List<exr> g;
   private final Predicate<eug> a;

   protected evt(List<exr> $$0) {
      this.g = $$0;
      this.a = ae.a($$0);
   }

   @Override
   public abstract evv<? extends evt> b();

   protected static <T extends evt> P1<Mu<T>, List<exr>> a(Instance<T> $$0) {
      return $$0.group(exr.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cwf b(cwf $$0, eug $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cwf a(cwf var1, eug var2);

   @Override
   public void a(eum $$0) {
      evu.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static evt.a<?> a(Function<List<exr>, evu> $$0) {
      return new evt.b($$0);
   }

   public abstract static class a<T extends evt.a<T>> implements evu.a, exj<T> {
      private final Builder<exr> a = ImmutableList.builder();

      public T a(exr.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<exr> g() {
         return this.a.build();
      }
   }

   static final class b extends evt.a<evt.b> {
      private final Function<List<exr>, evu> a;

      public b(Function<List<exr>, evu> $$0) {
         this.a = $$0;
      }

      protected evt.b a() {
         return this;
      }

      @Override
      public evu b() {
         return this.a.apply(this.g());
      }
   }
}
