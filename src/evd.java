import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class evd implements euv {
   protected final List<exy> e;
   private final Predicate<eun> a;

   protected evd(List<exy> $$0) {
      this.e = $$0;
      this.a = ae.a($$0);
   }

   protected static <T extends evd> P1<Mu<T>, List<exy>> a(Instance<T> $$0) {
      return $$0.group(exy.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eut $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eun $$0) {
      return this.a.test($$0);
   }

   public abstract eve a();

   public abstract static class a<T extends evd.a<T>> implements exq<T> {
      private final Builder<exy> a = ImmutableList.builder();

      protected abstract T aE_();

      public T a(exy.a $$0) {
         this.a.add($$0.build());
         return this.aE_();
      }

      public final T e() {
         return this.aE_();
      }

      protected List<exy> f() {
         return this.a.build();
      }

      public euu.a a(evd.a<?> $$0) {
         return new euu.a(this, $$0);
      }

      public euz.a b(evd.a<?> $$0) {
         return new euz.a(this, $$0);
      }

      public evh.a c(evd.a<?> $$0) {
         return new evh.a(this, $$0);
      }

      public abstract evd b();
   }
}
