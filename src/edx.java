import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class edx extends edu {
   public static final Codec<edx> a = a(edx::new);

   edx(List<eeb> $$0, List<egh> $$1) {
      super($$0, $$1);
   }

   @Override
   public eec a() {
      return edz.i;
   }

   @Override
   protected edt a(List<? extends edt> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (edt)$$0.get(0);
         case 2 -> {
            edt $$1 = $$0.get(0);
            edt $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (edt $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static edx.a a(eeb.a<?>... $$0) {
      return new edx.a($$0);
   }

   public static class a extends eeb.a<edx.a> {
      private final Builder<eeb> a = ImmutableList.builder();

      public a(eeb.a<?>... $$0) {
         for (eeb.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected edx.a a() {
         return this;
      }

      @Override
      public edx.a b(eeb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eeb b() {
         return new edx(this.a.build(), this.f());
      }
   }
}
