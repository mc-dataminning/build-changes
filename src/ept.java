import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ept extends epq {
   public static final MapCodec<ept> a = a(ept::new);

   ept(List<epx> $$0, List<esn> $$1) {
      super($$0, $$1);
   }

   @Override
   public epy a() {
      return epv.i;
   }

   @Override
   protected epp a(List<? extends epp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (epp)$$0.get(0);
         case 2 -> {
            epp $$1 = $$0.get(0);
            epp $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (epp $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ept.a a(epx.a<?>... $$0) {
      return new ept.a($$0);
   }

   public static class a extends epx.a<ept.a> {
      private final Builder<epx> a = ImmutableList.builder();

      public a(epx.a<?>... $$0) {
         for (epx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ept.a a() {
         return this;
      }

      @Override
      public ept.a b(epx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public epx b() {
         return new ept(this.a.build(), this.f());
      }
   }
}
