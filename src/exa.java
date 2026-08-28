import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class exa extends ewx {
   public static final MapCodec<exa> a = a(exa::new);

   exa(List<exe> $$0, List<ezx> $$1) {
      super($$0, $$1);
   }

   @Override
   public exf a() {
      return exc.i;
   }

   @Override
   protected eww a(List<? extends eww> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eww)$$0.get(0);
         case 2 -> {
            eww $$1 = $$0.get(0);
            eww $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eww $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static exa.a a(exe.a<?>... $$0) {
      return new exa.a($$0);
   }

   public static class a extends exe.a<exa.a> {
      private final Builder<exe> a = ImmutableList.builder();

      public a(exe.a<?>... $$0) {
         for (exe.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected exa.a a() {
         return this;
      }

      @Override
      public exa.a b(exe.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public exe b() {
         return new exa(this.a.build(), this.f());
      }
   }
}
