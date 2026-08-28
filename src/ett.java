import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ett extends etq {
   public static final MapCodec<ett> a = a(ett::new);

   ett(List<etx> $$0, List<ews> $$1) {
      super($$0, $$1);
   }

   @Override
   public ety a() {
      return etv.i;
   }

   @Override
   protected etp a(List<? extends etp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (etp)$$0.get(0);
         case 2 -> {
            etp $$1 = $$0.get(0);
            etp $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (etp $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ett.a a(etx.a<?>... $$0) {
      return new ett.a($$0);
   }

   public static class a extends etx.a<ett.a> {
      private final Builder<etx> a = ImmutableList.builder();

      public a(etx.a<?>... $$0) {
         for (etx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ett.a a() {
         return this;
      }

      @Override
      public ett.a b(etx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public etx b() {
         return new ett(this.a.build(), this.f());
      }
   }
}
