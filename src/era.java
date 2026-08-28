import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class era implements eqs {
   protected final List<etu> e;
   private final Predicate<eqk> a;

   protected era(List<etu> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends era> P1<Mu<T>, List<etu>> a(Instance<T> $$0) {
      return $$0.group(etw.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eqq $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eqk $$0) {
      return this.a.test($$0);
   }

   public abstract erb a();

   public abstract static class a<T extends era.a<T>> implements etn<T> {
      private final Builder<etu> a = ImmutableList.builder();

      protected abstract T aA_();

      public T a(etu.a $$0) {
         this.a.add($$0.build());
         return this.aA_();
      }

      public final T e() {
         return this.aA_();
      }

      protected List<etu> f() {
         return this.a.build();
      }

      public eqr.a a(era.a<?> $$0) {
         return new eqr.a(this, $$0);
      }

      public eqw.a b(era.a<?> $$0) {
         return new eqw.a(this, $$0);
      }

      public ere.a c(era.a<?> $$0) {
         return new ere.a(this, $$0);
      }

      public abstract era b();
   }
}
