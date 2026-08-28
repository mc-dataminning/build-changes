import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class evx extends evz {
   public static final MapCodec<evx> a = a(evx::new);

   evx(List<ewg> $$0, List<eyz> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewh a() {
      return ewe.g;
   }

   @Override
   protected evy a(List<? extends evy> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (evy)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (evy $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(evw $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static evx.a a(ewg.a<?>... $$0) {
      return new evx.a($$0);
   }

   public static <E> evx.a a(Collection<E> $$0, Function<E, ewg.a<?>> $$1) {
      return new evx.a($$0.stream().map($$1::apply).toArray(ewg.a[]::new));
   }

   public static class a extends ewg.a<evx.a> {
      private final Builder<ewg> a = ImmutableList.builder();

      public a(ewg.a<?>... $$0) {
         for (ewg.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected evx.a a() {
         return this;
      }

      @Override
      public evx.a a(ewg.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewg b() {
         return new evx(this.a.build(), this.f());
      }
   }
}
