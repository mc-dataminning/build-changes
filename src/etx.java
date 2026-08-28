import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class etx extends etu {
   public static final MapCodec<etx> a = a(etx::new);

   etx(List<eub> $$0, List<eww> $$1) {
      super($$0, $$1);
   }

   @Override
   public euc a() {
      return etz.i;
   }

   @Override
   protected ett a(List<? extends ett> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ett)$$0.get(0);
         case 2 -> {
            ett $$1 = $$0.get(0);
            ett $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ett $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static etx.a a(eub.a<?>... $$0) {
      return new etx.a($$0);
   }

   public static class a extends eub.a<etx.a> {
      private final Builder<eub> a = ImmutableList.builder();

      public a(eub.a<?>... $$0) {
         for (eub.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected etx.a a() {
         return this;
      }

      @Override
      public etx.a b(eub.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eub b() {
         return new etx(this.a.build(), this.f());
      }
   }
}
