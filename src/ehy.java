import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ehy implements ehq {
   protected final List<eke> e;
   private final Predicate<ehf> a;

   protected ehy(List<eke> $$0) {
      this.e = $$0;
      this.a = ekg.a($$0);
   }

   protected static <T extends ehy> P1<Mu<T>, List<eke>> a(Instance<T> $$0) {
      return $$0.group(atx.a(ekg.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eho $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ehf $$0) {
      return this.a.test($$0);
   }

   public abstract ehz a();

   public abstract static class a<T extends ehy.a<T>> implements ejx<T> {
      private final Builder<eke> a = ImmutableList.builder();

      protected abstract T aG_();

      public T a(eke.a $$0) {
         this.a.add($$0.build());
         return this.aG_();
      }

      public final T e() {
         return this.aG_();
      }

      protected List<eke> f() {
         return this.a.build();
      }

      public ehp.a a(ehy.a<?> $$0) {
         return new ehp.a(this, $$0);
      }

      public ehu.a b(ehy.a<?> $$0) {
         return new ehu.a(this, $$0);
      }

      public eic.a c(ehy.a<?> $$0) {
         return new eic.a(this, $$0);
      }

      public abstract ehy b();
   }
}
