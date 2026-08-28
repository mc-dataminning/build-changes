import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewb extends evy {
   public static final MapCodec<ewb> a = a(ewb::new);

   ewb(List<ewf> $$0, List<eyy> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewg a() {
      return ewd.i;
   }

   @Override
   protected evx a(List<? extends evx> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (evx)$$0.get(0);
         case 2 -> {
            evx $$1 = $$0.get(0);
            evx $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (evx $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ewb.a a(ewf.a<?>... $$0) {
      return new ewb.a($$0);
   }

   public static class a extends ewf.a<ewb.a> {
      private final Builder<ewf> a = ImmutableList.builder();

      public a(ewf.a<?>... $$0) {
         for (ewf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewb.a a() {
         return this;
      }

      @Override
      public ewb.a b(ewf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewf b() {
         return new ewb(this.a.build(), this.f());
      }
   }
}
