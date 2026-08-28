import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class erd extends eqs {
   public static final MapCodec<erd> a = a(erd::new);

   erd(List<eqz> $$0, List<ett> $$1) {
      super($$0, $$1);
   }

   @Override
   public era a() {
      return eqx.h;
   }

   @Override
   protected eqr a(List<? extends eqr> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqr)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqr $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static erd.a a(eqz.a<?>... $$0) {
      return new erd.a($$0);
   }

   public static class a extends eqz.a<erd.a> {
      private final Builder<eqz> a = ImmutableList.builder();

      public a(eqz.a<?>... $$0) {
         for (eqz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected erd.a a() {
         return this;
      }

      @Override
      public erd.a c(eqz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqz b() {
         return new erd(this.a.build(), this.f());
      }
   }
}
