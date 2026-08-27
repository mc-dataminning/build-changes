import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eda implements ecs {
   protected final List<efg> e;
   private final Predicate<ech> a;

   protected eda(List<efg> $$0) {
      this.e = $$0;
      this.a = efi.a($$0);
   }

   protected static <T extends eda> P1<Mu<T>, List<efg>> a(Instance<T> $$0) {
      return $$0.group(aqy.a(efi.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ecq $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ech $$0) {
      return this.a.test($$0);
   }

   public abstract edb a();

   public abstract static class a<T extends eda.a<T>> implements eez<T> {
      private final Builder<efg> a = ImmutableList.builder();

      protected abstract T at_();

      public T a(efg.a $$0) {
         this.a.add($$0.build());
         return this.at_();
      }

      public final T e() {
         return this.at_();
      }

      protected List<efg> f() {
         return this.a.build();
      }

      public ecr.a a(eda.a<?> $$0) {
         return new ecr.a(this, $$0);
      }

      public ecw.a b(eda.a<?> $$0) {
         return new ecw.a(this, $$0);
      }

      public ede.a c(eda.a<?> $$0) {
         return new ede.a(this, $$0);
      }

      public abstract eda b();
   }
}
