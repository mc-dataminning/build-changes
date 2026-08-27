import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class epx implements epp {
   protected final List<esn> e;
   private final Predicate<eph> a;

   protected epx(List<esn> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends epx> P1<Mu<T>, List<esn>> a(Instance<T> $$0) {
      return $$0.group(esp.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(epn $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eph $$0) {
      return this.a.test($$0);
   }

   public abstract epy a();

   public abstract static class a<T extends epx.a<T>> implements esg<T> {
      private final Builder<esn> a = ImmutableList.builder();

      protected abstract T aC_();

      public T a(esn.a $$0) {
         this.a.add($$0.build());
         return this.aC_();
      }

      public final T e() {
         return this.aC_();
      }

      protected List<esn> f() {
         return this.a.build();
      }

      public epo.a a(epx.a<?> $$0) {
         return new epo.a(this, $$0);
      }

      public ept.a b(epx.a<?> $$0) {
         return new ept.a(this, $$0);
      }

      public eqb.a c(epx.a<?> $$0) {
         return new eqb.a(this, $$0);
      }

      public abstract epx b();
   }
}
