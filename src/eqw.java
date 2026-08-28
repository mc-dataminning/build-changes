import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eqw extends eqt {
   public static final MapCodec<eqw> a = a(eqw::new);

   eqw(List<era> $$0, List<etu> $$1) {
      super($$0, $$1);
   }

   @Override
   public erb a() {
      return eqy.i;
   }

   @Override
   protected eqs a(List<? extends eqs> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eqs)$$0.get(0);
         case 2 -> {
            eqs $$1 = $$0.get(0);
            eqs $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eqs $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eqw.a a(era.a<?>... $$0) {
      return new eqw.a($$0);
   }

   public static class a extends era.a<eqw.a> {
      private final Builder<era> a = ImmutableList.builder();

      public a(era.a<?>... $$0) {
         for (era.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqw.a a() {
         return this;
      }

      @Override
      public eqw.a b(era.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public era b() {
         return new eqw(this.a.build(), this.f());
      }
   }
}
