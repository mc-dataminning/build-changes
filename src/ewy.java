import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ewy implements ewq {
   protected final List<ezr> e;
   private final Predicate<ewi> a;

   protected ewy(List<ezr> $$0) {
      this.e = $$0;
      this.a = ae.a($$0);
   }

   protected static <T extends ewy> P1<Mu<T>, List<ezr>> a(Instance<T> $$0) {
      return $$0.group(ezr.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ewo $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ewi $$0) {
      return this.a.test($$0);
   }

   public abstract ewz a();

   public abstract static class a<T extends ewy.a<T>> implements ezj<T> {
      private final Builder<ezr> a = ImmutableList.builder();

      protected abstract T aF_();

      public T a(ezr.a $$0) {
         this.a.add($$0.build());
         return this.aF_();
      }

      public final T e() {
         return this.aF_();
      }

      protected List<ezr> f() {
         return this.a.build();
      }

      public ewp.a a(ewy.a<?> $$0) {
         return new ewp.a(this, $$0);
      }

      public ewu.a b(ewy.a<?> $$0) {
         return new ewu.a(this, $$0);
      }

      public exc.a c(ewy.a<?> $$0) {
         return new exc.a(this, $$0);
      }

      public abstract ewy b();
   }
}
