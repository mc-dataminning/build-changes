import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class esh implements erz {
   protected final List<evc> e;
   private final Predicate<err> a;

   protected esh(List<evc> $$0) {
      this.e = $$0;
      this.a = ad.a($$0);
   }

   protected static <T extends esh> P1<Mu<T>, List<evc>> a(Instance<T> $$0) {
      return $$0.group(evc.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(erx $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(err $$0) {
      return this.a.test($$0);
   }

   public abstract esi a();

   public abstract static class a<T extends esh.a<T>> implements euu<T> {
      private final Builder<evc> a = ImmutableList.builder();

      protected abstract T aH_();

      public T a(evc.a $$0) {
         this.a.add($$0.build());
         return this.aH_();
      }

      public final T e() {
         return this.aH_();
      }

      protected List<evc> f() {
         return this.a.build();
      }

      public ery.a a(esh.a<?> $$0) {
         return new ery.a(this, $$0);
      }

      public esd.a b(esh.a<?> $$0) {
         return new esd.a(this, $$0);
      }

      public esl.a c(esh.a<?> $$0) {
         return new esl.a(this, $$0);
      }

      public abstract esh b();
   }
}
