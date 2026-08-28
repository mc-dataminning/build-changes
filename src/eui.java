import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eui extends euf {
   public static final MapCodec<eui> a = a(eui::new);

   eui(List<eum> $$0, List<exh> $$1) {
      super($$0, $$1);
   }

   @Override
   public eun a() {
      return euk.i;
   }

   @Override
   protected eue a(List<? extends eue> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eue)$$0.get(0);
         case 2 -> {
            eue $$1 = $$0.get(0);
            eue $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eue $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eui.a a(eum.a<?>... $$0) {
      return new eui.a($$0);
   }

   public static class a extends eum.a<eui.a> {
      private final Builder<eum> a = ImmutableList.builder();

      public a(eum.a<?>... $$0) {
         for (eum.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eui.a a() {
         return this;
      }

      @Override
      public eui.a b(eum.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eum b() {
         return new eui(this.a.build(), this.f());
      }
   }
}
