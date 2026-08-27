import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ehk extends ehh {
   public static final Codec<ehk> a = a(ehk::new);

   ehk(List<eho> $$0, List<eju> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehp a() {
      return ehm.i;
   }

   @Override
   protected ehg a(List<? extends ehg> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ehg)$$0.get(0);
         case 2 -> {
            ehg $$1 = $$0.get(0);
            ehg $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ehg $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ehk.a a(eho.a<?>... $$0) {
      return new ehk.a($$0);
   }

   public static class a extends eho.a<ehk.a> {
      private final Builder<eho> a = ImmutableList.builder();

      public a(eho.a<?>... $$0) {
         for (eho.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ehk.a a() {
         return this;
      }

      @Override
      public ehk.a b(eho.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eho b() {
         return new ehk(this.a.build(), this.f());
      }
   }
}
