import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eub implements ett {
   protected final List<eww> e;
   private final Predicate<etl> a;

   protected eub(List<eww> $$0) {
      this.e = $$0;
      this.a = ad.a($$0);
   }

   protected static <T extends eub> P1<Mu<T>, List<eww>> a(Instance<T> $$0) {
      return $$0.group(eww.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(etr $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(etl $$0) {
      return this.a.test($$0);
   }

   public abstract euc a();

   public abstract static class a<T extends eub.a<T>> implements ewo<T> {
      private final Builder<eww> a = ImmutableList.builder();

      protected abstract T aG_();

      public T a(eww.a $$0) {
         this.a.add($$0.build());
         return this.aG_();
      }

      public final T e() {
         return this.aG_();
      }

      protected List<eww> f() {
         return this.a.build();
      }

      public ets.a a(eub.a<?> $$0) {
         return new ets.a(this, $$0);
      }

      public etx.a b(eub.a<?> $$0) {
         return new etx.a(this, $$0);
      }

      public euf.a c(eub.a<?> $$0) {
         return new euf.a(this, $$0);
      }

      public abstract eub b();
   }
}
