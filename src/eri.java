import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eri extends erf {
   public static final MapCodec<eri> a = a(eri::new);

   eri(List<erm> $$0, List<euh> $$1) {
      super($$0, $$1);
   }

   @Override
   public ern a() {
      return erk.i;
   }

   @Override
   protected ere a(List<? extends ere> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ere)$$0.get(0);
         case 2 -> {
            ere $$1 = $$0.get(0);
            ere $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ere $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eri.a a(erm.a<?>... $$0) {
      return new eri.a($$0);
   }

   public static class a extends erm.a<eri.a> {
      private final Builder<erm> a = ImmutableList.builder();

      public a(erm.a<?>... $$0) {
         for (erm.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eri.a a() {
         return this;
      }

      @Override
      public eri.a b(erm.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public erm b() {
         return new eri(this.a.build(), this.f());
      }
   }
}
