import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewc extends evz {
   public static final MapCodec<ewc> a = a(ewc::new);

   ewc(List<ewg> $$0, List<eyz> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewh a() {
      return ewe.i;
   }

   @Override
   protected evy a(List<? extends evy> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (evy)$$0.get(0);
         case 2 -> {
            evy $$1 = $$0.get(0);
            evy $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (evy $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ewc.a a(ewg.a<?>... $$0) {
      return new ewc.a($$0);
   }

   public static class a extends ewg.a<ewc.a> {
      private final Builder<ewg> a = ImmutableList.builder();

      public a(ewg.a<?>... $$0) {
         for (ewg.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewc.a a() {
         return this;
      }

      @Override
      public ewc.a b(ewg.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewg b() {
         return new ewc(this.a.build(), this.f());
      }
   }
}
