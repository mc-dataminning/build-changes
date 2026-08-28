import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class exe implements exf {
   protected final List<eza> g;
   private final Predicate<evr> a;

   protected exe(List<eza> $$0) {
      this.g = $$0;
      this.a = af.a($$0);
   }

   @Override
   public abstract exg<? extends exe> b();

   protected static <T extends exe> P1<Mu<T>, List<eza>> a(Instance<T> $$0) {
      return $$0.group(eza.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cwp b(cwp $$0, evr $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cwp a(cwp var1, evr var2);

   @Override
   public void a(evx $$0) {
      exf.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static exe.a<?> a(Function<List<eza>, exf> $$0) {
      return new exe.b($$0);
   }

   public abstract static class a<T extends exe.a<T>> implements exf.a, eys<T> {
      private final Builder<eza> a = ImmutableList.builder();

      public T a(eza.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<eza> g() {
         return this.a.build();
      }
   }

   static final class b extends exe.a<exe.b> {
      private final Function<List<eza>, exf> a;

      public b(Function<List<eza>, exf> $$0) {
         this.a = $$0;
      }

      protected exe.b a() {
         return this;
      }

      @Override
      public exf b() {
         return this.a.apply(this.g());
      }
   }
}
