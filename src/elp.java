import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class elp implements elh {
   protected final List<env> e;
   private final Predicate<ekw> a;

   protected elp(List<env> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends elp> P1<Mu<T>, List<env>> a(Instance<T> $$0) {
      return $$0.group(awe.a(enx.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(elf $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ekw $$0) {
      return this.a.test($$0);
   }

   public abstract elq a();

   public abstract static class a<T extends elp.a<T>> implements eno<T> {
      private final Builder<env> a = ImmutableList.builder();

      protected abstract T aE_();

      public T a(env.a $$0) {
         this.a.add($$0.build());
         return this.aE_();
      }

      public final T e() {
         return this.aE_();
      }

      protected List<env> f() {
         return this.a.build();
      }

      public elg.a a(elp.a<?> $$0) {
         return new elg.a(this, $$0);
      }

      public ell.a b(elp.a<?> $$0) {
         return new ell.a(this, $$0);
      }

      public elt.a c(elp.a<?> $$0) {
         return new elt.a(this, $$0);
      }

      public abstract elp b();
   }
}
