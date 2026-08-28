import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ert implements eru {
   protected final List<etr> g;
   private final Predicate<eqh> a;

   protected ert(List<etr> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   @Override
   public abstract erv<? extends ert> b();

   protected static <T extends ert> P1<Mu<T>, List<etr>> a(Instance<T> $$0) {
      return $$0.group(ett.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cuo b(cuo $$0, eqh $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cuo a(cuo var1, eqh var2);

   @Override
   public void a(eqn $$0) {
      eru.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static ert.a<?> a(Function<List<etr>, eru> $$0) {
      return new ert.b($$0);
   }

   public abstract static class a<T extends ert.a<T>> implements eru.a, etk<T> {
      private final Builder<etr> a = ImmutableList.builder();

      public T a(etr.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<etr> g() {
         return this.a.build();
      }
   }

   static final class b extends ert.a<ert.b> {
      private final Function<List<etr>, eru> a;

      public b(Function<List<etr>, eru> $$0) {
         this.a = $$0;
      }

      protected ert.b a() {
         return this;
      }

      @Override
      public eru b() {
         return this.a.apply(this.g());
      }
   }
}
