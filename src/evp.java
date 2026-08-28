import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class evp implements evq {
   protected final List<exn> g;
   private final Predicate<euc> a;

   protected evp(List<exn> $$0) {
      this.g = $$0;
      this.a = ae.a($$0);
   }

   @Override
   public abstract evr<? extends evp> b();

   protected static <T extends evp> P1<Mu<T>, List<exn>> a(Instance<T> $$0) {
      return $$0.group(exn.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cwb b(cwb $$0, euc $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cwb a(cwb var1, euc var2);

   @Override
   public void a(eui $$0) {
      evq.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static evp.a<?> a(Function<List<exn>, evq> $$0) {
      return new evp.b($$0);
   }

   public abstract static class a<T extends evp.a<T>> implements evq.a, exf<T> {
      private final Builder<exn> a = ImmutableList.builder();

      public T a(exn.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<exn> g() {
         return this.a.build();
      }
   }

   static final class b extends evp.a<evp.b> {
      private final Function<List<exn>, evq> a;

      public b(Function<List<exn>, evq> $$0) {
         this.a = $$0;
      }

      protected evp.b a() {
         return this;
      }

      @Override
      public evq b() {
         return this.a.apply(this.g());
      }
   }
}
