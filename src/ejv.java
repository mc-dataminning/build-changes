import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class ejv implements ejn {
   protected final List<emb> e;
   private final Predicate<ejc> a;

   protected ejv(List<emb> $$0) {
      this.e = $$0;
      this.a = emd.a($$0);
   }

   protected static <T extends ejv> P1<Mu<T>, List<emb>> a(Instance<T> $$0) {
      return $$0.group(avq.a(emd.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(ejl $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(ejc $$0) {
      return this.a.test($$0);
   }

   public abstract ejw a();

   public abstract static class a<T extends ejv.a<T>> implements elu<T> {
      private final Builder<emb> a = ImmutableList.builder();

      protected abstract T aG_();

      public T a(emb.a $$0) {
         this.a.add($$0.build());
         return this.aG_();
      }

      public final T e() {
         return this.aG_();
      }

      protected List<emb> f() {
         return this.a.build();
      }

      public ejm.a a(ejv.a<?> $$0) {
         return new ejm.a(this, $$0);
      }

      public ejr.a b(ejv.a<?> $$0) {
         return new ejr.a(this, $$0);
      }

      public ejz.a c(ejv.a<?> $$0) {
         return new ejz.a(this, $$0);
      }

      public abstract ejv b();
   }
}
