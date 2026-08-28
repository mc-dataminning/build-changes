import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class erx extends eru {
   public static final MapCodec<erx> a = a(erx::new);

   erx(List<esb> $$0, List<euw> $$1) {
      super($$0, $$1);
   }

   @Override
   public esc a() {
      return erz.i;
   }

   @Override
   protected ert a(List<? extends ert> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ert)$$0.get(0);
         case 2 -> {
            ert $$1 = $$0.get(0);
            ert $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ert $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static erx.a a(esb.a<?>... $$0) {
      return new erx.a($$0);
   }

   public static class a extends esb.a<erx.a> {
      private final Builder<esb> a = ImmutableList.builder();

      public a(esb.a<?>... $$0) {
         for (esb.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected erx.a a() {
         return this;
      }

      @Override
      public erx.a b(esb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esb b() {
         return new erx(this.a.build(), this.f());
      }
   }
}
