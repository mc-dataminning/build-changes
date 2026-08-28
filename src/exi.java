import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class exi extends ewx {
   public static final MapCodec<exi> a = a(exi::new);

   exi(List<exe> $$0, List<ezx> $$1) {
      super($$0, $$1);
   }

   @Override
   public exf a() {
      return exc.h;
   }

   @Override
   protected eww a(List<? extends eww> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eww)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eww $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static exi.a a(exe.a<?>... $$0) {
      return new exi.a($$0);
   }

   public static class a extends exe.a<exi.a> {
      private final Builder<exe> a = ImmutableList.builder();

      public a(exe.a<?>... $$0) {
         for (exe.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected exi.a a() {
         return this;
      }

      @Override
      public exi.a c(exe.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public exe b() {
         return new exi(this.a.build(), this.f());
      }
   }
}
