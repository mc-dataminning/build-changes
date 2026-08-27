import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class efe implements eew {
   protected final List<ehk> e;
   private final Predicate<eel> a;

   protected efe(List<ehk> $$0) {
      this.e = $$0;
      this.a = ehm.a($$0);
   }

   protected static <T extends efe> P1<Mu<T>, List<ehk>> a(Instance<T> $$0) {
      return $$0.group(asq.a(ehm.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(eeu $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.b(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(eel $$0) {
      return this.a.test($$0);
   }

   public abstract eff a();

   public abstract static class a<T extends efe.a<T>> implements ehd<T> {
      private final Builder<ehk> a = ImmutableList.builder();

      protected abstract T aC_();

      public T a(ehk.a $$0) {
         this.a.add($$0.build());
         return this.aC_();
      }

      public final T e() {
         return this.aC_();
      }

      protected List<ehk> f() {
         return this.a.build();
      }

      public eev.a a(efe.a<?> $$0) {
         return new eev.a(this, $$0);
      }

      public efa.a b(efe.a<?> $$0) {
         return new efa.a(this, $$0);
      }

      public efi.a c(efe.a<?> $$0) {
         return new efi.a(this, $$0);
      }

      public abstract efe b();
   }
}
