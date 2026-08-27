import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eod implements env {
   protected final List<eql> e;
   private final Predicate<enk> a;

   protected eod(List<eql> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eod> P1<Mu<T>, List<eql>> a(Instance<T> $$0) {
      return $$0.group(awu.a(eqn.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ent $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(enk $$0) {
      return this.a.test($$0);
   }

   public abstract eoe a();

   public abstract static class a<T extends eod.a<T>> implements eqe<T> {
      private final Builder<eql> a = ImmutableList.builder();

      protected abstract T aB_();

      public T a(eql.a $$0) {
         this.a.add($$0.build());
         return this.aB_();
      }

      public final T e() {
         return this.aB_();
      }

      protected List<eql> f() {
         return this.a.build();
      }

      public enu.a a(eod.a<?> $$0) {
         return new enu.a(this, $$0);
      }

      public enz.a b(eod.a<?> $$0) {
         return new enz.a(this, $$0);
      }

      public eoh.a c(eod.a<?> $$0) {
         return new eoh.a(this, $$0);
      }

      public abstract eod b();
   }
}
