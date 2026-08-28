import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eqz implements eqr {
   protected final List<ett> e;
   private final Predicate<eqj> a;

   protected eqz(List<ett> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eqz> P1<Mu<T>, List<ett>> a(Instance<T> $$0) {
      return $$0.group(etv.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eqp $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eqj $$0) {
      return this.a.test($$0);
   }

   public abstract era a();

   public abstract static class a<T extends eqz.a<T>> implements etm<T> {
      private final Builder<ett> a = ImmutableList.builder();

      protected abstract T aA_();

      public T a(ett.a $$0) {
         this.a.add($$0.build());
         return this.aA_();
      }

      public final T e() {
         return this.aA_();
      }

      protected List<ett> f() {
         return this.a.build();
      }

      public eqq.a a(eqz.a<?> $$0) {
         return new eqq.a(this, $$0);
      }

      public eqv.a b(eqz.a<?> $$0) {
         return new eqv.a(this, $$0);
      }

      public erd.a c(eqz.a<?> $$0) {
         return new erd.a(this, $$0);
      }

      public abstract eqz b();
   }
}
