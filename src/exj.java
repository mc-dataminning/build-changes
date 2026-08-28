import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class exj extends ewy {
   public static final MapCodec<exj> a = a(exj::new);

   exj(List<exf> $$0, List<ezy> $$1) {
      super($$0, $$1);
   }

   @Override
   public exg a() {
      return exd.h;
   }

   @Override
   protected ewx a(List<? extends ewx> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ewx)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ewx $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static exj.a a(exf.a<?>... $$0) {
      return new exj.a($$0);
   }

   public static class a extends exf.a<exj.a> {
      private final Builder<exf> a = ImmutableList.builder();

      public a(exf.a<?>... $$0) {
         for (exf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected exj.a a() {
         return this;
      }

      @Override
      public exj.a c(exf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public exf b() {
         return new exj(this.a.build(), this.f());
      }
   }
}
