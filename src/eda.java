import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class eda extends ecx {
   public static final Codec<eda> a = a(eda::new);

   eda(List<ede> $$0, List<efk> $$1) {
      super($$0, $$1);
   }

   @Override
   public edf a() {
      return edc.i;
   }

   @Override
   protected ecw a(List<? extends ecw> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ecw)$$0.get(0);
         case 2 -> {
            ecw $$1 = $$0.get(0);
            ecw $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ecw $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eda.a a(ede.a<?>... $$0) {
      return new eda.a($$0);
   }

   public static class a extends ede.a<eda.a> {
      private final Builder<ede> a = ImmutableList.builder();

      public a(ede.a<?>... $$0) {
         for (ede.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eda.a a() {
         return this;
      }

      @Override
      public eda.a b(ede.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ede b() {
         return new eda(this.a.build(), this.f());
      }
   }
}
