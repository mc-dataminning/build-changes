import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class enz extends enw {
   public static final Codec<enz> a = a(enz::new);

   enz(List<eod> $$0, List<eql> $$1) {
      super($$0, $$1);
   }

   @Override
   public eoe a() {
      return eob.i;
   }

   @Override
   protected env a(List<? extends env> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (env)$$0.get(0);
         case 2 -> {
            env $$1 = $$0.get(0);
            env $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (env $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static enz.a a(eod.a<?>... $$0) {
      return new enz.a($$0);
   }

   public static class a extends eod.a<enz.a> {
      private final Builder<eod> a = ImmutableList.builder();

      public a(eod.a<?>... $$0) {
         for (eod.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected enz.a a() {
         return this;
      }

      @Override
      public enz.a b(eod.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eod b() {
         return new enz(this.a.build(), this.f());
      }
   }
}
