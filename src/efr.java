import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class efr extends efo {
   public static final Codec<efr> a = a(efr::new);

   efr(List<efv> $$0, List<eib> $$1) {
      super($$0, $$1);
   }

   @Override
   public efw a() {
      return eft.i;
   }

   @Override
   protected efn a(List<? extends efn> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (efn)$$0.get(0);
         case 2 -> {
            efn $$1 = $$0.get(0);
            efn $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (efn $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static efr.a a(efv.a<?>... $$0) {
      return new efr.a($$0);
   }

   public static class a extends efv.a<efr.a> {
      private final Builder<efv> a = ImmutableList.builder();

      public a(efv.a<?>... $$0) {
         for (efv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected efr.a a() {
         return this;
      }

      @Override
      public efr.a b(efv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public efv b() {
         return new efr(this.a.build(), this.f());
      }
   }
}
