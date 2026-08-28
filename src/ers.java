import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ers implements ert {
   protected final List<etq> g;
   private final Predicate<eqg> a;

   protected ers(List<etq> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   @Override
   public abstract eru<? extends ers> b();

   protected static <T extends ers> P1<Mu<T>, List<etq>> a(Instance<T> $$0) {
      return $$0.group(ets.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cun b(cun $$0, eqg $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cun a(cun var1, eqg var2);

   @Override
   public void a(eqm $$0) {
      ert.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static ers.a<?> a(Function<List<etq>, ert> $$0) {
      return new ers.b($$0);
   }

   public abstract static class a<T extends ers.a<T>> implements ert.a, etj<T> {
      private final Builder<etq> a = ImmutableList.builder();

      public T a(etq.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<etq> g() {
         return this.a.build();
      }
   }

   static final class b extends ers.a<ers.b> {
      private final Function<List<etq>, ert> a;

      public b(Function<List<etq>, ert> $$0) {
         this.a = $$0;
      }

      protected ers.b a() {
         return this;
      }

      @Override
      public ert b() {
         return this.a.apply(this.g());
      }
   }
}
