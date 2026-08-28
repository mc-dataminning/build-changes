import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fat extends faq {
   public static final MapCodec<fat> a = a(fat::new);

   fat(List<fax> $$0, List<fdq> $$1) {
      super($$0, $$1);
   }

   @Override
   public fay a() {
      return fav.i;
   }

   @Override
   protected fap a(List<? extends fap> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (fap)$$0.get(0);
         case 2 -> {
            fap $$1 = $$0.get(0);
            fap $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (fap $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static fat.a a(fax.a<?>... $$0) {
      return new fat.a($$0);
   }

   public static class a extends fax.a<fat.a> {
      private final Builder<fax> a = ImmutableList.builder();

      public a(fax.a<?>... $$0) {
         for (fax.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fat.a a() {
         return this;
      }

      @Override
      public fat.a b(fax.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fax b() {
         return new fat(this.a.build(), this.f());
      }
   }
}
