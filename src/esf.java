import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class esf implements erx {
   protected final List<euu> e;
   private final Predicate<erp> a;

   protected esf(List<euu> $$0) {
      this.e = $$0;
      this.a = ad.a($$0);
   }

   protected static <T extends esf> P1<Mu<T>, List<euu>> a(Instance<T> $$0) {
      return $$0.group(axu.a(euw.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
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

   public abstract static class a<T extends esf.a<T>> implements eun<T> {
      private final Builder<euu> a = ImmutableList.builder();

      protected abstract T aB_();

      public T a(euu.a $$0) {
         this.a.add($$0.build());
         return this.aB_();
      }

      public final T e() {
         return this.aB_();
      }

      protected List<euu> f() {
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
