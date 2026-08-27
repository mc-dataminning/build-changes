import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class egt extends egq {
   public static final Codec<egt> a = a(egt::new);

   egt(List<egx> $$0, List<ejd> $$1) {
      super($$0, $$1);
   }

   @Override
   public egy a() {
      return egv.i;
   }

   @Override
   protected egp a(List<? extends egp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (egp)$$0.get(0);
         case 2 -> {
            egp $$1 = $$0.get(0);
            egp $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (egp $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static egt.a a(egx.a<?>... $$0) {
      return new egt.a($$0);
   }

   public static class a extends egx.a<egt.a> {
      private final Builder<egx> a = ImmutableList.builder();

      public a(egx.a<?>... $$0) {
         for (egx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected egt.a a() {
         return this;
      }

      @Override
      public egt.a b(egx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public egx b() {
         return new egt(this.a.build(), this.f());
      }
   }
}
