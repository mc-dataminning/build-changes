import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class esb implements ert {
   protected final List<euw> e;
   private final Predicate<erl> a;

   protected esb(List<euw> $$0) {
      this.e = $$0;
      this.a = ad.a($$0);
   }

   protected static <T extends esb> P1<Mu<T>, List<euw>> a(Instance<T> $$0) {
      return $$0.group(euw.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(err $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(erl $$0) {
      return this.a.test($$0);
   }

   public abstract esc a();

   public abstract static class a<T extends esb.a<T>> implements euo<T> {
      private final Builder<euw> a = ImmutableList.builder();

      protected abstract T aD_();

      public T a(euw.a $$0) {
         this.a.add($$0.build());
         return this.aD_();
      }

      public final T e() {
         return this.aD_();
      }

      protected List<euw> f() {
         return this.a.build();
      }

      public ers.a a(esb.a<?> $$0) {
         return new ers.a(this, $$0);
      }

      public erx.a b(esb.a<?> $$0) {
         return new erx.a(this, $$0);
      }

      public esf.a c(esb.a<?> $$0) {
         return new esf.a(this, $$0);
      }

      public abstract esb b();
   }
}
