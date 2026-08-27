import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class epz extends epo {
   public static final MapCodec<epz> a = a(epz::new);

   epz(List<epv> $$0, List<esl> $$1) {
      super($$0, $$1);
   }

   @Override
   public epw a() {
      return ept.h;
   }

   @Override
   protected epn a(List<? extends epn> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (epn)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (epn $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static epz.a a(epv.a<?>... $$0) {
      return new epz.a($$0);
   }

   public static class a extends epv.a<epz.a> {
      private final Builder<epv> a = ImmutableList.builder();

      public a(epv.a<?>... $$0) {
         for (epv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected epz.a a() {
         return this;
      }

      @Override
      public epz.a c(epv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public epv b() {
         return new epz(this.a.build(), this.f());
      }
   }
}
