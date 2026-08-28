import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eqp extends eqm {
   public static final MapCodec<eqp> a = a(eqp::new);

   eqp(List<eqt> $$0, List<etn> $$1) {
      super($$0, $$1);
   }

   @Override
   public equ a() {
      return eqr.i;
   }

   @Override
   protected eql a(List<? extends eql> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eql)$$0.get(0);
         case 2 -> {
            eql $$1 = $$0.get(0);
            eql $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eql $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eqp.a a(eqt.a<?>... $$0) {
      return new eqp.a($$0);
   }

   public static class a extends eqt.a<eqp.a> {
      private final Builder<eqt> a = ImmutableList.builder();

      public a(eqt.a<?>... $$0) {
         for (eqt.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqp.a a() {
         return this;
      }

      @Override
      public eqp.a b(eqt.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqt b() {
         return new eqp(this.a.build(), this.f());
      }
   }
}
