import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fau implements fav {
   protected final List<fcq> g;
   private final Predicate<ezh> a;

   protected fau(List<fcq> $$0) {
      this.g = $$0;
      this.a = af.a($$0);
   }

   @Override
   public abstract faw<? extends fau> b();

   protected static <T extends fau> P1<Mu<T>, List<fcq>> a(Instance<T> $$0) {
      return $$0.group(fcq.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final czd b(czd $$0, ezh $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract czd a(czd var1, ezh var2);

   @Override
   public void a(ezn $$0) {
      fav.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static fau.a<?> a(Function<List<fcq>, fav> $$0) {
      return new fau.b($$0);
   }

   public abstract static class a<T extends fau.a<T>> implements fav.a, fci<T> {
      private final Builder<fcq> a = ImmutableList.builder();

      public T a(fcq.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<fcq> g() {
         return this.a.build();
      }
   }

   static final class b extends fau.a<fau.b> {
      private final Function<List<fcq>, fav> a;

      public b(Function<List<fcq>, fav> $$0) {
         this.a = $$0;
      }

      protected fau.b a() {
         return this;
      }

      @Override
      public fav b() {
         return this.a.apply(this.g());
      }
   }
}
