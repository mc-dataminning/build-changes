import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class euu implements euv {
   protected final List<ews> g;
   private final Predicate<eth> a;

   protected euu(List<ews> $$0) {
      this.g = $$0;
      this.a = ad.a($$0);
   }

   @Override
   public abstract euw<? extends euu> b();

   protected static <T extends euu> P1<Mu<T>, List<ews>> a(Instance<T> $$0) {
      return $$0.group(ews.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cvp b(cvp $$0, eth $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cvp a(cvp var1, eth var2);

   @Override
   public void a(etn $$0) {
      euv.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static euu.a<?> a(Function<List<ews>, euv> $$0) {
      return new euu.b($$0);
   }

   public abstract static class a<T extends euu.a<T>> implements euv.a, ewk<T> {
      private final Builder<ews> a = ImmutableList.builder();

      public T a(ews.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ews> g() {
         return this.a.build();
      }
   }

   static final class b extends euu.a<euu.b> {
      private final Function<List<ews>, euv> a;

      public b(Function<List<ews>, euv> $$0) {
         this.a = $$0;
      }

      protected euu.b a() {
         return this;
      }

      @Override
      public euv b() {
         return this.a.apply(this.g());
      }
   }
}
