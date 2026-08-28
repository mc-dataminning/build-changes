import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class esf extends eru {
   public static final MapCodec<esf> a = a(esf::new);

   esf(List<esb> $$0, List<euw> $$1) {
      super($$0, $$1);
   }

   @Override
   public esc a() {
      return erz.h;
   }

   @Override
   protected ert a(List<? extends ert> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ert)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ert $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static esf.a a(esb.a<?>... $$0) {
      return new esf.a($$0);
   }

   public static class a extends esb.a<esf.a> {
      private final Builder<esb> a = ImmutableList.builder();

      public a(esb.a<?>... $$0) {
         for (esb.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected esf.a a() {
         return this;
      }

      @Override
      public esf.a c(esb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esb b() {
         return new esf(this.a.build(), this.f());
      }
   }
}
