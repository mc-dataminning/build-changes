import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewk extends evz {
   public static final MapCodec<ewk> a = a(ewk::new);

   ewk(List<ewg> $$0, List<eyz> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewh a() {
      return ewe.h;
   }

   @Override
   protected evy a(List<? extends evy> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (evy)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (evy $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ewk.a a(ewg.a<?>... $$0) {
      return new ewk.a($$0);
   }

   public static class a extends ewg.a<ewk.a> {
      private final Builder<ewg> a = ImmutableList.builder();

      public a(ewg.a<?>... $$0) {
         for (ewg.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewk.a a() {
         return this;
      }

      @Override
      public ewk.a c(ewg.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewg b() {
         return new ewk(this.a.build(), this.f());
      }
   }
}
