import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eii implements eij {
   protected final List<ejv> g;
   private final Predicate<egw> a;

   protected eii(List<ejv> $$0) {
      this.g = $$0;
      this.a = ejx.a($$0);
   }

   protected static <T extends eii> P1<Mu<T>, List<ejv>> a(Instance<T> $$0) {
      return $$0.group(atw.a(ejx.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cmy b(cmy $$0, egw $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cmy a(cmy var1, egw var2);

   @Override
   public void a(ehf $$0) {
      eij.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eii.a<?> a(Function<List<ejv>, eij> $$0) {
      return new eii.b($$0);
   }

   public abstract static class a<T extends eii.a<T>> implements eij.a, ejo<T> {
      private final Builder<ejv> a = ImmutableList.builder();

      public T a(ejv.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ejv> g() {
         return this.a.build();
      }
   }

   static final class b extends eii.a<eii.b> {
      private final Function<List<ejv>, eij> a;

      public b(Function<List<ejv>, eij> $$0) {
         this.a = $$0;
      }

      protected eii.b a() {
         return this;
      }

      @Override
      public eij b() {
         return this.a.apply(this.g());
      }
   }
}
