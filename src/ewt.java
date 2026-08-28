import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewt extends ewq {
   public static final MapCodec<ewt> a = a(ewt::new);

   ewt(List<ewx> $$0, List<ezs> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewy a() {
      return ewv.i;
   }

   @Override
   protected ewp a(List<? extends ewp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ewp)$$0.get(0);
         case 2 -> {
            ewp $$1 = $$0.get(0);
            ewp $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ewp $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ewt.a a(ewx.a<?>... $$0) {
      return new ewt.a($$0);
   }

   public static class a extends ewx.a<ewt.a> {
      private final Builder<ewx> a = ImmutableList.builder();

      public a(ewx.a<?>... $$0) {
         for (ewx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewt.a a() {
         return this;
      }

      @Override
      public ewt.a b(ewx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewx b() {
         return new ewt(this.a.build(), this.f());
      }
   }
}
