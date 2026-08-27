import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eko implements ekp {
   protected final List<emb> g;
   private final Predicate<ejc> a;

   protected eko(List<emb> $$0) {
      this.g = $$0;
      this.a = emd.a($$0);
   }

   protected static <T extends eko> P1<Mu<T>, List<emb>> a(Instance<T> $$0) {
      return $$0.group(avq.a(emd.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cpd b(cpd $$0, ejc $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cpd a(cpd var1, ejc var2);

   @Override
   public void a(ejl $$0) {
      ekp.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eko.a<?> a(Function<List<emb>, ekp> $$0) {
      return new eko.b($$0);
   }

   public abstract static class a<T extends eko.a<T>> implements ekp.a, elu<T> {
      private final Builder<emb> a = ImmutableList.builder();

      public T a(emb.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<emb> g() {
         return this.a.build();
      }
   }

   static final class b extends eko.a<eko.b> {
      private final Function<List<emb>, ekp> a;

      public b(Function<List<emb>, ekp> $$0) {
         this.a = $$0;
      }

      protected eko.b a() {
         return this;
      }

      @Override
      public ekp b() {
         return this.a.apply(this.g());
      }
   }
}
