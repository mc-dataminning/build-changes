import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class erw implements erx {
   protected final List<etu> g;
   private final Predicate<eqk> a;

   protected erw(List<etu> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   @Override
   public abstract ery<? extends erw> b();

   protected static <T extends erw> P1<Mu<T>, List<etu>> a(Instance<T> $$0) {
      return $$0.group(etw.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cur b(cur $$0, eqk $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cur a(cur var1, eqk var2);

   @Override
   public void a(eqq $$0) {
      erx.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static erw.a<?> a(Function<List<etu>, erx> $$0) {
      return new erw.b($$0);
   }

   public abstract static class a<T extends erw.a<T>> implements erx.a, etn<T> {
      private final Builder<etu> a = ImmutableList.builder();

      public T a(etu.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<etu> g() {
         return this.a.build();
      }
   }

   static final class b extends erw.a<erw.b> {
      private final Function<List<etu>, erx> a;

      public b(Function<List<etu>, erx> $$0) {
         this.a = $$0;
      }

      protected erw.b a() {
         return this;
      }

      @Override
      public erx b() {
         return this.a.apply(this.g());
      }
   }
}
