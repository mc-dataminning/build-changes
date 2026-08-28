import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eqt implements eql {
   protected final List<etn> e;
   private final Predicate<eqd> a;

   protected eqt(List<etn> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends eqt> P1<Mu<T>, List<etn>> a(Instance<T> $$0) {
      return $$0.group(etp.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eqj $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eqd $$0) {
      return this.a.test($$0);
   }

   public abstract equ a();

   public abstract static class a<T extends eqt.a<T>> implements etg<T> {
      private final Builder<etn> a = ImmutableList.builder();

      protected abstract T aC_();

      public T a(etn.a $$0) {
         this.a.add($$0.build());
         return this.aC_();
      }

      public final T e() {
         return this.aC_();
      }

      protected List<etn> f() {
         return this.a.build();
      }

      public eqk.a a(eqt.a<?> $$0) {
         return new eqk.a(this, $$0);
      }

      public eqp.a b(eqt.a<?> $$0) {
         return new eqp.a(this, $$0);
      }

      public eqx.a c(eqt.a<?> $$0) {
         return new eqx.a(this, $$0);
      }

      public abstract eqt b();
   }
}
