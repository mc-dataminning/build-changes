import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class efm extends efo {
   public static final Codec<efm> a = a(efm::new);

   efm(List<efv> $$0, List<eib> $$1) {
      super($$0, $$1);
   }

   @Override
   public efw a() {
      return eft.g;
   }

   @Override
   protected efn a(List<? extends efn> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (efn)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (efn $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(efl $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.a("Unreachable entry!");
         }
      }
   }

   public static efm.a a(efv.a<?>... $$0) {
      return new efm.a($$0);
   }

   public static <E> efm.a a(Collection<E> $$0, Function<E, efv.a<?>> $$1) {
      return new efm.a($$0.stream().map($$1::apply).toArray(efv.a[]::new));
   }

   public static class a extends efv.a<efm.a> {
      private final Builder<efv> a = ImmutableList.builder();

      public a(efv.a<?>... $$0) {
         for (efv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected efm.a a() {
         return this;
      }

      @Override
      public efm.a a(efv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public efv b() {
         return new efm(this.a.build(), this.f());
      }
   }
}
