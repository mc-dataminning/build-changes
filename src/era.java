import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class era extends eqx {
   public static final MapCodec<era> a = a(era::new);

   era(List<ere> $$0, List<etz> $$1) {
      super($$0, $$1);
   }

   @Override
   public erf a() {
      return erc.i;
   }

   @Override
   protected eqw a(List<? extends eqw> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqw)$$0.get(0);
         case 2 -> {
            eqw $$1 = $$0.get(0);
            eqw $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eqw $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static era.a a(ere.a<?>... $$0) {
      return new era.a($$0);
   }

   public static class a extends ere.a<era.a> {
      private final Builder<ere> a = ImmutableList.builder();

      public a(ere.a<?>... $$0) {
         for (ere.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected era.a a() {
         return this;
      }

      @Override
      public era.a b(ere.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ere b() {
         return new era(this.a.build(), this.f());
      }
   }
}
