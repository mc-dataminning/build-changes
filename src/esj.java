import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class esj extends ery {
   public static final MapCodec<esj> a = a(esj::new);

   esj(List<esf> $$0, List<eva> $$1) {
      super($$0, $$1);
   }

   @Override
   public esg a() {
      return esd.h;
   }

   @Override
   protected erx a(List<? extends erx> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (erx)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (erx $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static esj.a a(esf.a<?>... $$0) {
      return new esj.a($$0);
   }

   public static class a extends esf.a<esj.a> {
      private final Builder<esf> a = ImmutableList.builder();

      public a(esf.a<?>... $$0) {
         for (esf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected esj.a a() {
         return this;
      }

      @Override
      public esj.a c(esf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esf b() {
         return new esj(this.a.build(), this.f());
      }
   }
}
