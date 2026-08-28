import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class euw implements euo {
   protected final List<exr> e;
   private final Predicate<eug> a;

   protected euw(List<exr> $$0) {
      this.e = $$0;
      this.a = ae.a($$0);
   }

   protected static <T extends euw> P1<Mu<T>, List<exr>> a(Instance<T> $$0) {
      return $$0.group(exr.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eum $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eug $$0) {
      return this.a.test($$0);
   }

   public abstract eux a();

   public abstract static class a<T extends euw.a<T>> implements exj<T> {
      private final Builder<exr> a = ImmutableList.builder();

      protected abstract T aF_();

      public T a(exr.a $$0) {
         this.a.add($$0.build());
         return this.aF_();
      }

      public final T e() {
         return this.aF_();
      }

      protected List<exr> f() {
         return this.a.build();
      }

      public eun.a a(euw.a<?> $$0) {
         return new eun.a(this, $$0);
      }

      public eus.a b(euw.a<?> $$0) {
         return new eus.a(this, $$0);
      }

      public eva.a c(euw.a<?> $$0) {
         return new eva.a(this, $$0);
      }

      public abstract euw b();
   }
}
