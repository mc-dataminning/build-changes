import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class faz implements far {
   protected final List<fds> e;
   private final Predicate<faj> a;

   protected faz(List<fds> $$0) {
      this.e = $$0;
      this.a = ag.a($$0);
   }

   protected static <T extends faz> P1<Mu<T>, List<fds>> a(Instance<T> $$0) {
      return $$0.group(fds.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(fap $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(faj $$0) {
      return this.a.test($$0);
   }

   public abstract fba a();

   public abstract static class a<T extends faz.a<T>> implements fdk<T> {
      private final Builder<fds> a = ImmutableList.builder();

      protected abstract T aF_();

      public T a(fds.a $$0) {
         this.a.add($$0.build());
         return this.aF_();
      }

      public final T e() {
         return this.aF_();
      }

      protected List<fds> f() {
         return this.a.build();
      }

      public faq.a a(faz.a<?> $$0) {
         return new faq.a(this, $$0);
      }

      public fav.a b(faz.a<?> $$0) {
         return new fav.a(this, $$0);
      }

      public fbd.a c(faz.a<?> $$0) {
         return new fbd.a(this, $$0);
      }

      public abstract faz b();
   }
}
