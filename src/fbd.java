import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fbd extends fas {
   public static final MapCodec<fbd> a = a(fbd::new);

   fbd(List<faz> $$0, List<fds> $$1) {
      super($$0, $$1);
   }

   @Override
   public fba a() {
      return fax.h;
   }

   @Override
   protected far a(List<? extends far> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (far)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (far $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static fbd.a a(faz.a<?>... $$0) {
      return new fbd.a($$0);
   }

   public static class a extends faz.a<fbd.a> {
      private final Builder<faz> a = ImmutableList.builder();

      public a(faz.a<?>... $$0) {
         for (faz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fbd.a a() {
         return this;
      }

      @Override
      public fbd.a c(faz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public faz b() {
         return new fbd(this.a.build(), this.f());
      }
   }
}
