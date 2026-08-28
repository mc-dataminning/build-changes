import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class equ extends eqr {
   public static final MapCodec<equ> a = a(equ::new);

   equ(List<eqy> $$0, List<ets> $$1) {
      super($$0, $$1);
   }

   @Override
   public eqz a() {
      return eqw.i;
   }

   @Override
   protected eqq a(List<? extends eqq> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqq)$$0.get(0);
         case 2 -> {
            eqq $$1 = $$0.get(0);
            eqq $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eqq $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static equ.a a(eqy.a<?>... $$0) {
      return new equ.a($$0);
   }

   public static class a extends eqy.a<equ.a> {
      private final Builder<eqy> a = ImmutableList.builder();

      public a(eqy.a<?>... $$0) {
         for (eqy.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected equ.a a() {
         return this;
      }

      @Override
      public equ.a b(eqy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqy b() {
         return new equ(this.a.build(), this.f());
      }
   }
}
