import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eqx extends eqm {
   public static final MapCodec<eqx> a = a(eqx::new);

   eqx(List<eqt> $$0, List<etn> $$1) {
      super($$0, $$1);
   }

   @Override
   public equ a() {
      return eqr.h;
   }

   @Override
   protected eql a(List<? extends eql> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eql)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eql $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eqx.a a(eqt.a<?>... $$0) {
      return new eqx.a($$0);
   }

   public static class a extends eqt.a<eqx.a> {
      private final Builder<eqt> a = ImmutableList.builder();

      public a(eqt.a<?>... $$0) {
         for (eqt.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqx.a a() {
         return this;
      }

      @Override
      public eqx.a c(eqt.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqt b() {
         return new eqx(this.a.build(), this.f());
      }
   }
}
