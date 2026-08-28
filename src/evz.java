import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class evz extends ewb {
   public static final MapCodec<evz> a = a(evz::new);

   evz(List<ewi> $$0, List<ezb> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewj a() {
      return ewg.g;
   }

   @Override
   protected ewa a(List<? extends ewa> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ewa)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ewa $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(evy $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static evz.a a(ewi.a<?>... $$0) {
      return new evz.a($$0);
   }

   public static <E> evz.a a(Collection<E> $$0, Function<E, ewi.a<?>> $$1) {
      return new evz.a($$0.stream().map($$1::apply).toArray(ewi.a[]::new));
   }

   public static class a extends ewi.a<evz.a> {
      private final Builder<ewi> a = ImmutableList.builder();

      public a(ewi.a<?>... $$0) {
         for (ewi.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected evz.a a() {
         return this;
      }

      @Override
      public evz.a a(ewi.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewi b() {
         return new evz(this.a.build(), this.f());
      }
   }
}
