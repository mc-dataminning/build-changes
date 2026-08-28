import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fbg implements fbh {
   protected final List<fdc> g;
   private final Predicate<ezt> a;

   protected fbg(List<fdc> $$0) {
      this.g = $$0;
      this.a = ag.a($$0);
   }

   @Override
   public abstract fbi<? extends fbg> b();

   protected static <T extends fbg> P1<Mu<T>, List<fdc>> a(Instance<T> $$0) {
      return $$0.group(fdc.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final czn b(czn $$0, ezt $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract czn a(czn var1, ezt var2);

   @Override
   public void a(ezz $$0) {
      fbh.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static fbg.a<?> a(Function<List<fdc>, fbh> $$0) {
      return new fbg.b($$0);
   }

   public abstract static class a<T extends fbg.a<T>> implements fbh.a, fcu<T> {
      private final Builder<fdc> a = ImmutableList.builder();

      public T a(fdc.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<fdc> g() {
         return this.a.build();
      }
   }

   static final class b extends fbg.a<fbg.b> {
      private final Function<List<fdc>, fbh> a;

      public b(Function<List<fdc>, fbh> $$0) {
         this.a = $$0;
      }

      protected fbg.b a() {
         return this;
      }

      @Override
      public fbh b() {
         return this.a.apply(this.g());
      }
   }
}
