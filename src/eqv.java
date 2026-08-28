import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eqv extends eqx {
   public static final MapCodec<eqv> a = a(eqv::new);

   eqv(List<ere> $$0, List<etz> $$1) {
      super($$0, $$1);
   }

   @Override
   public erf a() {
      return erc.g;
   }

   @Override
   protected eqw a(List<? extends eqw> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eqw)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqw $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(equ $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eqv.a a(ere.a<?>... $$0) {
      return new eqv.a($$0);
   }

   public static <E> eqv.a a(Collection<E> $$0, Function<E, ere.a<?>> $$1) {
      return new eqv.a($$0.stream().map($$1::apply).toArray(ere.a[]::new));
   }

   public static class a extends ere.a<eqv.a> {
      private final Builder<ere> a = ImmutableList.builder();

      public a(ere.a<?>... $$0) {
         for (ere.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqv.a a() {
         return this;
      }

      @Override
      public eqv.a a(ere.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ere b() {
         return new eqv(this.a.build(), this.f());
      }
   }
}
