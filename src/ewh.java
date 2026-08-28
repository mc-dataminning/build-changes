import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ewh implements evz {
   protected final List<eza> e;
   private final Predicate<evr> a;

   protected ewh(List<eza> $$0) {
      this.e = $$0;
      this.a = af.a($$0);
   }

   protected static <T extends ewh> P1<Mu<T>, List<eza>> a(Instance<T> $$0) {
      return $$0.group(eza.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(evx $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(evr $$0) {
      return this.a.test($$0);
   }

   public abstract ewi a();

   public abstract static class a<T extends ewh.a<T>> implements eys<T> {
      private final Builder<eza> a = ImmutableList.builder();

      protected abstract T aE_();

      public T a(eza.a $$0) {
         this.a.add($$0.build());
         return this.aE_();
      }

      public final T e() {
         return this.aE_();
      }

      protected List<eza> f() {
         return this.a.build();
      }

      public evy.a a(ewh.a<?> $$0) {
         return new evy.a(this, $$0);
      }

      public ewd.a b(ewh.a<?> $$0) {
         return new ewd.a(this, $$0);
      }

      public ewl.a c(ewh.a<?> $$0) {
         return new ewl.a(this, $$0);
      }

      public abstract ewh b();
   }
}
