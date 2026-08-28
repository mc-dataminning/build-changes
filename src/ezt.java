import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezt extends ezq {
   public static final MapCodec<ezt> a = a(ezt::new);

   ezt(List<ezx> $$0, List<fcq> $$1) {
      super($$0, $$1);
   }

   @Override
   public ezy a() {
      return ezv.i;
   }

   @Override
   protected ezp a(List<? extends ezp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ezp)$$0.get(0);
         case 2 -> {
            ezp $$1 = $$0.get(0);
            ezp $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ezp $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ezt.a a(ezx.a<?>... $$0) {
      return new ezt.a($$0);
   }

   public static class a extends ezx.a<ezt.a> {
      private final Builder<ezx> a = ImmutableList.builder();

      public a(ezx.a<?>... $$0) {
         for (ezx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ezt.a a() {
         return this;
      }

      @Override
      public ezt.a b(ezx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ezx b() {
         return new ezt(this.a.build(), this.f());
      }
   }
}
