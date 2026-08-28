import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class fbj implements fbb {
   protected final List<fec> e;
   private final Predicate<fat> a;

   protected fbj(List<fec> $$0) {
      this.e = $$0;
      this.a = ag.a($$0);
   }

   protected static <T extends fbj> P1<Mu<T>, List<fec>> a(Instance<T> $$0) {
      return $$0.group(fec.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(faz $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(fat $$0) {
      return this.a.test($$0);
   }

   public abstract fbk a();

   public abstract static class a<T extends fbj.a<T>> implements fdu<T> {
      private final Builder<fec> a = ImmutableList.builder();

      protected abstract T aB_();

      public T a(fec.a $$0) {
         this.a.add($$0.build());
         return this.aB_();
      }

      public final T e() {
         return this.aB_();
      }

      protected List<fec> f() {
         return this.a.build();
      }

      public fba.a a(fbj.a<?> $$0) {
         return new fba.a(this, $$0);
      }

      public fbf.a b(fbj.a<?> $$0) {
         return new fbf.a(this, $$0);
      }

      public fbn.a c(fbj.a<?> $$0) {
         return new fbn.a(this, $$0);
      }

      public abstract fbj b();
   }
}
