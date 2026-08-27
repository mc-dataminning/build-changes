import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ekr implements ekj {
   protected final List<emx> e;
   private final Predicate<ejy> a;

   protected ekr(List<emx> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends ekr> P1<Mu<T>, List<emx>> a(Instance<T> $$0) {
      return $$0.group(avu.a(emz.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ekh $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ejy $$0) {
      return this.a.test($$0);
   }

   public abstract eks a();

   public abstract static class a<T extends ekr.a<T>> implements emq<T> {
      private final Builder<emx> a = ImmutableList.builder();

      protected abstract T aF_();

      public T a(emx.a $$0) {
         this.a.add($$0.build());
         return this.aF_();
      }

      public final T e() {
         return this.aF_();
      }

      protected List<emx> f() {
         return this.a.build();
      }

      public eki.a a(ekr.a<?> $$0) {
         return new eki.a(this, $$0);
      }

      public ekn.a b(ekr.a<?> $$0) {
         return new ekn.a(this, $$0);
      }

      public ekv.a c(ekr.a<?> $$0) {
         return new ekv.a(this, $$0);
      }

      public abstract ekr b();
   }
}
