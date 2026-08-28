import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewd extends ewa {
   public static final MapCodec<ewd> a = a(ewd::new);

   ewd(List<ewh> $$0, List<eza> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewi a() {
      return ewf.i;
   }

   @Override
   protected evz a(List<? extends evz> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (evz)$$0.get(0);
         case 2 -> {
            evz $$1 = $$0.get(0);
            evz $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (evz $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ewd.a a(ewh.a<?>... $$0) {
      return new ewd.a($$0);
   }

   public static class a extends ewh.a<ewd.a> {
      private final Builder<ewh> a = ImmutableList.builder();

      public a(ewh.a<?>... $$0) {
         for (ewh.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewd.a a() {
         return this;
      }

      @Override
      public ewd.a b(ewh.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewh b() {
         return new ewd(this.a.build(), this.f());
      }
   }
}
