import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class edn extends edc {
   public static final Codec<edn> a = a(edn::new);

   edn(List<edj> $$0, List<efp> $$1) {
      super($$0, $$1);
   }

   @Override
   public edk a() {
      return edh.h;
   }

   @Override
   protected edb a(List<? extends edb> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (edb)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (edb $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static edn.a a(edj.a<?>... $$0) {
      return new edn.a($$0);
   }

   public static class a extends edj.a<edn.a> {
      private final Builder<edj> a = ImmutableList.builder();

      public a(edj.a<?>... $$0) {
         for (edj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected edn.a a() {
         return this;
      }

      @Override
      public edn.a c(edj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edj b() {
         return new edn(this.a.build(), this.f());
      }
   }
}
