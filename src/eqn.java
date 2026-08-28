import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eqn extends eqp {
   public static final MapCodec<eqn> a = a(eqn::new);

   eqn(List<eqw> $$0, List<etq> $$1) {
      super($$0, $$1);
   }

   @Override
   public eqx a() {
      return equ.g;
   }

   @Override
   protected eqo a(List<? extends eqo> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eqo)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqo $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eqm $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eqn.a a(eqw.a<?>... $$0) {
      return new eqn.a($$0);
   }

   public static <E> eqn.a a(Collection<E> $$0, Function<E, eqw.a<?>> $$1) {
      return new eqn.a($$0.stream().map($$1::apply).toArray(eqw.a[]::new));
   }

   public static class a extends eqw.a<eqn.a> {
      private final Builder<eqw> a = ImmutableList.builder();

      public a(eqw.a<?>... $$0) {
         for (eqw.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqn.a a() {
         return this;
      }

      @Override
      public eqn.a a(eqw.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqw b() {
         return new eqn(this.a.build(), this.f());
      }
   }
}
