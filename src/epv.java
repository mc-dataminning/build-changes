import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class epv implements epn {
   protected final List<esl> e;
   private final Predicate<epf> a;

   protected epv(List<esl> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends epv> P1<Mu<T>, List<esl>> a(Instance<T> $$0) {
      return $$0.group(esn.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(epl $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(epf $$0) {
      return this.a.test($$0);
   }

   public abstract epw a();

   public abstract static class a<T extends epv.a<T>> implements ese<T> {
      private final Builder<esl> a = ImmutableList.builder();

      protected abstract T aB_();

      public T a(esl.a $$0) {
         this.a.add($$0.build());
         return this.aB_();
      }

      public final T e() {
         return this.aB_();
      }

      protected List<esl> f() {
         return this.a.build();
      }

      public epm.a a(epv.a<?> $$0) {
         return new epm.a(this, $$0);
      }

      public epr.a b(epv.a<?> $$0) {
         return new epr.a(this, $$0);
      }

      public epz.a c(epv.a<?> $$0) {
         return new epz.a(this, $$0);
      }

      public abstract epv b();
   }
}
