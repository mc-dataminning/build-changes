import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class exf implements ewx {
   protected final List<ezy> e;
   private final Predicate<ewp> a;

   protected exf(List<ezy> $$0) {
      this.e = $$0;
      this.a = ae.a($$0);
   }

   protected static <T extends exf> P1<Mu<T>, List<ezy>> a(Instance<T> $$0) {
      return $$0.group(ezy.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ewv $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ewp $$0) {
      return this.a.test($$0);
   }

   public abstract exg a();

   public abstract static class a<T extends exf.a<T>> implements ezq<T> {
      private final Builder<ezy> a = ImmutableList.builder();

      protected abstract T aF_();

      public T a(ezy.a $$0) {
         this.a.add($$0.build());
         return this.aF_();
      }

      public final T e() {
         return this.aF_();
      }

      protected List<ezy> f() {
         return this.a.build();
      }

      public eww.a a(exf.a<?> $$0) {
         return new eww.a(this, $$0);
      }

      public exb.a b(exf.a<?> $$0) {
         return new exb.a(this, $$0);
      }

      public exj.a c(exf.a<?> $$0) {
         return new exj.a(this, $$0);
      }

      public abstract exf b();
   }
}
