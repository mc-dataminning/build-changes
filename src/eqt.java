import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eqt extends eqq {
   public static final MapCodec<eqt> a = a(eqt::new);

   eqt(List<eqx> $$0, List<etr> $$1) {
      super($$0, $$1);
   }

   @Override
   public eqy a() {
      return eqv.i;
   }

   @Override
   protected eqp a(List<? extends eqp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqp)$$0.get(0);
         case 2 -> {
            eqp $$1 = $$0.get(0);
            eqp $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eqp $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eqt.a a(eqx.a<?>... $$0) {
      return new eqt.a($$0);
   }

   public static class a extends eqx.a<eqt.a> {
      private final Builder<eqx> a = ImmutableList.builder();

      public a(eqx.a<?>... $$0) {
         for (eqx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqt.a a() {
         return this;
      }

      @Override
      public eqt.a b(eqx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqx b() {
         return new eqt(this.a.build(), this.f());
      }
   }
}
