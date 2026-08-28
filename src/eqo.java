import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eqo extends eqq {
   public static final MapCodec<eqo> a = a(eqo::new);

   eqo(List<eqx> $$0, List<etr> $$1) {
      super($$0, $$1);
   }

   @Override
   public eqy a() {
      return eqv.g;
   }

   @Override
   protected eqp a(List<? extends eqp> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eqp)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqp $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eqn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eqo.a a(eqx.a<?>... $$0) {
      return new eqo.a($$0);
   }

   public static <E> eqo.a a(Collection<E> $$0, Function<E, eqx.a<?>> $$1) {
      return new eqo.a($$0.stream().map($$1::apply).toArray(eqx.a[]::new));
   }

   public static class a extends eqx.a<eqo.a> {
      private final Builder<eqx> a = ImmutableList.builder();

      public a(eqx.a<?>... $$0) {
         for (eqx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqo.a a() {
         return this;
      }

      @Override
      public eqo.a a(eqx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqx b() {
         return new eqo(this.a.build(), this.f());
      }
   }
}
