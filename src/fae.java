import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class fae implements ezw {
   protected final List<fcx> e;
   private final Predicate<ezo> a;

   protected fae(List<fcx> $$0) {
      this.e = $$0;
      this.a = ag.a($$0);
   }

   protected static <T extends fae> P1<Mu<T>, List<fcx>> a(Instance<T> $$0) {
      return $$0.group(fcx.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ezu $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ezo $$0) {
      return this.a.test($$0);
   }

   public abstract faf a();

   public abstract static class a<T extends fae.a<T>> implements fcp<T> {
      private final Builder<fcx> a = ImmutableList.builder();

      protected abstract T aB_();

      public T a(fcx.a $$0) {
         this.a.add($$0.build());
         return this.aB_();
      }

      public final T e() {
         return this.aB_();
      }

      protected List<fcx> f() {
         return this.a.build();
      }

      public ezv.a a(fae.a<?> $$0) {
         return new ezv.a(this, $$0);
      }

      public faa.a b(fae.a<?> $$0) {
         return new faa.a(this, $$0);
      }

      public fai.a c(fae.a<?> $$0) {
         return new fai.a(this, $$0);
      }

      public abstract fae b();
   }
}
