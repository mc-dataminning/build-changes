import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewm extends ewb {
   public static final MapCodec<ewm> a = a(ewm::new);

   ewm(List<ewi> $$0, List<ezb> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewj a() {
      return ewg.h;
   }

   @Override
   protected ewa a(List<? extends ewa> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ewa)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ewa $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ewm.a a(ewi.a<?>... $$0) {
      return new ewm.a($$0);
   }

   public static class a extends ewi.a<ewm.a> {
      private final Builder<ewi> a = ImmutableList.builder();

      public a(ewi.a<?>... $$0) {
         for (ewi.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewm.a a() {
         return this;
      }

      @Override
      public ewm.a c(ewi.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewi b() {
         return new ewm(this.a.build(), this.f());
      }
   }
}
