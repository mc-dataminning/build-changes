import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eot implements eol {
   protected final List<erh> e;
   private final Predicate<eoa> a;

   protected eot(List<erh> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eot> P1<Mu<T>, List<erh>> a(Instance<T> $$0) {
      return $$0.group(axe.a(erj.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eoj $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eoa $$0) {
      return this.a.test($$0);
   }

   public abstract eou a();

   public abstract static class a<T extends eot.a<T>> implements era<T> {
      private final Builder<erh> a = ImmutableList.builder();

      protected abstract T aB_();

      public T a(erh.a $$0) {
         this.a.add($$0.build());
         return this.aB_();
      }

      public final T e() {
         return this.aB_();
      }

      protected List<erh> f() {
         return this.a.build();
      }

      public eok.a a(eot.a<?> $$0) {
         return new eok.a(this, $$0);
      }

      public eop.a b(eot.a<?> $$0) {
         return new eop.a(this, $$0);
      }

      public eox.a c(eot.a<?> $$0) {
         return new eox.a(this, $$0);
      }

      public abstract eot b();
   }
}
