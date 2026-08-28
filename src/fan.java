import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fan extends fac {
   public static final MapCodec<fan> a = a(fan::new);

   fan(List<faj> $$0, List<fdc> $$1) {
      super($$0, $$1);
   }

   @Override
   public fak a() {
      return fah.h;
   }

   @Override
   protected fab a(List<? extends fab> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (fab)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (fab $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static fan.a a(faj.a<?>... $$0) {
      return new fan.a($$0);
   }

   public static class a extends faj.a<fan.a> {
      private final Builder<faj> a = ImmutableList.builder();

      public a(faj.a<?>... $$0) {
         for (faj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fan.a a() {
         return this;
      }

      @Override
      public fan.a c(faj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public faj b() {
         return new fan(this.a.build(), this.f());
      }
   }
}
