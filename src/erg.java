import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class erg extends erd {
   public static final MapCodec<erg> a = a(erg::new);

   erg(List<erk> $$0, List<euf> $$1) {
      super($$0, $$1);
   }

   @Override
   public erl a() {
      return eri.i;
   }

   @Override
   protected erc a(List<? extends erc> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (erc)$$0.get(0);
         case 2 -> {
            erc $$1 = $$0.get(0);
            erc $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (erc $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static erg.a a(erk.a<?>... $$0) {
      return new erg.a($$0);
   }

   public static class a extends erk.a<erg.a> {
      private final Builder<erk> a = ImmutableList.builder();

      public a(erk.a<?>... $$0) {
         for (erk.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected erg.a a() {
         return this;
      }

      @Override
      public erg.a b(erk.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public erk b() {
         return new erg(this.a.build(), this.f());
      }
   }
}
