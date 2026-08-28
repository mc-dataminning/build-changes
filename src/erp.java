import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class erp implements erq {
   protected final List<etn> g;
   private final Predicate<eqd> a;

   protected erp(List<etn> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   @Override
   public abstract err<? extends erp> b();

   protected static <T extends erp> P1<Mu<T>, List<etn>> a(Instance<T> $$0) {
      return $$0.group(etp.a.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cuk b(cuk $$0, eqd $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cuk a(cuk var1, eqd var2);

   @Override
   public void a(eqj $$0) {
      erq.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static erp.a<?> a(Function<List<etn>, erq> $$0) {
      return new erp.b($$0);
   }

   public abstract static class a<T extends erp.a<T>> implements erq.a, etg<T> {
      private final Builder<etn> a = ImmutableList.builder();

      public T a(etn.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<etn> g() {
         return this.a.build();
      }
   }

   static final class b extends erp.a<erp.b> {
      private final Function<List<etn>, erq> a;

      public b(Function<List<etn>, erq> $$0) {
         this.a = $$0;
      }

      protected erp.b a() {
         return this;
      }

      @Override
      public erq b() {
         return this.a.apply(this.g());
      }
   }
}
