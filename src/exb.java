import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class exb extends ewy {
   public static final MapCodec<exb> a = a(exb::new);

   exb(List<exf> $$0, List<ezy> $$1) {
      super($$0, $$1);
   }

   @Override
   public exg a() {
      return exd.i;
   }

   @Override
   protected ewx a(List<? extends ewx> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ewx)$$0.get(0);
         case 2 -> {
            ewx $$1 = $$0.get(0);
            ewx $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ewx $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static exb.a a(exf.a<?>... $$0) {
      return new exb.a($$0);
   }

   public static class a extends exf.a<exb.a> {
      private final Builder<exf> a = ImmutableList.builder();

      public a(exf.a<?>... $$0) {
         for (exf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected exb.a a() {
         return this;
      }

      @Override
      public exb.a b(exf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public exf b() {
         return new exb(this.a.build(), this.f());
      }
   }
}
