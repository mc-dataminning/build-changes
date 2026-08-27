import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ejo implements ejg {
   protected final List<elu> e;
   private final Predicate<eiv> a;

   protected ejo(List<elu> $$0) {
      this.e = $$0;
      this.a = elw.a($$0);
   }

   protected static <T extends ejo> P1<Mu<T>, List<elu>> a(Instance<T> $$0) {
      return $$0.group(avp.a(elw.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eje $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eiv $$0) {
      return this.a.test($$0);
   }

   public abstract ejp a();

   public abstract static class a<T extends ejo.a<T>> implements eln<T> {
      private final Builder<elu> a = ImmutableList.builder();

      protected abstract T aG_();

      public T a(elu.a $$0) {
         this.a.add($$0.build());
         return this.aG_();
      }

      public final T e() {
         return this.aG_();
      }

      protected List<elu> f() {
         return this.a.build();
      }

      public ejf.a a(ejo.a<?> $$0) {
         return new ejf.a(this, $$0);
      }

      public ejk.a b(ejo.a<?> $$0) {
         return new ejk.a(this, $$0);
      }

      public ejs.a c(ejo.a<?> $$0) {
         return new ejs.a(this, $$0);
      }

      public abstract ejo b();
   }
}
