import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eyc implements eyd {
   protected final List<ezy> g;
   private final Predicate<ewp> a;

   protected eyc(List<ezy> $$0) {
      this.g = $$0;
      this.a = ae.a($$0);
   }

   @Override
   public abstract eye<? extends eyc> b();

   protected static <T extends eyc> P1<Mu<T>, List<ezy>> a(Instance<T> $$0) {
      return $$0.group(ezy.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cxp b(cxp $$0, ewp $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cxp a(cxp var1, ewp var2);

   @Override
   public void a(ewv $$0) {
      eyd.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eyc.a<?> a(Function<List<ezy>, eyd> $$0) {
      return new eyc.b($$0);
   }

   public abstract static class a<T extends eyc.a<T>> implements eyd.a, ezq<T> {
      private final Builder<ezy> a = ImmutableList.builder();

      public T a(ezy.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ezy> g() {
         return this.a.build();
      }
   }

   static final class b extends eyc.a<eyc.b> {
      private final Function<List<ezy>, eyd> a;

      public b(Function<List<ezy>, eyd> $$0) {
         this.a = $$0;
      }

      protected eyc.b a() {
         return this;
      }

      @Override
      public eyd b() {
         return this.a.apply(this.g());
      }
   }
}
