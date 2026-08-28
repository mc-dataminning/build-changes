import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class exe implements eww {
   protected final List<ezx> e;
   private final Predicate<ewo> a;

   protected exe(List<ezx> $$0) {
      this.e = $$0;
      this.a = af.a($$0);
   }

   protected static <T extends exe> P1<Mu<T>, List<ezx>> a(Instance<T> $$0) {
      return $$0.group(ezx.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ewu $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ewo $$0) {
      return this.a.test($$0);
   }

   public abstract exf a();

   public abstract static class a<T extends exe.a<T>> implements ezp<T> {
      private final Builder<ezx> a = ImmutableList.builder();

      protected abstract T aE_();

      public T a(ezx.a $$0) {
         this.a.add($$0.build());
         return this.aE_();
      }

      public final T e() {
         return this.aE_();
      }

      protected List<ezx> f() {
         return this.a.build();
      }

      public ewv.a a(exe.a<?> $$0) {
         return new ewv.a(this, $$0);
      }

      public exa.a b(exe.a<?> $$0) {
         return new exa.a(this, $$0);
      }

      public exi.a c(exe.a<?> $$0) {
         return new exi.a(this, $$0);
      }

      public abstract exe b();
   }
}
