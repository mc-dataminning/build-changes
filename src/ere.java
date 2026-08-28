import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ere extends eqt {
   public static final MapCodec<ere> a = a(ere::new);

   ere(List<era> $$0, List<etu> $$1) {
      super($$0, $$1);
   }

   @Override
   public erb a() {
      return eqy.h;
   }

   @Override
   protected eqs a(List<? extends eqs> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqs)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqs $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ere.a a(era.a<?>... $$0) {
      return new ere.a($$0);
   }

   public static class a extends era.a<ere.a> {
      private final Builder<era> a = ImmutableList.builder();

      public a(era.a<?>... $$0) {
         for (era.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ere.a a() {
         return this;
      }

      @Override
      public ere.a c(era.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public era b() {
         return new ere(this.a.build(), this.f());
      }
   }
}
