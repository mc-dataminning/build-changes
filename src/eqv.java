import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eqv extends eqs {
   public static final MapCodec<eqv> a = a(eqv::new);

   eqv(List<eqz> $$0, List<ett> $$1) {
      super($$0, $$1);
   }

   @Override
   public era a() {
      return eqx.i;
   }

   @Override
   protected eqr a(List<? extends eqr> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqr)$$0.get(0);
         case 2 -> {
            eqr $$1 = $$0.get(0);
            eqr $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eqr $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eqv.a a(eqz.a<?>... $$0) {
      return new eqv.a($$0);
   }

   public static class a extends eqz.a<eqv.a> {
      private final Builder<eqz> a = ImmutableList.builder();

      public a(eqz.a<?>... $$0) {
         for (eqz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqv.a a() {
         return this;
      }

      @Override
      public eqv.a b(eqz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqz b() {
         return new eqv(this.a.build(), this.f());
      }
   }
}
