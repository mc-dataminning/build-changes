import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fcg implements fch {
   protected final List<fec> g;
   private final Predicate<fat> a;

   protected fcg(List<fec> $$0) {
      this.g = $$0;
      this.a = ag.a($$0);
   }

   @Override
   public abstract fci<? extends fcg> b();

   protected static <T extends fcg> P1<Mu<T>, List<fec>> a(Instance<T> $$0) {
      return $$0.group(fec.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final dak b(dak $$0, fat $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract dak a(dak var1, fat var2);

   @Override
   public void a(faz $$0) {
      fch.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static fcg.a<?> a(Function<List<fec>, fch> $$0) {
      return new fcg.b($$0);
   }

   public abstract static class a<T extends fcg.a<T>> implements fch.a, fdu<T> {
      private final Builder<fec> a = ImmutableList.builder();

      public T a(fec.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<fec> g() {
         return this.a.build();
      }
   }

   static final class b extends fcg.a<fcg.b> {
      private final Function<List<fec>, fch> a;

      public b(Function<List<fec>, fch> $$0) {
         this.a = $$0;
      }

      protected fcg.b a() {
         return this;
      }

      @Override
      public fch b() {
         return this.a.apply(this.g());
      }
   }
}
