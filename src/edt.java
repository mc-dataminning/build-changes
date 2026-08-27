import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class edt implements edu {
   protected final List<efg> g;
   private final Predicate<ech> a;

   protected edt(List<efg> $$0) {
      this.g = $$0;
      this.a = efi.a($$0);
   }

   protected static <T extends edt> P1<Mu<T>, List<efg>> a(Instance<T> $$0) {
      return $$0.group(aqy.a(efi.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final ciy b(ciy $$0, ech $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract ciy a(ciy var1, ech var2);

   @Override
   public void a(ecq $$0) {
      edu.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static edt.a<?> a(Function<List<efg>, edu> $$0) {
      return new edt.b($$0);
   }

   public abstract static class a<T extends edt.a<T>> implements edu.a, eez<T> {
      private final Builder<efg> a = ImmutableList.builder();

      public T a(efg.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<efg> g() {
         return this.a.build();
      }
   }

   static final class b extends edt.a<edt.b> {
      private final Function<List<efg>, edu> a;

      public b(Function<List<efg>, edu> $$0) {
         this.a = $$0;
      }

      protected edt.b a() {
         return this;
      }

      @Override
      public edu b() {
         return this.a.apply(this.g());
      }
   }
}
