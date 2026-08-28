import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eri extends eqx {
   public static final MapCodec<eri> a = a(eri::new);

   eri(List<ere> $$0, List<etz> $$1) {
      super($$0, $$1);
   }

   @Override
   public erf a() {
      return erc.h;
   }

   @Override
   protected eqw a(List<? extends eqw> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqw)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqw $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eri.a a(ere.a<?>... $$0) {
      return new eri.a($$0);
   }

   public static class a extends ere.a<eri.a> {
      private final Builder<ere> a = ImmutableList.builder();

      public a(ere.a<?>... $$0) {
         for (ere.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eri.a a() {
         return this;
      }

      @Override
      public eri.a c(ere.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ere b() {
         return new eri(this.a.build(), this.f());
      }
   }
}
