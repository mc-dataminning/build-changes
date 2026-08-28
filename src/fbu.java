import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fbu implements fbv {
   protected final List<fdq> g;
   private final Predicate<fah> a;

   protected fbu(List<fdq> $$0) {
      this.g = $$0;
      this.a = ag.a($$0);
   }

   @Override
   public abstract fbw<? extends fbu> b();

   protected static <T extends fbu> P1<Mu<T>, List<fdq>> a(Instance<T> $$0) {
      return $$0.group(fdq.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final czy b(czy $$0, fah $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract czy a(czy var1, fah var2);

   @Override
   public void a(fan $$0) {
      fbv.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static fbu.a<?> a(Function<List<fdq>, fbv> $$0) {
      return new fbu.b($$0);
   }

   public abstract static class a<T extends fbu.a<T>> implements fbv.a, fdi<T> {
      private final Builder<fdq> a = ImmutableList.builder();

      public T a(fdq.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<fdq> g() {
         return this.a.build();
      }
   }

   static final class b extends fbu.a<fbu.b> {
      private final Function<List<fdq>, fbv> a;

      public b(Function<List<fdq>, fbv> $$0) {
         this.a = $$0;
      }

      protected fbu.b a() {
         return this;
      }

      @Override
      public fbv b() {
         return this.a.apply(this.g());
      }
   }
}
