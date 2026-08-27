import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class efq implements efi {
   protected final List<ehw> e;
   private final Predicate<eex> a;

   protected efq(List<ehw> $$0) {
      this.e = $$0;
      this.a = ehy.a($$0);
   }

   protected static <T extends efq> P1<Mu<T>, List<ehw>> a(Instance<T> $$0) {
      return $$0.group(asu.a(ehy.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(efg $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eex $$0) {
      return this.a.test($$0);
   }

   public abstract efr a();

   public abstract static class a<T extends efq.a<T>> implements ehp<T> {
      private final Builder<ehw> a = ImmutableList.builder();

      protected abstract T aD_();

      public T a(ehw.a $$0) {
         this.a.add($$0.build());
         return this.aD_();
      }

      public final T e() {
         return this.aD_();
      }

      protected List<ehw> f() {
         return this.a.build();
      }

      public efh.a a(efq.a<?> $$0) {
         return new efh.a(this, $$0);
      }

      public efm.a b(efq.a<?> $$0) {
         return new efm.a(this, $$0);
      }

      public efu.a c(efq.a<?> $$0) {
         return new efu.a(this, $$0);
      }

      public abstract efq b();
   }
}
