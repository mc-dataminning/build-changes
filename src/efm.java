import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class efm extends efj {
   public static final Codec<efm> a = a(efm::new);

   efm(List<efq> $$0, List<ehw> $$1) {
      super($$0, $$1);
   }

   @Override
   public efr a() {
      return efo.i;
   }

   @Override
   protected efi a(List<? extends efi> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (efi)$$0.get(0);
         case 2 -> {
            efi $$1 = $$0.get(0);
            efi $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (efi $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static efm.a a(efq.a<?>... $$0) {
      return new efm.a($$0);
   }

   public static class a extends efq.a<efm.a> {
      private final Builder<efq> a = ImmutableList.builder();

      public a(efq.a<?>... $$0) {
         for (efq.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected efm.a a() {
         return this;
      }

      @Override
      public efm.a b(efq.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public efq b() {
         return new efm(this.a.build(), this.f());
      }
   }
}
