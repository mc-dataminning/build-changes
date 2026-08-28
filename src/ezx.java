import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ezx implements ezp {
   protected final List<fcq> e;
   private final Predicate<ezh> a;

   protected ezx(List<fcq> $$0) {
      this.e = $$0;
      this.a = af.a($$0);
   }

   protected static <T extends ezx> P1<Mu<T>, List<fcq>> a(Instance<T> $$0) {
      return $$0.group(fcq.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ezn $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ezh $$0) {
      return this.a.test($$0);
   }

   public abstract ezy a();

   public abstract static class a<T extends ezx.a<T>> implements fci<T> {
      private final Builder<fcq> a = ImmutableList.builder();

      protected abstract T aB_();

      public T a(fcq.a $$0) {
         this.a.add($$0.build());
         return this.aB_();
      }

      public final T e() {
         return this.aB_();
      }

      protected List<fcq> f() {
         return this.a.build();
      }

      public ezo.a a(ezx.a<?> $$0) {
         return new ezo.a(this, $$0);
      }

      public ezt.a b(ezx.a<?> $$0) {
         return new ezt.a(this, $$0);
      }

      public fab.a c(ezx.a<?> $$0) {
         return new fab.a(this, $$0);
      }

      public abstract ezx b();
   }
}
