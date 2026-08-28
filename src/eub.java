import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eub extends etq {
   public static final MapCodec<eub> a = a(eub::new);

   eub(List<etx> $$0, List<ews> $$1) {
      super($$0, $$1);
   }

   @Override
   public ety a() {
      return etv.h;
   }

   @Override
   protected etp a(List<? extends etp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (etp)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (etp $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eub.a a(etx.a<?>... $$0) {
      return new eub.a($$0);
   }

   public static class a extends etx.a<eub.a> {
      private final Builder<etx> a = ImmutableList.builder();

      public a(etx.a<?>... $$0) {
         for (etx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eub.a a() {
         return this;
      }

      @Override
      public eub.a c(etx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public etx b() {
         return new eub(this.a.build(), this.f());
      }
   }
}
