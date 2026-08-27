import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ecv extends ecs {
   public static final Codec<ecv> a = a(ecv::new);

   ecv(List<ecz> $$0, List<eff> $$1) {
      super($$0, $$1);
   }

   @Override
   public eda a() {
      return ecx.i;
   }

   @Override
   protected ecr a(List<? extends ecr> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ecr)$$0.get(0);
         case 2 -> {
            ecr $$1 = $$0.get(0);
            ecr $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ecr $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ecv.a a(ecz.a<?>... $$0) {
      return new ecv.a($$0);
   }

   public static class a extends ecz.a<ecv.a> {
      private final Builder<ecz> a = ImmutableList.builder();

      public a(ecz.a<?>... $$0) {
         for (ecz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ecv.a a() {
         return this;
      }

      @Override
      public ecv.a b(ecz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ecz b() {
         return new ecv(this.a.build(), this.f());
      }
   }
}
