import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class evh extends euw {
   public static final MapCodec<evh> a = a(evh::new);

   evh(List<evd> $$0, List<exy> $$1) {
      super($$0, $$1);
   }

   @Override
   public eve a() {
      return evb.h;
   }

   @Override
   protected euv a(List<? extends euv> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (euv)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (euv $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static evh.a a(evd.a<?>... $$0) {
      return new evh.a($$0);
   }

   public static class a extends evd.a<evh.a> {
      private final Builder<evd> a = ImmutableList.builder();

      public a(evd.a<?>... $$0) {
         for (evd.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected evh.a a() {
         return this;
      }

      @Override
      public evh.a c(evd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public evd b() {
         return new evh(this.a.build(), this.f());
      }
   }
}
