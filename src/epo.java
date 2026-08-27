import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class epo implements epp {
   protected final List<erh> g;
   private final Predicate<eoa> a;

   protected epo(List<erh> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends epo> P1<Mu<T>, List<erh>> a(Instance<T> $$0) {
      return $$0.group(axe.a(erj.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final csd b(csd $$0, eoa $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract csd a(csd var1, eoa var2);

   @Override
   public void a(eoj $$0) {
      epp.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static epo.a<?> a(Function<List<erh>, epp> $$0) {
      return new epo.b($$0);
   }

   public abstract static class a<T extends epo.a<T>> implements epp.a, era<T> {
      private final Builder<erh> a = ImmutableList.builder();

      public T a(erh.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<erh> g() {
         return this.a.build();
      }
   }

   static final class b extends epo.a<epo.b> {
      private final Function<List<erh>, epp> a;

      public b(Function<List<erh>, epp> $$0) {
         this.a = $$0;
      }

      protected epo.b a() {
         return this;
      }

      @Override
      public epp b() {
         return this.a.apply(this.g());
      }
   }
}
