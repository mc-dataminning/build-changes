import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eho implements ehg {
   protected final List<eju> e;
   private final Predicate<egv> a;

   protected eho(List<eju> $$0) {
      this.e = $$0;
      this.a = ejw.a($$0);
   }

   protected static <T extends eho> P1<Mu<T>, List<eju>> a(Instance<T> $$0) {
      return $$0.group(atv.a(ejw.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ehe $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(egv $$0) {
      return this.a.test($$0);
   }

   public abstract ehp a();

   public abstract static class a<T extends eho.a<T>> implements ejn<T> {
      private final Builder<eju> a = ImmutableList.builder();

      protected abstract T aD_();

      public T a(eju.a $$0) {
         this.a.add($$0.build());
         return this.aD_();
      }

      public final T e() {
         return this.aD_();
      }

      protected List<eju> f() {
         return this.a.build();
      }

      public ehf.a a(eho.a<?> $$0) {
         return new ehf.a(this, $$0);
      }

      public ehk.a b(eho.a<?> $$0) {
         return new ehk.a(this, $$0);
      }

      public ehs.a c(eho.a<?> $$0) {
         return new ehs.a(this, $$0);
      }

      public abstract eho b();
   }
}
