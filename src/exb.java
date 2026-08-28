import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class exb extends ewq {
   public static final MapCodec<exb> a = a(exb::new);

   exb(List<ewx> $$0, List<ezs> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewy a() {
      return ewv.h;
   }

   @Override
   protected ewp a(List<? extends ewp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ewp)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ewp $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static exb.a a(ewx.a<?>... $$0) {
      return new exb.a($$0);
   }

   public static class a extends ewx.a<exb.a> {
      private final Builder<ewx> a = ImmutableList.builder();

      public a(ewx.a<?>... $$0) {
         for (ewx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected exb.a a() {
         return this;
      }

      @Override
      public exb.a c(ewx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewx b() {
         return new exb(this.a.build(), this.f());
      }
   }
}
