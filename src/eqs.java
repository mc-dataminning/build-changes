import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eqs implements eqt {
   protected final List<esn> g;
   private final Predicate<eph> a;

   protected eqs(List<esn> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eqs> P1<Mu<T>, List<esn>> a(Instance<T> $$0) {
      return $$0.group(esp.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final ctq b(ctq $$0, eph $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract ctq a(ctq var1, eph var2);

   @Override
   public void a(epn $$0) {
      eqt.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eqs.a<?> a(Function<List<esn>, eqt> $$0) {
      return new eqs.b($$0);
   }

   public abstract static class a<T extends eqs.a<T>> implements eqt.a, esg<T> {
      private final Builder<esn> a = ImmutableList.builder();

      public T a(esn.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<esn> g() {
         return this.a.build();
      }
   }

   static final class b extends eqs.a<eqs.b> {
      private final Function<List<esn>, eqt> a;

      public b(Function<List<esn>, eqt> $$0) {
         this.a = $$0;
      }

      protected eqs.b a() {
         return this;
      }

      @Override
      public eqt b() {
         return this.a.apply(this.g());
      }
   }
}
