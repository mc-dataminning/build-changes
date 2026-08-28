import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class era extends eqp {
   public static final MapCodec<era> a = a(era::new);

   era(List<eqw> $$0, List<etq> $$1) {
      super($$0, $$1);
   }

   @Override
   public eqx a() {
      return equ.h;
   }

   @Override
   protected eqo a(List<? extends eqo> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqo)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqo $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static era.a a(eqw.a<?>... $$0) {
      return new era.a($$0);
   }

   public static class a extends eqw.a<era.a> {
      private final Builder<eqw> a = ImmutableList.builder();

      public a(eqw.a<?>... $$0) {
         for (eqw.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected era.a a() {
         return this;
      }

      @Override
      public era.a c(eqw.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqw b() {
         return new era(this.a.build(), this.f());
      }
   }
}
