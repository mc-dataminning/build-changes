import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eox implements eoy {
   protected final List<eql> g;
   private final Predicate<enk> a;

   protected eox(List<eql> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eox> P1<Mu<T>, List<eql>> a(Instance<T> $$0) {
      return $$0.group(awu.a(eqn.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final crs b(crs $$0, enk $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract crs a(crs var1, enk var2);

   @Override
   public void a(ent $$0) {
      eoy.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eox.a<?> a(Function<List<eql>, eoy> $$0) {
      return new eox.b($$0);
   }

   public abstract static class a<T extends eox.a<T>> implements eoy.a, eqe<T> {
      private final Builder<eql> a = ImmutableList.builder();

      public T a(eql.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<eql> g() {
         return this.a.build();
      }
   }

   static final class b extends eox.a<eox.b> {
      private final Function<List<eql>, eoy> a;

      public b(Function<List<eql>, eoy> $$0) {
         this.a = $$0;
      }

      protected eox.b a() {
         return this;
      }

      @Override
      public eoy b() {
         return this.a.apply(this.g());
      }
   }
}
