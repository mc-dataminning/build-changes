import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class euz extends euw {
   public static final MapCodec<euz> a = a(euz::new);

   euz(List<evd> $$0, List<exy> $$1) {
      super($$0, $$1);
   }

   @Override
   public eve a() {
      return evb.i;
   }

   @Override
   protected euv a(List<? extends euv> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (euv)$$0.get(0);
         case 2 -> {
            euv $$1 = $$0.get(0);
            euv $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (euv $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static euz.a a(evd.a<?>... $$0) {
      return new euz.a($$0);
   }

   public static class a extends evd.a<euz.a> {
      private final Builder<evd> a = ImmutableList.builder();

      public a(evd.a<?>... $$0) {
         for (evd.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected euz.a a() {
         return this;
      }

      @Override
      public euz.a b(evd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public evd b() {
         return new euz(this.a.build(), this.f());
      }
   }
}
