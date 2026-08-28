import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezt extends ezi {
   public static final MapCodec<ezt> a = a(ezt::new);

   ezt(List<ezp> $$0, List<fci> $$1) {
      super($$0, $$1);
   }

   @Override
   public ezq a() {
      return ezn.h;
   }

   @Override
   protected ezh a(List<? extends ezh> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ezh)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ezh $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ezt.a a(ezp.a<?>... $$0) {
      return new ezt.a($$0);
   }

   public static class a extends ezp.a<ezt.a> {
      private final Builder<ezp> a = ImmutableList.builder();

      public a(ezp.a<?>... $$0) {
         for (ezp.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ezt.a a() {
         return this;
      }

      @Override
      public ezt.a c(ezp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ezp b() {
         return new ezt(this.a.build(), this.f());
      }
   }
}
