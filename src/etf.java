import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class etf extends etc {
   public static final MapCodec<etf> a = a(etf::new);

   etf(List<etj> $$0, List<ewe> $$1) {
      super($$0, $$1);
   }

   @Override
   public etk a() {
      return eth.i;
   }

   @Override
   protected etb a(List<? extends etb> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (etb)$$0.get(0);
         case 2 -> {
            etb $$1 = $$0.get(0);
            etb $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (etb $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static etf.a a(etj.a<?>... $$0) {
      return new etf.a($$0);
   }

   public static class a extends etj.a<etf.a> {
      private final Builder<etj> a = ImmutableList.builder();

      public a(etj.a<?>... $$0) {
         for (etj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected etf.a a() {
         return this;
      }

      @Override
      public etf.a b(etj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public etj b() {
         return new etf(this.a.build(), this.f());
      }
   }
}
