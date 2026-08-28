import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezl extends ezi {
   public static final MapCodec<ezl> a = a(ezl::new);

   ezl(List<ezp> $$0, List<fci> $$1) {
      super($$0, $$1);
   }

   @Override
   public ezq a() {
      return ezn.i;
   }

   @Override
   protected ezh a(List<? extends ezh> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ezh)$$0.get(0);
         case 2 -> {
            ezh $$1 = $$0.get(0);
            ezh $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ezh $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ezl.a a(ezp.a<?>... $$0) {
      return new ezl.a($$0);
   }

   public static class a extends ezp.a<ezl.a> {
      private final Builder<ezp> a = ImmutableList.builder();

      public a(ezp.a<?>... $$0) {
         for (ezp.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ezl.a a() {
         return this;
      }

      @Override
      public ezl.a b(ezp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ezp b() {
         return new ezl(this.a.build(), this.f());
      }
   }
}
