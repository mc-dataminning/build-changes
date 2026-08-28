import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class etc implements etd {
   protected final List<eva> g;
   private final Predicate<erp> a;

   protected etc(List<eva> $$0) {
      this.g = $$0;
      this.a = ad.a($$0);
   }

   @Override
   public abstract ete<? extends etc> b();

   protected static <T extends etc> P1<Mu<T>, List<eva>> a(Instance<T> $$0) {
      return $$0.group(eva.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cuq b(cuq $$0, erp $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cuq a(cuq var1, erp var2);

   @Override
   public void a(erv $$0) {
      etd.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static etc.a<?> a(Function<List<eva>, etd> $$0) {
      return new etc.b($$0);
   }

   public abstract static class a<T extends etc.a<T>> implements etd.a, eus<T> {
      private final Builder<eva> a = ImmutableList.builder();

      public T a(eva.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<eva> g() {
         return this.a.build();
      }
   }

   static final class b extends etc.a<etc.b> {
      private final Function<List<eva>, etd> a;

      public b(Function<List<eva>, etd> $$0) {
         this.a = $$0;
      }

      protected etc.b a() {
         return this;
      }

      @Override
      public etd b() {
         return this.a.apply(this.g());
      }
   }
}
