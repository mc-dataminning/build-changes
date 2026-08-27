import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class edf extends edc {
   public static final Codec<edf> a = a(edf::new);

   edf(List<edj> $$0, List<efp> $$1) {
      super($$0, $$1);
   }

   @Override
   public edk a() {
      return edh.i;
   }

   @Override
   protected edb a(List<? extends edb> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (edb)$$0.get(0);
         case 2 -> {
            edb $$1 = $$0.get(0);
            edb $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (edb $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static edf.a a(edj.a<?>... $$0) {
      return new edf.a($$0);
   }

   public static class a extends edj.a<edf.a> {
      private final Builder<edj> a = ImmutableList.builder();

      public a(edj.a<?>... $$0) {
         for (edj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected edf.a a() {
         return this;
      }

      @Override
      public edf.a b(edj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edj b() {
         return new edf(this.a.build(), this.f());
      }
   }
}
