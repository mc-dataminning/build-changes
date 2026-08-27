import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class edj implements edb {
   protected final List<efp> e;
   private final Predicate<ecq> a;

   protected edj(List<efp> $$0) {
      this.e = $$0;
      this.a = efr.a($$0);
   }

   protected static <T extends edj> P1<Mu<T>, List<efp>> a(Instance<T> $$0) {
      return $$0.group(arg.a(efr.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ecz $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ecq $$0) {
      return this.a.test($$0);
   }

   public abstract edk a();

   public abstract static class a<T extends edj.a<T>> implements efi<T> {
      private final Builder<efp> a = ImmutableList.builder();

      protected abstract T ax_();

      public T a(efp.a $$0) {
         this.a.add($$0.build());
         return this.ax_();
      }

      public final T e() {
         return this.ax_();
      }

      protected List<efp> f() {
         return this.a.build();
      }

      public eda.a a(edj.a<?> $$0) {
         return new eda.a(this, $$0);
      }

      public edf.a b(edj.a<?> $$0) {
         return new edf.a(this, $$0);
      }

      public edn.a c(edj.a<?> $$0) {
         return new edn.a(this, $$0);
      }

      public abstract edj b();
   }
}
