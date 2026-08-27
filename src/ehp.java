import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ehp implements ehh {
   protected final List<ejv> e;
   private final Predicate<egw> a;

   protected ehp(List<ejv> $$0) {
      this.e = $$0;
      this.a = ejx.a($$0);
   }

   protected static <T extends ehp> P1<Mu<T>, List<ejv>> a(Instance<T> $$0) {
      return $$0.group(atw.a(ejx.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ehf $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(egw $$0) {
      return this.a.test($$0);
   }

   public abstract ehq a();

   public abstract static class a<T extends ehp.a<T>> implements ejo<T> {
      private final Builder<ejv> a = ImmutableList.builder();

      protected abstract T aD_();

      public T a(ejv.a $$0) {
         this.a.add($$0.build());
         return this.aD_();
      }

      public final T e() {
         return this.aD_();
      }

      protected List<ejv> f() {
         return this.a.build();
      }

      public ehg.a a(ehp.a<?> $$0) {
         return new ehg.a(this, $$0);
      }

      public ehl.a b(ehp.a<?> $$0) {
         return new ehl.a(this, $$0);
      }

      public eht.a c(ehp.a<?> $$0) {
         return new eht.a(this, $$0);
      }

      public abstract ehp b();
   }
}
