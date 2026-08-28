import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eus implements euk {
   protected final List<exn> e;
   private final Predicate<euc> a;

   protected eus(List<exn> $$0) {
      this.e = $$0;
      this.a = ae.a($$0);
   }

   protected static <T extends eus> P1<Mu<T>, List<exn>> a(Instance<T> $$0) {
      return $$0.group(exn.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eui $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(euc $$0) {
      return this.a.test($$0);
   }

   public abstract eut a();

   public abstract static class a<T extends eus.a<T>> implements exf<T> {
      private final Builder<exn> a = ImmutableList.builder();

      protected abstract T aF_();

      public T a(exn.a $$0) {
         this.a.add($$0.build());
         return this.aF_();
      }

      public final T e() {
         return this.aF_();
      }

      protected List<exn> f() {
         return this.a.build();
      }

      public euj.a a(eus.a<?> $$0) {
         return new euj.a(this, $$0);
      }

      public euo.a b(eus.a<?> $$0) {
         return new euo.a(this, $$0);
      }

      public euw.a c(eus.a<?> $$0) {
         return new euw.a(this, $$0);
      }

      public abstract eus b();
   }
}
