import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eee implements eef {
   protected final List<efr> g;
   private final Predicate<ecs> a;

   protected eee(List<efr> $$0) {
      this.g = $$0;
      this.a = eft.a($$0);
   }

   protected static <T extends eee> P1<Mu<T>, List<efr>> a(Instance<T> $$0) {
      return $$0.group(arh.a(eft.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cjh b(cjh $$0, ecs $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cjh a(cjh var1, ecs var2);

   @Override
   public void a(edb $$0) {
      eef.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static eee.a<?> a(Function<List<efr>, eef> $$0) {
      return new eee.b($$0);
   }

   public abstract static class a<T extends eee.a<T>> implements eef.a, efk<T> {
      private final Builder<efr> a = ImmutableList.builder();

      public T a(efr.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<efr> g() {
         return this.a.build();
      }
   }

   static final class b extends eee.a<eee.b> {
      private final Function<List<efr>, eef> a;

      public b(Function<List<efr>, eef> $$0) {
         this.a = $$0;
      }

      protected eee.b a() {
         return this;
      }

      @Override
      public eef b() {
         return this.a.apply(this.g());
      }
   }
}
