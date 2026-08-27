import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eta implements etb {
   protected final List<euu> g;
   private final Predicate<erp> a;

   protected eta(List<euu> $$0) {
      this.g = $$0;
      this.a = ad.a($$0);
   }

   protected static <T extends eta> P1<Mu<T>, List<euu>> a(Instance<T> $$0) {
      return $$0.group(axu.a(euw.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cuh b(cuh $$0, erp $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cuh a(cuh var1, erp var2);

   @Override
   public void a(erv $$0) {
      etb.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eta.a<?> a(Function<List<euu>, etb> $$0) {
      return new eta.b($$0);
   }

   public abstract static class a<T extends eta.a<T>> implements etb.a, eun<T> {
      private final Builder<euu> a = ImmutableList.builder();

      public T a(euu.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<euu> g() {
         return this.a.build();
      }
   }

   static final class b extends eta.a<eta.b> {
      private final Function<List<euu>, etb> a;

      public b(Function<List<euu>, etb> $$0) {
         this.a = $$0;
      }

      protected eta.b a() {
         return this;
      }

      @Override
      public etb b() {
         return this.a.apply(this.g());
      }
   }
}
