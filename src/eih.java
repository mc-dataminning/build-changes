import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eih implements eii {
   protected final List<eju> g;
   private final Predicate<egv> a;

   protected eih(List<eju> $$0) {
      this.g = $$0;
      this.a = ejw.a($$0);
   }

   protected static <T extends eih> P1<Mu<T>, List<eju>> a(Instance<T> $$0) {
      return $$0.group(atv.a(ejw.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cmx b(cmx $$0, egv $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cmx a(cmx var1, egv var2);

   @Override
   public void a(ehe $$0) {
      eii.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eih.a<?> a(Function<List<eju>, eii> $$0) {
      return new eih.b($$0);
   }

   public abstract static class a<T extends eih.a<T>> implements eii.a, ejn<T> {
      private final Builder<eju> a = ImmutableList.builder();

      public T a(eju.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<eju> g() {
         return this.a.build();
      }
   }

   static final class b extends eih.a<eih.b> {
      private final Function<List<eju>, eii> a;

      public b(Function<List<eju>, eii> $$0) {
         this.a = $$0;
      }

      protected eih.b a() {
         return this;
      }

      @Override
      public eii b() {
         return this.a.apply(this.g());
      }
   }
}
