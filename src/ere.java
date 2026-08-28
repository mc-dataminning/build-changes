import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ere implements eqw {
   protected final List<etz> e;
   private final Predicate<eqo> a;

   protected ere(List<etz> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends ere> P1<Mu<T>, List<etz>> a(Instance<T> $$0) {
      return $$0.group(etz.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(equ $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eqo $$0) {
      return this.a.test($$0);
   }

   public abstract erf a();

   public abstract static class a<T extends ere.a<T>> implements etr<T> {
      private final Builder<etz> a = ImmutableList.builder();

      protected abstract T aC_();

      public T a(etz.a $$0) {
         this.a.add($$0.build());
         return this.aC_();
      }

      public final T e() {
         return this.aC_();
      }

      protected List<etz> f() {
         return this.a.build();
      }

      public eqv.a a(ere.a<?> $$0) {
         return new eqv.a(this, $$0);
      }

      public era.a b(ere.a<?> $$0) {
         return new era.a(this, $$0);
      }

      public eri.a c(ere.a<?> $$0) {
         return new eri.a(this, $$0);
      }

      public abstract ere b();
   }
}
