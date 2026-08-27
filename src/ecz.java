import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ecz extends ecw {
   public static final Codec<ecz> a = a(ecz::new);

   ecz(List<edd> $$0, List<efj> $$1) {
      super($$0, $$1);
   }

   @Override
   public ede a() {
      return edb.i;
   }

   @Override
   protected ecv a(List<? extends ecv> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ecv)$$0.get(0);
         case 2 -> {
            ecv $$1 = $$0.get(0);
            ecv $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ecv $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ecz.a a(edd.a<?>... $$0) {
      return new ecz.a($$0);
   }

   public static class a extends edd.a<ecz.a> {
      private final Builder<edd> a = ImmutableList.builder();

      public a(edd.a<?>... $$0) {
         for (edd.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ecz.a a() {
         return this;
      }

      @Override
      public ecz.a b(edd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edd b() {
         return new ecz(this.a.build(), this.f());
      }
   }
}
