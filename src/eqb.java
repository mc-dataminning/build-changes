import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eqb extends epq {
   public static final MapCodec<eqb> a = a(eqb::new);

   eqb(List<epx> $$0, List<esn> $$1) {
      super($$0, $$1);
   }

   @Override
   public epy a() {
      return epv.h;
   }

   @Override
   protected epp a(List<? extends epp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (epp)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (epp $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eqb.a a(epx.a<?>... $$0) {
      return new eqb.a($$0);
   }

   public static class a extends epx.a<eqb.a> {
      private final Builder<epx> a = ImmutableList.builder();

      public a(epx.a<?>... $$0) {
         for (epx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqb.a a() {
         return this;
      }

      @Override
      public eqb.a c(epx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public epx b() {
         return new eqb(this.a.build(), this.f());
      }
   }
}
