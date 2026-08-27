import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eib implements eic {
   protected final List<ejo> g;
   private final Predicate<egp> a;

   protected eib(List<ejo> $$0) {
      this.g = $$0;
      this.a = ejq.a($$0);
   }

   protected static <T extends eib> P1<Mu<T>, List<ejo>> a(Instance<T> $$0) {
      return $$0.group(atq.a(ejq.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cmr b(cmr $$0, egp $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cmr a(cmr var1, egp var2);

   @Override
   public void a(egy $$0) {
      eic.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eib.a<?> a(Function<List<ejo>, eic> $$0) {
      return new eib.b($$0);
   }

   public abstract static class a<T extends eib.a<T>> implements eic.a, ejh<T> {
      private final Builder<ejo> a = ImmutableList.builder();

      public T a(ejo.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ejo> g() {
         return this.a.build();
      }
   }

   static final class b extends eib.a<eib.b> {
      private final Function<List<ejo>, eic> a;

      public b(Function<List<ejo>, eic> $$0) {
         this.a = $$0;
      }

      protected eib.b a() {
         return this;
      }

      @Override
      public eic b() {
         return this.a.apply(this.g());
      }
   }
}
