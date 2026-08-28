import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ewg implements evy {
   protected final List<eyz> e;
   private final Predicate<evq> a;

   protected ewg(List<eyz> $$0) {
      this.e = $$0;
      this.a = af.a($$0);
   }

   protected static <T extends ewg> P1<Mu<T>, List<eyz>> a(Instance<T> $$0) {
      return $$0.group(eyz.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(evw $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(evq $$0) {
      return this.a.test($$0);
   }

   public abstract ewh a();

   public abstract static class a<T extends ewg.a<T>> implements eyr<T> {
      private final Builder<eyz> a = ImmutableList.builder();

      protected abstract T aE_();

      public T a(eyz.a $$0) {
         this.a.add($$0.build());
         return this.aE_();
      }

      public final T e() {
         return this.aE_();
      }

      protected List<eyz> f() {
         return this.a.build();
      }

      public evx.a a(ewg.a<?> $$0) {
         return new evx.a(this, $$0);
      }

      public ewc.a b(ewg.a<?> $$0) {
         return new ewc.a(this, $$0);
      }

      public ewk.a c(ewg.a<?> $$0) {
         return new ewk.a(this, $$0);
      }

      public abstract ewg b();
   }
}
