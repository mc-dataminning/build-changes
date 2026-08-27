import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eds implements edt {
   protected final List<eff> g;
   private final Predicate<ecg> a;

   protected eds(List<eff> $$0) {
      this.g = $$0;
      this.a = efh.a($$0);
   }

   protected static <T extends eds> P1<Mu<T>, List<eff>> a(Instance<T> $$0) {
      return $$0.group(aqy.a(efh.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cix b(cix $$0, ecg $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cix a(cix var1, ecg var2);

   @Override
   public void a(ecp $$0) {
      edt.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static eds.a<?> a(Function<List<eff>, edt> $$0) {
      return new eds.b($$0);
   }

   public abstract static class a<T extends eds.a<T>> implements edt.a, eey<T> {
      private final Builder<eff> a = ImmutableList.builder();

      public T a(eff.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<eff> g() {
         return this.a.build();
      }
   }

   static final class b extends eds.a<eds.b> {
      private final Function<List<eff>, edt> a;

      public b(Function<List<eff>, edt> $$0) {
         this.a = $$0;
      }

      protected eds.b a() {
         return this;
      }

      @Override
      public edt b() {
         return this.a.apply(this.g());
      }
   }
}
