import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class efz extends efo {
   public static final Codec<efz> a = a(efz::new);

   efz(List<efv> $$0, List<eib> $$1) {
      super($$0, $$1);
   }

   @Override
   public efw a() {
      return eft.h;
   }

   @Override
   protected efn a(List<? extends efn> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (efn)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (efn $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static efz.a a(efv.a<?>... $$0) {
      return new efz.a($$0);
   }

   public static class a extends efv.a<efz.a> {
      private final Builder<efv> a = ImmutableList.builder();

      public a(efv.a<?>... $$0) {
         for (efv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected efz.a a() {
         return this;
      }

      @Override
      public efz.a c(efv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public efv b() {
         return new efz(this.a.build(), this.f());
      }
   }
}
