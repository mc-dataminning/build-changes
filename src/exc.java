import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class exc extends ewr {
   public static final MapCodec<exc> a = a(exc::new);

   exc(List<ewy> $$0, List<ezr> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewz a() {
      return eww.h;
   }

   @Override
   protected ewq a(List<? extends ewq> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ewq)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ewq $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static exc.a a(ewy.a<?>... $$0) {
      return new exc.a($$0);
   }

   public static class a extends ewy.a<exc.a> {
      private final Builder<ewy> a = ImmutableList.builder();

      public a(ewy.a<?>... $$0) {
         for (ewy.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected exc.a a() {
         return this;
      }

      @Override
      public exc.a c(ewy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewy b() {
         return new exc(this.a.build(), this.f());
      }
   }
}
