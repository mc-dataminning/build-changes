import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ewi implements ewa {
   protected final List<ezb> e;
   private final Predicate<evs> a;

   protected ewi(List<ezb> $$0) {
      this.e = $$0;
      this.a = af.a($$0);
   }

   protected static <T extends ewi> P1<Mu<T>, List<ezb>> a(Instance<T> $$0) {
      return $$0.group(ezb.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(evy $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(evs $$0) {
      return this.a.test($$0);
   }

   public abstract ewj a();

   public abstract static class a<T extends ewi.a<T>> implements eyt<T> {
      private final Builder<ezb> a = ImmutableList.builder();

      protected abstract T aE_();

      public T a(ezb.a $$0) {
         this.a.add($$0.build());
         return this.aE_();
      }

      public final T e() {
         return this.aE_();
      }

      protected List<ezb> f() {
         return this.a.build();
      }

      public evz.a a(ewi.a<?> $$0) {
         return new evz.a(this, $$0);
      }

      public ewe.a b(ewi.a<?> $$0) {
         return new ewe.a(this, $$0);
      }

      public ewm.a c(ewi.a<?> $$0) {
         return new ewm.a(this, $$0);
      }

      public abstract ewi b();
   }
}
