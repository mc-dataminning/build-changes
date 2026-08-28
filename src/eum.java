import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eum implements eue {
   protected final List<exh> e;
   private final Predicate<etw> a;

   protected eum(List<exh> $$0) {
      this.e = $$0;
      this.a = ad.a($$0);
   }

   protected static <T extends eum> P1<Mu<T>, List<exh>> a(Instance<T> $$0) {
      return $$0.group(exh.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(euc $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(etw $$0) {
      return this.a.test($$0);
   }

   public abstract eun a();

   public abstract static class a<T extends eum.a<T>> implements ewz<T> {
      private final Builder<exh> a = ImmutableList.builder();

      protected abstract T aG_();

      public T a(exh.a $$0) {
         this.a.add($$0.build());
         return this.aG_();
      }

      public final T e() {
         return this.aG_();
      }

      protected List<exh> f() {
         return this.a.build();
      }

      public eud.a a(eum.a<?> $$0) {
         return new eud.a(this, $$0);
      }

      public eui.a b(eum.a<?> $$0) {
         return new eui.a(this, $$0);
      }

      public euq.a c(eum.a<?> $$0) {
         return new euq.a(this, $$0);
      }

      public abstract eum b();
   }
}
