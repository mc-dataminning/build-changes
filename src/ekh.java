import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ekh implements eki {
   protected final List<elu> g;
   private final Predicate<eiv> a;

   protected ekh(List<elu> $$0) {
      this.g = $$0;
      this.a = elw.a($$0);
   }

   protected static <T extends ekh> P1<Mu<T>, List<elu>> a(Instance<T> $$0) {
      return $$0.group(avp.a(elw.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final coz b(coz $$0, eiv $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract coz a(coz var1, eiv var2);

   @Override
   public void a(eje $$0) {
      eki.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static ekh.a<?> a(Function<List<elu>, eki> $$0) {
      return new ekh.b($$0);
   }

   public abstract static class a<T extends ekh.a<T>> implements eki.a, eln<T> {
      private final Builder<elu> a = ImmutableList.builder();

      public T a(elu.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<elu> g() {
         return this.a.build();
      }
   }

   static final class b extends ekh.a<ekh.b> {
      private final Function<List<elu>, eki> a;

      public b(Function<List<elu>, eki> $$0) {
         this.a = $$0;
      }

      protected ekh.b a() {
         return this;
      }

      @Override
      public eki b() {
         return this.a.apply(this.g());
      }
   }
}
