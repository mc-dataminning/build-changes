import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class etj implements etb {
   protected final List<ewe> e;
   private final Predicate<est> a;

   protected etj(List<ewe> $$0) {
      this.e = $$0;
      this.a = ad.a($$0);
   }

   protected static <T extends etj> P1<Mu<T>, List<ewe>> a(Instance<T> $$0) {
      return $$0.group(ewe.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(esz $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(est $$0) {
      return this.a.test($$0);
   }

   public abstract etk a();

   public abstract static class a<T extends etj.a<T>> implements evw<T> {
      private final Builder<ewe> a = ImmutableList.builder();

      protected abstract T aH_();

      public T a(ewe.a $$0) {
         this.a.add($$0.build());
         return this.aH_();
      }

      public final T e() {
         return this.aH_();
      }

      protected List<ewe> f() {
         return this.a.build();
      }

      public eta.a a(etj.a<?> $$0) {
         return new eta.a(this, $$0);
      }

      public etf.a b(etj.a<?> $$0) {
         return new etf.a(this, $$0);
      }

      public etn.a c(etj.a<?> $$0) {
         return new etn.a(this, $$0);
      }

      public abstract etj b();
   }
}
