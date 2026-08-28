import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eqq extends eqs {
   public static final MapCodec<eqq> a = a(eqq::new);

   eqq(List<eqz> $$0, List<ett> $$1) {
      super($$0, $$1);
   }

   @Override
   public era a() {
      return eqx.g;
   }

   @Override
   protected eqr a(List<? extends eqr> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eqr)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqr $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eqp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eqq.a a(eqz.a<?>... $$0) {
      return new eqq.a($$0);
   }

   public static <E> eqq.a a(Collection<E> $$0, Function<E, eqz.a<?>> $$1) {
      return new eqq.a($$0.stream().map($$1::apply).toArray(eqz.a[]::new));
   }

   public static class a extends eqz.a<eqq.a> {
      private final Builder<eqz> a = ImmutableList.builder();

      public a(eqz.a<?>... $$0) {
         for (eqz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqq.a a() {
         return this;
      }

      @Override
      public eqq.a a(eqz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqz b() {
         return new eqq(this.a.build(), this.f());
      }
   }
}
