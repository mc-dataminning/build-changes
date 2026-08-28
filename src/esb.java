import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class esb implements esc {
   protected final List<etz> g;
   private final Predicate<eqo> a;

   protected esb(List<etz> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   @Override
   public abstract esd<? extends esb> b();

   protected static <T extends esb> P1<Mu<T>, List<etz>> a(Instance<T> $$0) {
      return $$0.group(etz.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cua b(cua $$0, eqo $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cua a(cua var1, eqo var2);

   @Override
   public void a(equ $$0) {
      esc.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static esb.a<?> a(Function<List<etz>, esc> $$0) {
      return new esb.b($$0);
   }

   public abstract static class a<T extends esb.a<T>> implements esc.a, etr<T> {
      private final Builder<etz> a = ImmutableList.builder();

      public T a(etz.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<etz> g() {
         return this.a.build();
      }
   }

   static final class b extends esb.a<esb.b> {
      private final Function<List<etz>, esc> a;

      public b(Function<List<etz>, esc> $$0) {
         this.a = $$0;
      }

      protected esb.b a() {
         return this;
      }

      @Override
      public esc b() {
         return this.a.apply(this.g());
      }
   }
}
