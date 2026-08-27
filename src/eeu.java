import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eeu implements eev {
   protected final List<egh> g;
   private final Predicate<edi> a;

   protected eeu(List<egh> $$0) {
      this.g = $$0;
      this.a = egj.a($$0);
   }

   protected static <T extends eeu> P1<Mu<T>, List<egh>> a(Instance<T> $$0) {
      return $$0.group(asg.a(egj.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final ckj b(ckj $$0, edi $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract ckj a(ckj var1, edi var2);

   @Override
   public void a(edr $$0) {
      eev.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static eeu.a<?> a(Function<List<egh>, eev> $$0) {
      return new eeu.b($$0);
   }

   public abstract static class a<T extends eeu.a<T>> implements eev.a, ega<T> {
      private final Builder<egh> a = ImmutableList.builder();

      public T a(egh.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<egh> g() {
         return this.a.build();
      }
   }

   static final class b extends eeu.a<eeu.b> {
      private final Function<List<egh>, eev> a;

      public b(Function<List<egh>, eev> $$0) {
         this.a = $$0;
      }

      protected eeu.b a() {
         return this;
      }

      @Override
      public eev b() {
         return this.a.apply(this.g());
      }
   }
}
