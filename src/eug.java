import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eug implements euh {
   protected final List<ewe> g;
   private final Predicate<est> a;

   protected eug(List<ewe> $$0) {
      this.g = $$0;
      this.a = ad.a($$0);
   }

   @Override
   public abstract eui<? extends eug> b();

   protected static <T extends eug> P1<Mu<T>, List<ewe>> a(Instance<T> $$0) {
      return $$0.group(ewe.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cvl b(cvl $$0, est $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cvl a(cvl var1, est var2);

   @Override
   public void a(esz $$0) {
      euh.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eug.a<?> a(Function<List<ewe>, euh> $$0) {
      return new eug.b($$0);
   }

   public abstract static class a<T extends eug.a<T>> implements euh.a, evw<T> {
      private final Builder<ewe> a = ImmutableList.builder();

      public T a(ewe.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ewe> g() {
         return this.a.build();
      }
   }

   static final class b extends eug.a<eug.b> {
      private final Function<List<ewe>, euh> a;

      public b(Function<List<ewe>, euh> $$0) {
         this.a = $$0;
      }

      protected eug.b a() {
         return this;
      }

      @Override
      public euh b() {
         return this.a.apply(this.g());
      }
   }
}
