import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class eeb implements edt {
   protected final List<egh> e;
   private final Predicate<edi> a;

   protected eeb(List<egh> $$0) {
      this.e = $$0;
      this.a = egj.a($$0);
   }

   protected static <T extends eeb> P1<Mu<T>, List<egh>> a(Instance<T> $$0) {
      return $$0.group(asg.a(egj.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(edr $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(edi $$0) {
      return this.a.test($$0);
   }

   public abstract eec a();

   public abstract static class a<T extends eeb.a<T>> implements ega<T> {
      private final Builder<egh> a = ImmutableList.builder();

      protected abstract T aA_();

      public T a(egh.a $$0) {
         this.a.add($$0.build());
         return this.aA_();
      }

      public final T e() {
         return this.aA_();
      }

      protected List<egh> f() {
         return this.a.build();
      }

      public eds.a a(eeb.a<?> $$0) {
         return new eds.a(this, $$0);
      }

      public edx.a b(eeb.a<?> $$0) {
         return new edx.a(this, $$0);
      }

      public eef.a c(eeb.a<?> $$0) {
         return new eef.a(this, $$0);
      }

      public abstract eeb b();
   }
}
