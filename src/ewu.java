import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewu extends ewr {
   public static final MapCodec<ewu> a = a(ewu::new);

   ewu(List<ewy> $$0, List<ezr> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewz a() {
      return eww.i;
   }

   @Override
   protected ewq a(List<? extends ewq> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ewq)$$0.get(0);
         case 2 -> {
            ewq $$1 = $$0.get(0);
            ewq $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ewq $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ewu.a a(ewy.a<?>... $$0) {
      return new ewu.a($$0);
   }

   public static class a extends ewy.a<ewu.a> {
      private final Builder<ewy> a = ImmutableList.builder();

      public a(ewy.a<?>... $$0) {
         for (ewy.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewu.a a() {
         return this;
      }

      @Override
      public ewu.a b(ewy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewy b() {
         return new ewu(this.a.build(), this.f());
      }
   }
}
