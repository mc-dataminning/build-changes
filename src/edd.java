import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class edd extends ecs {
   public static final Codec<edd> a = a(edd::new);

   edd(List<ecz> $$0, List<eff> $$1) {
      super($$0, $$1);
   }

   @Override
   public eda a() {
      return ecx.h;
   }

   @Override
   protected ecr a(List<? extends ecr> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ecr)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ecr $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static edd.a a(ecz.a<?>... $$0) {
      return new edd.a($$0);
   }

   public static class a extends ecz.a<edd.a> {
      private final Builder<ecz> a = ImmutableList.builder();

      public a(ecz.a<?>... $$0) {
         for (ecz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected edd.a a() {
         return this;
      }

      @Override
      public edd.a c(ecz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ecz b() {
         return new edd(this.a.build(), this.f());
      }
   }
}
