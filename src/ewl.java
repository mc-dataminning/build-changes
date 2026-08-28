import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewl extends ewa {
   public static final MapCodec<ewl> a = a(ewl::new);

   ewl(List<ewh> $$0, List<eza> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewi a() {
      return ewf.h;
   }

   @Override
   protected evz a(List<? extends evz> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (evz)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (evz $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ewl.a a(ewh.a<?>... $$0) {
      return new ewl.a($$0);
   }

   public static class a extends ewh.a<ewl.a> {
      private final Builder<ewh> a = ImmutableList.builder();

      public a(ewh.a<?>... $$0) {
         for (ewh.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewl.a a() {
         return this;
      }

      @Override
      public ewl.a c(ewh.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewh b() {
         return new ewl(this.a.build(), this.f());
      }
   }
}
