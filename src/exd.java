import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class exd implements exe {
   protected final List<eyz> g;
   private final Predicate<evq> a;

   protected exd(List<eyz> $$0) {
      this.g = $$0;
      this.a = af.a($$0);
   }

   @Override
   public abstract exf<? extends exd> b();

   protected static <T extends exd> P1<Mu<T>, List<eyz>> a(Instance<T> $$0) {
      return $$0.group(eyz.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cwo b(cwo $$0, evq $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cwo a(cwo var1, evq var2);

   @Override
   public void a(evw $$0) {
      exe.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static exd.a<?> a(Function<List<eyz>, exe> $$0) {
      return new exd.b($$0);
   }

   public abstract static class a<T extends exd.a<T>> implements exe.a, eyr<T> {
      private final Builder<eyz> a = ImmutableList.builder();

      public T a(eyz.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<eyz> g() {
         return this.a.build();
      }
   }

   static final class b extends exd.a<exd.b> {
      private final Function<List<eyz>, exe> a;

      public b(Function<List<eyz>, exe> $$0) {
         this.a = $$0;
      }

      protected exd.b a() {
         return this;
      }

      @Override
      public exe b() {
         return this.a.apply(this.g());
      }
   }
}
