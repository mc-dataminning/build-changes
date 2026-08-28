import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ezp implements ezh {
   protected final List<fci> e;
   private final Predicate<eyz> a;

   protected ezp(List<fci> $$0) {
      this.e = $$0;
      this.a = af.a($$0);
   }

   protected static <T extends ezp> P1<Mu<T>, List<fci>> a(Instance<T> $$0) {
      return $$0.group(fci.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ezf $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eyz $$0) {
      return this.a.test($$0);
   }

   public abstract ezq a();

   public abstract static class a<T extends ezp.a<T>> implements fca<T> {
      private final Builder<fci> a = ImmutableList.builder();

      protected abstract T aA_();

      public T a(fci.a $$0) {
         this.a.add($$0.build());
         return this.aA_();
      }

      public final T e() {
         return this.aA_();
      }

      protected List<fci> f() {
         return this.a.build();
      }

      public ezg.a a(ezp.a<?> $$0) {
         return new ezg.a(this, $$0);
      }

      public ezl.a b(ezp.a<?> $$0) {
         return new ezl.a(this, $$0);
      }

      public ezt.a c(ezp.a<?> $$0) {
         return new ezt.a(this, $$0);
      }

      public abstract ezp b();
   }
}
