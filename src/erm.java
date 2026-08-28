import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class erm implements ere {
   protected final List<euh> e;
   private final Predicate<eqw> a;

   protected erm(List<euh> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends erm> P1<Mu<T>, List<euh>> a(Instance<T> $$0) {
      return $$0.group(euh.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(erc $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eqw $$0) {
      return this.a.test($$0);
   }

   public abstract ern a();

   public abstract static class a<T extends erm.a<T>> implements etz<T> {
      private final Builder<euh> a = ImmutableList.builder();

      protected abstract T aD_();

      public T a(euh.a $$0) {
         this.a.add($$0.build());
         return this.aD_();
      }

      public final T e() {
         return this.aD_();
      }

      protected List<euh> f() {
         return this.a.build();
      }

      public erd.a a(erm.a<?> $$0) {
         return new erd.a(this, $$0);
      }

      public eri.a b(erm.a<?> $$0) {
         return new eri.a(this, $$0);
      }

      public erq.a c(erm.a<?> $$0) {
         return new erq.a(this, $$0);
      }

      public abstract erm b();
   }
}
