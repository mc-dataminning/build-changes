import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class edl implements edd {
   protected final List<efr> e;
   private final Predicate<ecs> a;

   protected edl(List<efr> $$0) {
      this.e = $$0;
      this.a = eft.a($$0);
   }

   protected static <T extends edl> P1<Mu<T>, List<efr>> a(Instance<T> $$0) {
      return $$0.group(arh.a(eft.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(edb $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ecs $$0) {
      return this.a.test($$0);
   }

   public abstract edm a();

   public abstract static class a<T extends edl.a<T>> implements efk<T> {
      private final Builder<efr> a = ImmutableList.builder();

      protected abstract T ax_();

      public T a(efr.a $$0) {
         this.a.add($$0.build());
         return this.ax_();
      }

      public final T e() {
         return this.ax_();
      }

      protected List<efr> f() {
         return this.a.build();
      }

      public edc.a a(edl.a<?> $$0) {
         return new edc.a(this, $$0);
      }

      public edh.a b(edl.a<?> $$0) {
         return new edh.a(this, $$0);
      }

      public edp.a c(edl.a<?> $$0) {
         return new edp.a(this, $$0);
      }

      public abstract edl b();
   }
}
