import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class egx implements egp {
   protected final List<ejd> e;
   private final Predicate<ege> a;

   protected egx(List<ejd> $$0) {
      this.e = $$0;
      this.a = ejf.a($$0);
   }

   protected static <T extends egx> P1<Mu<T>, List<ejd>> a(Instance<T> $$0) {
      return $$0.group(atg.a(ejf.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(egn $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ege $$0) {
      return this.a.test($$0);
   }

   public abstract egy a();

   public abstract static class a<T extends egx.a<T>> implements eiw<T> {
      private final Builder<ejd> a = ImmutableList.builder();

      protected abstract T aD_();

      public T a(ejd.a $$0) {
         this.a.add($$0.build());
         return this.aD_();
      }

      public final T e() {
         return this.aD_();
      }

      protected List<ejd> f() {
         return this.a.build();
      }

      public ego.a a(egx.a<?> $$0) {
         return new ego.a(this, $$0);
      }

      public egt.a b(egx.a<?> $$0) {
         return new egt.a(this, $$0);
      }

      public ehb.a c(egx.a<?> $$0) {
         return new ehb.a(this, $$0);
      }

      public abstract egx b();
   }
}
