import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ede implements ecw {
   protected final List<efk> e;
   private final Predicate<ecl> a;

   protected ede(List<efk> $$0) {
      this.e = $$0;
      this.a = efm.a($$0);
   }

   protected static <T extends ede> P1<Mu<T>, List<efk>> a(Instance<T> $$0) {
      return $$0.group(arb.a(efm.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ecu $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ecl $$0) {
      return this.a.test($$0);
   }

   public abstract edf a();

   public abstract static class a<T extends ede.a<T>> implements efd<T> {
      private final Builder<efk> a = ImmutableList.builder();

      protected abstract T as_();

      public T a(efk.a $$0) {
         this.a.add($$0.build());
         return this.as_();
      }

      public final T e() {
         return this.as_();
      }

      protected List<efk> f() {
         return this.a.build();
      }

      public ecv.a a(ede.a<?> $$0) {
         return new ecv.a(this, $$0);
      }

      public eda.a b(ede.a<?> $$0) {
         return new eda.a(this, $$0);
      }

      public edi.a c(ede.a<?> $$0) {
         return new edi.a(this, $$0);
      }

      public abstract ede b();
   }
}
