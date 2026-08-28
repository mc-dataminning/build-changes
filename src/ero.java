import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ero extends erd {
   public static final MapCodec<ero> a = a(ero::new);

   ero(List<erk> $$0, List<euf> $$1) {
      super($$0, $$1);
   }

   @Override
   public erl a() {
      return eri.h;
   }

   @Override
   protected erc a(List<? extends erc> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (erc)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (erc $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ero.a a(erk.a<?>... $$0) {
      return new ero.a($$0);
   }

   public static class a extends erk.a<ero.a> {
      private final Builder<erk> a = ImmutableList.builder();

      public a(erk.a<?>... $$0) {
         for (erk.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ero.a a() {
         return this;
      }

      @Override
      public ero.a c(erk.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public erk b() {
         return new ero(this.a.build(), this.f());
      }
   }
}
