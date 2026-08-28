import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eqp extends eqr {
   public static final MapCodec<eqp> a = a(eqp::new);

   eqp(List<eqy> $$0, List<ets> $$1) {
      super($$0, $$1);
   }

   @Override
   public eqz a() {
      return eqw.g;
   }

   @Override
   protected eqq a(List<? extends eqq> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eqq)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqq $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eqo $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eqp.a a(eqy.a<?>... $$0) {
      return new eqp.a($$0);
   }

   public static <E> eqp.a a(Collection<E> $$0, Function<E, eqy.a<?>> $$1) {
      return new eqp.a($$0.stream().map($$1::apply).toArray(eqy.a[]::new));
   }

   public static class a extends eqy.a<eqp.a> {
      private final Builder<eqy> a = ImmutableList.builder();

      public a(eqy.a<?>... $$0) {
         for (eqy.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqp.a a() {
         return this;
      }

      @Override
      public eqp.a a(eqy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqy b() {
         return new eqp(this.a.build(), this.f());
      }
   }
}
