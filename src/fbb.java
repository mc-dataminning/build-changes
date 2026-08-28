import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fbb implements fbc {
   protected final List<fcx> g;
   private final Predicate<ezo> a;

   protected fbb(List<fcx> $$0) {
      this.g = $$0;
      this.a = ag.a($$0);
   }

   @Override
   public abstract fbd<? extends fbb> b();

   protected static <T extends fbb> P1<Mu<T>, List<fcx>> a(Instance<T> $$0) {
      return $$0.group(fcx.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final czk b(czk $$0, ezo $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract czk a(czk var1, ezo var2);

   @Override
   public void a(ezu $$0) {
      fbc.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static fbb.a<?> a(Function<List<fcx>, fbc> $$0) {
      return new fbb.b($$0);
   }

   public abstract static class a<T extends fbb.a<T>> implements fbc.a, fcp<T> {
      private final Builder<fcx> a = ImmutableList.builder();

      public T a(fcx.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<fcx> g() {
         return this.a.build();
      }
   }

   static final class b extends fbb.a<fbb.b> {
      private final Function<List<fcx>, fbc> a;

      public b(Function<List<fcx>, fbc> $$0) {
         this.a = $$0;
      }

      protected fbb.b a() {
         return this;
      }

      @Override
      public fbc b() {
         return this.a.apply(this.g());
      }
   }
}
