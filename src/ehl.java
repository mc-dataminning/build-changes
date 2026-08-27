import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ehl extends ehi {
   public static final Codec<ehl> a = a(ehl::new);

   ehl(List<ehp> $$0, List<ejv> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehq a() {
      return ehn.i;
   }

   @Override
   protected ehh a(List<? extends ehh> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ehh)$$0.get(0);
         case 2 -> {
            ehh $$1 = $$0.get(0);
            ehh $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ehh $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ehl.a a(ehp.a<?>... $$0) {
      return new ehl.a($$0);
   }

   public static class a extends ehp.a<ehl.a> {
      private final Builder<ehp> a = ImmutableList.builder();

      public a(ehp.a<?>... $$0) {
         for (ehp.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ehl.a a() {
         return this;
      }

      @Override
      public ehl.a b(ehp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ehp b() {
         return new ehl(this.a.build(), this.f());
      }
   }
}
