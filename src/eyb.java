import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eyb implements eyc {
   protected final List<ezx> g;
   private final Predicate<ewo> a;

   protected eyb(List<ezx> $$0) {
      this.g = $$0;
      this.a = ae.a($$0);
   }

   @Override
   public abstract eyd<? extends eyb> b();

   protected static <T extends eyb> P1<Mu<T>, List<ezx>> a(Instance<T> $$0) {
      return $$0.group(ezx.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cxo b(cxo $$0, ewo $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cxo a(cxo var1, ewo var2);

   @Override
   public void a(ewu $$0) {
      eyc.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static eyb.a<?> a(Function<List<ezx>, eyc> $$0) {
      return new eyb.b($$0);
   }

   public abstract static class a<T extends eyb.a<T>> implements eyc.a, ezp<T> {
      private final Builder<ezx> a = ImmutableList.builder();

      public T a(ezx.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ezx> g() {
         return this.a.build();
      }
   }

   static final class b extends eyb.a<eyb.b> {
      private final Function<List<ezx>, eyc> a;

      public b(Function<List<ezx>, eyc> $$0) {
         this.a = $$0;
      }

      protected eyb.b a() {
         return this;
      }

      @Override
      public eyc b() {
         return this.a.apply(this.g());
      }
   }
}
