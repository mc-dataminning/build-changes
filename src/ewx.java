import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ewx implements ewp {
   protected final List<ezs> e;
   private final Predicate<ewh> a;

   protected ewx(List<ezs> $$0) {
      this.e = $$0;
      this.a = ae.a($$0);
   }

   protected static <T extends ewx> P1<Mu<T>, List<ezs>> a(Instance<T> $$0) {
      return $$0.group(ezs.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ewn $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ewh $$0) {
      return this.a.test($$0);
   }

   public abstract ewy a();

   public abstract static class a<T extends ewx.a<T>> implements ezk<T> {
      private final Builder<ezs> a = ImmutableList.builder();

      protected abstract T aF_();

      public T a(ezs.a $$0) {
         this.a.add($$0.build());
         return this.aF_();
      }

      public final T e() {
         return this.aF_();
      }

      protected List<ezs> f() {
         return this.a.build();
      }

      public ewo.a a(ewx.a<?> $$0) {
         return new ewo.a(this, $$0);
      }

      public ewt.a b(ewx.a<?> $$0) {
         return new ewt.a(this, $$0);
      }

      public exb.a c(ewx.a<?> $$0) {
         return new exb.a(this, $$0);
      }

      public abstract ewx b();
   }
}
