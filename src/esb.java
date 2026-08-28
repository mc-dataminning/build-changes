import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class esb extends ery {
   public static final MapCodec<esb> a = a(esb::new);

   esb(List<esf> $$0, List<eva> $$1) {
      super($$0, $$1);
   }

   @Override
   public esg a() {
      return esd.i;
   }

   @Override
   protected erx a(List<? extends erx> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (erx)$$0.get(0);
         case 2 -> {
            erx $$1 = $$0.get(0);
            erx $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (erx $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static esb.a a(esf.a<?>... $$0) {
      return new esb.a($$0);
   }

   public static class a extends esf.a<esb.a> {
      private final Builder<esf> a = ImmutableList.builder();

      public a(esf.a<?>... $$0) {
         for (esf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected esb.a a() {
         return this;
      }

      @Override
      public esb.a b(esf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esf b() {
         return new esb(this.a.build(), this.f());
      }
   }
}
