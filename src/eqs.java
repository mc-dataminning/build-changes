import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eqs extends eqp {
   public static final MapCodec<eqs> a = a(eqs::new);

   eqs(List<eqw> $$0, List<etq> $$1) {
      super($$0, $$1);
   }

   @Override
   public eqx a() {
      return equ.i;
   }

   @Override
   protected eqo a(List<? extends eqo> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqo)$$0.get(0);
         case 2 -> {
            eqo $$1 = $$0.get(0);
            eqo $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eqo $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eqs.a a(eqw.a<?>... $$0) {
      return new eqs.a($$0);
   }

   public static class a extends eqw.a<eqs.a> {
      private final Builder<eqw> a = ImmutableList.builder();

      public a(eqw.a<?>... $$0) {
         for (eqw.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqs.a a() {
         return this;
      }

      @Override
      public eqs.a b(eqw.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqw b() {
         return new eqs(this.a.build(), this.f());
      }
   }
}
