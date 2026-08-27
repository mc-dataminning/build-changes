import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class emg implements emh {
   protected final List<ent> g;
   private final Predicate<eku> a;

   protected emg(List<ent> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends emg> P1<Mu<T>, List<ent>> a(Instance<T> $$0) {
      return $$0.group(awe.a(env.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cqk b(cqk $$0, eku $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cqk a(cqk var1, eku var2);

   @Override
   public void a(eld $$0) {
      emh.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static emg.a<?> a(Function<List<ent>, emh> $$0) {
      return new emg.b($$0);
   }

   public abstract static class a<T extends emg.a<T>> implements emh.a, enm<T> {
      private final Builder<ent> a = ImmutableList.builder();

      public T a(ent.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ent> g() {
         return this.a.build();
      }
   }

   static final class b extends emg.a<emg.b> {
      private final Function<List<ent>, emh> a;

      public b(Function<List<ent>, emh> $$0) {
         this.a = $$0;
      }

      protected emg.b a() {
         return this;
      }

      @Override
      public emh b() {
         return this.a.apply(this.g());
      }
   }
}
