import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class fax implements fap {
   protected final List<fdq> e;
   private final Predicate<fah> a;

   protected fax(List<fdq> $$0) {
      this.e = $$0;
      this.a = ag.a($$0);
   }

   protected static <T extends fax> P1<Mu<T>, List<fdq>> a(Instance<T> $$0) {
      return $$0.group(fdq.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(fan $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(fah $$0) {
      return this.a.test($$0);
   }

   public abstract fay a();

   public abstract static class a<T extends fax.a<T>> implements fdi<T> {
      private final Builder<fdq> a = ImmutableList.builder();

      protected abstract T aF_();

      public T a(fdq.a $$0) {
         this.a.add($$0.build());
         return this.aF_();
      }

      public final T e() {
         return this.aF_();
      }

      protected List<fdq> f() {
         return this.a.build();
      }

      public fao.a a(fax.a<?> $$0) {
         return new fao.a(this, $$0);
      }

      public fat.a b(fax.a<?> $$0) {
         return new fat.a(this, $$0);
      }

      public fbb.a c(fax.a<?> $$0) {
         return new fbb.a(this, $$0);
      }

      public abstract fax b();
   }
}
