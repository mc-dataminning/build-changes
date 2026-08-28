import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class esf implements erx {
   protected final List<eva> e;
   private final Predicate<erp> a;

   protected esf(List<eva> $$0) {
      this.e = $$0;
      this.a = ad.a($$0);
   }

   protected static <T extends esf> P1<Mu<T>, List<eva>> a(Instance<T> $$0) {
      return $$0.group(eva.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(erv $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(erp $$0) {
      return this.a.test($$0);
   }

   public abstract esg a();

   public abstract static class a<T extends esf.a<T>> implements eus<T> {
      private final Builder<eva> a = ImmutableList.builder();

      protected abstract T aH_();

      public T a(eva.a $$0) {
         this.a.add($$0.build());
         return this.aH_();
      }

      public final T e() {
         return this.aH_();
      }

      protected List<eva> f() {
         return this.a.build();
      }

      public erw.a a(esf.a<?> $$0) {
         return new erw.a(this, $$0);
      }

      public esb.a b(esf.a<?> $$0) {
         return new esb.a(this, $$0);
      }

      public esj.a c(esf.a<?> $$0) {
         return new esj.a(this, $$0);
      }

      public abstract esf b();
   }
}
