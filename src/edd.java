import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class edd implements ecv {
   protected final List<efj> e;
   private final Predicate<eck> a;

   protected edd(List<efj> $$0) {
      this.e = $$0;
      this.a = efl.a($$0);
   }

   protected static <T extends edd> P1<Mu<T>, List<efj>> a(Instance<T> $$0) {
      return $$0.group(arj.a(efl.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ect $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eck $$0) {
      return this.a.test($$0);
   }

   public abstract ede a();

   public abstract static class a<T extends edd.a<T>> implements efc<T> {
      private final Builder<efj> a = ImmutableList.builder();

      protected abstract T ax_();

      public T a(efj.a $$0) {
         this.a.add($$0.build());
         return this.ax_();
      }

      public final T e() {
         return this.ax_();
      }

      protected List<efj> f() {
         return this.a.build();
      }

      public ecu.a a(edd.a<?> $$0) {
         return new ecu.a(this, $$0);
      }

      public ecz.a b(edd.a<?> $$0) {
         return new ecz.a(this, $$0);
      }

      public edh.a c(edd.a<?> $$0) {
         return new edh.a(this, $$0);
      }

      public abstract edd b();
   }
}
