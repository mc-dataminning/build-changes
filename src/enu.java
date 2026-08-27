import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class enu implements enm {
   protected final List<eqc> e;
   private final Predicate<enb> a;

   protected enu(List<eqc> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends enu> P1<Mu<T>, List<eqc>> a(Instance<T> $$0) {
      return $$0.group(aws.a(eqe.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(enk $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(enb $$0) {
      return this.a.test($$0);
   }

   public abstract env a();

   public abstract static class a<T extends enu.a<T>> implements epv<T> {
      private final Builder<eqc> a = ImmutableList.builder();

      protected abstract T aC_();

      public T a(eqc.a $$0) {
         this.a.add($$0.build());
         return this.aC_();
      }

      public final T e() {
         return this.aC_();
      }

      protected List<eqc> f() {
         return this.a.build();
      }

      public enl.a a(enu.a<?> $$0) {
         return new enl.a(this, $$0);
      }

      public enq.a b(enu.a<?> $$0) {
         return new enq.a(this, $$0);
      }

      public eny.a c(enu.a<?> $$0) {
         return new eny.a(this, $$0);
      }

      public abstract enu b();
   }
}
