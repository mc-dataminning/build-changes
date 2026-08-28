import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class erk implements erc {
   protected final List<euf> e;
   private final Predicate<equ> a;

   protected erk(List<euf> $$0) {
      this.e = $$0;
      this.a = ac.a($$0);
   }

   protected static <T extends erk> P1<Mu<T>, List<euf>> a(Instance<T> $$0) {
      return $$0.group(euf.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.e));
   }

   public void a(era $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         this.e.get($$1).a($$0.a(".condition[" + $$1 + "]"));
      }
   }

   protected final boolean a(equ $$0) {
      return this.a.test($$0);
   }

   public abstract erl a();

   public abstract static class a<T extends erk.a<T>> implements etx<T> {
      private final Builder<euf> a = ImmutableList.builder();

      protected abstract T aD_();

      public T a(euf.a $$0) {
         this.a.add($$0.build());
         return this.aD_();
      }

      public final T e() {
         return this.aD_();
      }

      protected List<euf> f() {
         return this.a.build();
      }

      public erb.a a(erk.a<?> $$0) {
         return new erb.a(this, $$0);
      }

      public erg.a b(erk.a<?> $$0) {
         return new erg.a(this, $$0);
      }

      public ero.a c(erk.a<?> $$0) {
         return new ero.a(this, $$0);
      }

      public abstract erk b();
   }
}
