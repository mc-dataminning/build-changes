import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class etx implements etp {
   protected final List<ews> e;
   private final Predicate<eth> a;

   protected etx(List<ews> $$0) {
      this.e = $$0;
      this.a = ad.a($$0);
   }

   protected static <T extends etx> P1<Mu<T>, List<ews>> a(Instance<T> $$0) {
      return $$0.group(ews.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(etn $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eth $$0) {
      return this.a.test($$0);
   }

   public abstract ety a();

   public abstract static class a<T extends etx.a<T>> implements ewk<T> {
      private final Builder<ews> a = ImmutableList.builder();

      protected abstract T aF_();

      public T a(ews.a $$0) {
         this.a.add($$0.build());
         return this.aF_();
      }

      public final T e() {
         return this.aF_();
      }

      protected List<ews> f() {
         return this.a.build();
      }

      public eto.a a(etx.a<?> $$0) {
         return new eto.a(this, $$0);
      }

      public ett.a b(etx.a<?> $$0) {
         return new ett.a(this, $$0);
      }

      public eub.a c(etx.a<?> $$0) {
         return new eub.a(this, $$0);
      }

      public abstract etx b();
   }
}
