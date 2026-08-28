import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class erc extends eqr {
   public static final MapCodec<erc> a = a(erc::new);

   erc(List<eqy> $$0, List<ets> $$1) {
      super($$0, $$1);
   }

   @Override
   public eqz a() {
      return eqw.h;
   }

   @Override
   protected eqq a(List<? extends eqq> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqq)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eqq $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static erc.a a(eqy.a<?>... $$0) {
      return new erc.a($$0);
   }

   public static class a extends eqy.a<erc.a> {
      private final Builder<eqy> a = ImmutableList.builder();

      public a(eqy.a<?>... $$0) {
         for (eqy.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected erc.a a() {
         return this;
      }

      @Override
      public erc.a c(eqy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqy b() {
         return new erc(this.a.build(), this.f());
      }
   }
}
