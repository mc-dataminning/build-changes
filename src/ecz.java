import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ecz implements ecr {
   protected final List<eff> e;
   private final Predicate<ecg> a;

   protected ecz(List<eff> $$0) {
      this.e = $$0;
      this.a = efh.a($$0);
   }

   protected static <T extends ecz> P1<Mu<T>, List<eff>> a(Instance<T> $$0) {
      return $$0.group(aqy.a(efh.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ecp $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ecg $$0) {
      return this.a.test($$0);
   }

   public abstract eda a();

   public abstract static class a<T extends ecz.a<T>> implements eey<T> {
      private final Builder<eff> a = ImmutableList.builder();

      protected abstract T as_();

      public T a(eff.a $$0) {
         this.a.add($$0.build());
         return this.as_();
      }

      public final T e() {
         return this.as_();
      }

      protected List<eff> f() {
         return this.a.build();
      }

      public ecq.a a(ecz.a<?> $$0) {
         return new ecq.a(this, $$0);
      }

      public ecv.a b(ecz.a<?> $$0) {
         return new ecv.a(this, $$0);
      }

      public edd.a c(ecz.a<?> $$0) {
         return new edd.a(this, $$0);
      }

      public abstract ecz b();
   }
}
