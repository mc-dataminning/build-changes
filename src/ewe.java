import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewe extends ewb {
   public static final MapCodec<ewe> a = a(ewe::new);

   ewe(List<ewi> $$0, List<ezb> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewj a() {
      return ewg.i;
   }

   @Override
   protected ewa a(List<? extends ewa> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ewa)$$0.get(0);
         case 2 -> {
            ewa $$1 = $$0.get(0);
            ewa $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ewa $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ewe.a a(ewi.a<?>... $$0) {
      return new ewe.a($$0);
   }

   public static class a extends ewi.a<ewe.a> {
      private final Builder<ewi> a = ImmutableList.builder();

      public a(ewi.a<?>... $$0) {
         for (ewi.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewe.a a() {
         return this;
      }

      @Override
      public ewe.a b(ewi.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewi b() {
         return new ewe(this.a.build(), this.f());
      }
   }
}
