import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ehs extends ehh {
   public static final Codec<ehs> a = a(ehs::new);

   ehs(List<eho> $$0, List<eju> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehp a() {
      return ehm.h;
   }

   @Override
   protected ehg a(List<? extends ehg> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ehg)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ehg $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ehs.a a(eho.a<?>... $$0) {
      return new ehs.a($$0);
   }

   public static class a extends eho.a<ehs.a> {
      private final Builder<eho> a = ImmutableList.builder();

      public a(eho.a<?>... $$0) {
         for (eho.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ehs.a a() {
         return this;
      }

      @Override
      public ehs.a c(eho.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eho b() {
         return new ehs(this.a.build(), this.f());
      }
   }
}
