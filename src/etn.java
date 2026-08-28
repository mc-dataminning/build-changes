import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class etn extends etc {
   public static final MapCodec<etn> a = a(etn::new);

   etn(List<etj> $$0, List<ewe> $$1) {
      super($$0, $$1);
   }

   @Override
   public etk a() {
      return eth.h;
   }

   @Override
   protected etb a(List<? extends etb> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (etb)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (etb $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static etn.a a(etj.a<?>... $$0) {
      return new etn.a($$0);
   }

   public static class a extends etj.a<etn.a> {
      private final Builder<etj> a = ImmutableList.builder();

      public a(etj.a<?>... $$0) {
         for (etj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected etn.a a() {
         return this;
      }

      @Override
      public etn.a c(etj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public etj b() {
         return new etn(this.a.build(), this.f());
      }
   }
}
