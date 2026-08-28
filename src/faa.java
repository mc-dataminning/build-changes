import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class faa extends ezx {
   public static final MapCodec<faa> a = a(faa::new);

   faa(List<fae> $$0, List<fcx> $$1) {
      super($$0, $$1);
   }

   @Override
   public faf a() {
      return fac.i;
   }

   @Override
   protected ezw a(List<? extends ezw> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ezw)$$0.get(0);
         case 2 -> {
            ezw $$1 = $$0.get(0);
            ezw $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ezw $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static faa.a a(fae.a<?>... $$0) {
      return new faa.a($$0);
   }

   public static class a extends fae.a<faa.a> {
      private final Builder<fae> a = ImmutableList.builder();

      public a(fae.a<?>... $$0) {
         for (fae.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected faa.a a() {
         return this;
      }

      @Override
      public faa.a b(fae.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fae b() {
         return new faa(this.a.build(), this.f());
      }
   }
}
