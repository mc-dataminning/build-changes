import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fav extends fas {
   public static final MapCodec<fav> a = a(fav::new);

   fav(List<faz> $$0, List<fds> $$1) {
      super($$0, $$1);
   }

   @Override
   public fba a() {
      return fax.i;
   }

   @Override
   protected far a(List<? extends far> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (far)$$0.get(0);
         case 2 -> {
            far $$1 = $$0.get(0);
            far $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (far $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static fav.a a(faz.a<?>... $$0) {
      return new fav.a($$0);
   }

   public static class a extends faz.a<fav.a> {
      private final Builder<faz> a = ImmutableList.builder();

      public a(faz.a<?>... $$0) {
         for (faz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fav.a a() {
         return this;
      }

      @Override
      public fav.a b(faz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public faz b() {
         return new fav(this.a.build(), this.f());
      }
   }
}
