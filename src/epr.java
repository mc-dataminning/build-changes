import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class epr extends epo {
   public static final MapCodec<epr> a = a(epr::new);

   epr(List<epv> $$0, List<esl> $$1) {
      super($$0, $$1);
   }

   @Override
   public epw a() {
      return ept.i;
   }

   @Override
   protected epn a(List<? extends epn> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (epn)$$0.get(0);
         case 2 -> {
            epn $$1 = $$0.get(0);
            epn $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (epn $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static epr.a a(epv.a<?>... $$0) {
      return new epr.a($$0);
   }

   public static class a extends epv.a<epr.a> {
      private final Builder<epv> a = ImmutableList.builder();

      public a(epv.a<?>... $$0) {
         for (epv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected epr.a a() {
         return this;
      }

      @Override
      public epr.a b(epv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public epv b() {
         return new epr(this.a.build(), this.f());
      }
   }
}
