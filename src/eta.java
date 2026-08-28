import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eta extends etc {
   public static final MapCodec<eta> a = a(eta::new);

   eta(List<etj> $$0, List<ewe> $$1) {
      super($$0, $$1);
   }

   @Override
   public etk a() {
      return eth.g;
   }

   @Override
   protected etb a(List<? extends etb> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (etb)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (etb $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(esz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eta.a a(etj.a<?>... $$0) {
      return new eta.a($$0);
   }

   public static <E> eta.a a(Collection<E> $$0, Function<E, etj.a<?>> $$1) {
      return new eta.a($$0.stream().map($$1::apply).toArray(etj.a[]::new));
   }

   public static class a extends etj.a<eta.a> {
      private final Builder<etj> a = ImmutableList.builder();

      public a(etj.a<?>... $$0) {
         for (etj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eta.a a() {
         return this;
      }

      @Override
      public eta.a a(etj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public etj b() {
         return new eta(this.a.build(), this.f());
      }
   }
}
