import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ell extends eli {
   public static final Codec<ell> a = a(ell::new);

   ell(List<elp> $$0, List<env> $$1) {
      super($$0, $$1);
   }

   @Override
   public elq a() {
      return eln.i;
   }

   @Override
   protected elh a(List<? extends elh> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (elh)$$0.get(0);
         case 2 -> {
            elh $$1 = $$0.get(0);
            elh $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (elh $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ell.a a(elp.a<?>... $$0) {
      return new ell.a($$0);
   }

   public static class a extends elp.a<ell.a> {
      private final Builder<elp> a = ImmutableList.builder();

      public a(elp.a<?>... $$0) {
         for (elp.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ell.a a() {
         return this;
      }

      @Override
      public ell.a b(elp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public elp b() {
         return new ell(this.a.build(), this.f());
      }
   }
}
