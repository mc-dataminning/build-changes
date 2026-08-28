import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class erb extends eqq {
   public static final MapCodec<erb> a = a(erb::new);

   erb(List<eqx> $$0, List<etr> $$1) {
      super($$0, $$1);
   }

   @Override
   public eqy a() {
      return eqv.h;
   }

   @Override
   protected eqp a(List<? extends eqp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqp)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqp $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static erb.a a(eqx.a<?>... $$0) {
      return new erb.a($$0);
   }

   public static class a extends eqx.a<erb.a> {
      private final Builder<eqx> a = ImmutableList.builder();

      public a(eqx.a<?>... $$0) {
         for (eqx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected erb.a a() {
         return this;
      }

      @Override
      public erb.a c(eqx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqx b() {
         return new erb(this.a.build(), this.f());
      }
   }
}
