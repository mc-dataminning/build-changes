import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fai extends ezx {
   public static final MapCodec<fai> a = a(fai::new);

   fai(List<fae> $$0, List<fcx> $$1) {
      super($$0, $$1);
   }

   @Override
   public faf a() {
      return fac.h;
   }

   @Override
   protected ezw a(List<? extends ezw> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ezw)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ezw $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static fai.a a(fae.a<?>... $$0) {
      return new fai.a($$0);
   }

   public static class a extends fae.a<fai.a> {
      private final Builder<fae> a = ImmutableList.builder();

      public a(fae.a<?>... $$0) {
         for (fae.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fai.a a() {
         return this;
      }

      @Override
      public fai.a c(fae.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fae b() {
         return new fai(this.a.build(), this.f());
      }
   }
}
