import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class esd extends esa {
   public static final MapCodec<esd> a = a(esd::new);

   esd(List<esh> $$0, List<evc> $$1) {
      super($$0, $$1);
   }

   @Override
   public esi a() {
      return esf.i;
   }

   @Override
   protected erz a(List<? extends erz> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (erz)$$0.get(0);
         case 2 -> {
            erz $$1 = $$0.get(0);
            erz $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (erz $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static esd.a a(esh.a<?>... $$0) {
      return new esd.a($$0);
   }

   public static class a extends esh.a<esd.a> {
      private final Builder<esh> a = ImmutableList.builder();

      public a(esh.a<?>... $$0) {
         for (esh.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected esd.a a() {
         return this;
      }

      @Override
      public esd.a b(esh.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esh b() {
         return new esd(this.a.build(), this.f());
      }
   }
}
