import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ego implements egp {
   protected final List<eib> g;
   private final Predicate<efc> a;

   protected ego(List<eib> $$0) {
      this.g = $$0;
      this.a = eid.a($$0);
   }

   protected static <T extends ego> P1<Mu<T>, List<eib>> a(Instance<T> $$0) {
      return $$0.group(asy.a(eid.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final clo b(clo $$0, efc $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract clo a(clo var1, efc var2);

   @Override
   public void a(efl $$0) {
      egp.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.b(".conditions[" + $$1 + "]"));
      }
   }

   protected static ego.a<?> a(Function<List<eib>, egp> $$0) {
      return new ego.b($$0);
   }

   public abstract static class a<T extends ego.a<T>> implements egp.a, ehu<T> {
      private final Builder<eib> a = ImmutableList.builder();

      public T a(eib.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<eib> g() {
         return this.a.build();
      }
   }

   static final class b extends ego.a<ego.b> {
      private final Function<List<eib>, egp> a;

      public b(Function<List<eib>, egp> $$0) {
         this.a = $$0;
      }

      protected ego.b a() {
         return this;
      }

      @Override
      public egp b() {
         return this.a.apply(this.g());
      }
   }
}
