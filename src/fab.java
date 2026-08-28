import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fab extends ezq {
   public static final MapCodec<fab> a = a(fab::new);

   fab(List<ezx> $$0, List<fcq> $$1) {
      super($$0, $$1);
   }

   @Override
   public ezy a() {
      return ezv.h;
   }

   @Override
   protected ezp a(List<? extends ezp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ezp)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ezp $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static fab.a a(ezx.a<?>... $$0) {
      return new fab.a($$0);
   }

   public static class a extends ezx.a<fab.a> {
      private final Builder<ezx> a = ImmutableList.builder();

      public a(ezx.a<?>... $$0) {
         for (ezx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fab.a a() {
         return this;
      }

      @Override
      public fab.a c(ezx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ezx b() {
         return new fab(this.a.build(), this.f());
      }
   }
}
