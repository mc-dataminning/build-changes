import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class faf extends fac {
   public static final MapCodec<faf> a = a(faf::new);

   faf(List<faj> $$0, List<fdc> $$1) {
      super($$0, $$1);
   }

   @Override
   public fak a() {
      return fah.i;
   }

   @Override
   protected fab a(List<? extends fab> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (fab)$$0.get(0);
         case 2 -> {
            fab $$1 = $$0.get(0);
            fab $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (fab $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static faf.a a(faj.a<?>... $$0) {
      return new faf.a($$0);
   }

   public static class a extends faj.a<faf.a> {
      private final Builder<faj> a = ImmutableList.builder();

      public a(faj.a<?>... $$0) {
         for (faj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected faf.a a() {
         return this;
      }

      @Override
      public faf.a b(faj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public faj b() {
         return new faf(this.a.build(), this.f());
      }
   }
}
