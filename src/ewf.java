import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ewf implements evx {
   protected final List<eyy> e;
   private final Predicate<evp> a;

   protected ewf(List<eyy> $$0) {
      this.e = $$0;
      this.a = af.a($$0);
   }

   protected static <T extends ewf> P1<Mu<T>, List<eyy>> a(Instance<T> $$0) {
      return $$0.group(eyy.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(evv $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(evp $$0) {
      return this.a.test($$0);
   }

   public abstract ewg a();

   public abstract static class a<T extends ewf.a<T>> implements eyq<T> {
      private final Builder<eyy> a = ImmutableList.builder();

      protected abstract T aE_();

      public T a(eyy.a $$0) {
         this.a.add($$0.build());
         return this.aE_();
      }

      public final T e() {
         return this.aE_();
      }

      protected List<eyy> f() {
         return this.a.build();
      }

      public evw.a a(ewf.a<?> $$0) {
         return new evw.a(this, $$0);
      }

      public ewb.a b(ewf.a<?> $$0) {
         return new ewb.a(this, $$0);
      }

      public ewj.a c(ewf.a<?> $$0) {
         return new ewj.a(this, $$0);
      }

      public abstract ewf b();
   }
}
