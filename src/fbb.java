import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fbb extends faq {
   public static final MapCodec<fbb> a = a(fbb::new);

   fbb(List<fax> $$0, List<fdq> $$1) {
      super($$0, $$1);
   }

   @Override
   public fay a() {
      return fav.h;
   }

   @Override
   protected fap a(List<? extends fap> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (fap)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (fap $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static fbb.a a(fax.a<?>... $$0) {
      return new fbb.a($$0);
   }

   public static class a extends fax.a<fbb.a> {
      private final Builder<fax> a = ImmutableList.builder();

      public a(fax.a<?>... $$0) {
         for (fax.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fbb.a a() {
         return this;
      }

      @Override
      public fbb.a c(fax.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fax b() {
         return new fbb(this.a.build(), this.f());
      }
   }
}
