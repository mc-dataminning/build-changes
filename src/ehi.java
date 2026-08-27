import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ehi implements eha {
   protected final List<ejo> e;
   private final Predicate<egp> a;

   protected ehi(List<ejo> $$0) {
      this.e = $$0;
      this.a = ejq.a($$0);
   }

   protected static <T extends ehi> P1<Mu<T>, List<ejo>> a(Instance<T> $$0) {
      return $$0.group(atq.a(ejq.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(egy $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(egp $$0) {
      return this.a.test($$0);
   }

   public abstract ehj a();

   public abstract static class a<T extends ehi.a<T>> implements ejh<T> {
      private final Builder<ejo> a = ImmutableList.builder();

      protected abstract T aD_();

      public T a(ejo.a $$0) {
         this.a.add($$0.build());
         return this.aD_();
      }

      public final T e() {
         return this.aD_();
      }

      protected List<ejo> f() {
         return this.a.build();
      }

      public egz.a a(ehi.a<?> $$0) {
         return new egz.a(this, $$0);
      }

      public ehe.a b(ehi.a<?> $$0) {
         return new ehe.a(this, $$0);
      }

      public ehm.a c(ehi.a<?> $$0) {
         return new ehm.a(this, $$0);
      }

      public abstract ehi b();
   }
}
