import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class faa implements fab {
   protected final List<fbw> g;
   private final Predicate<eyn> a;

   protected faa(List<fbw> $$0) {
      this.g = $$0;
      this.a = af.a($$0);
   }

   @Override
   public abstract fac<? extends faa> b();

   protected static <T extends faa> P1<Mu<T>, List<fbw>> a(Instance<T> $$0) {
      return $$0.group(fbw.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cys b(cys $$0, eyn $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cys a(cys var1, eyn var2);

   @Override
   public void a(eyt $$0) {
      fab.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static faa.a<?> a(Function<List<fbw>, fab> $$0) {
      return new faa.b($$0);
   }

   public abstract static class a<T extends faa.a<T>> implements fab.a, fbo<T> {
      private final Builder<fbw> a = ImmutableList.builder();

      public T a(fbw.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<fbw> g() {
         return this.a.build();
      }
   }

   static final class b extends faa.a<faa.b> {
      private final Function<List<fbw>, fab> a;

      public b(Function<List<fbw>, fab> $$0) {
         this.a = $$0;
      }

      protected faa.b a() {
         return this;
      }

      @Override
      public fab b() {
         return this.a.apply(this.g());
      }
   }
}
