import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class exc implements exd {
   protected final List<eyy> g;
   private final Predicate<evp> a;

   protected exc(List<eyy> $$0) {
      this.g = $$0;
      this.a = af.a($$0);
   }

   @Override
   public abstract exe<? extends exc> b();

   protected static <T extends exc> P1<Mu<T>, List<eyy>> a(Instance<T> $$0) {
      return $$0.group(eyy.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cwn b(cwn $$0, evp $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cwn a(cwn var1, evp var2);

   @Override
   public void a(evv $$0) {
      exd.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static exc.a<?> a(Function<List<eyy>, exd> $$0) {
      return new exc.b($$0);
   }

   public abstract static class a<T extends exc.a<T>> implements exd.a, eyq<T> {
      private final Builder<eyy> a = ImmutableList.builder();

      public T a(eyy.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<eyy> g() {
         return this.a.build();
      }
   }

   static final class b extends exc.a<exc.b> {
      private final Function<List<eyy>, exd> a;

      public b(Function<List<eyy>, exd> $$0) {
         this.a = $$0;
      }

      protected exc.b a() {
         return this;
      }

      @Override
      public exd b() {
         return this.a.apply(this.g());
      }
   }
}
