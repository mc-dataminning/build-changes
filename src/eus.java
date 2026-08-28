import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eus extends eup {
   public static final MapCodec<eus> a = a(eus::new);

   eus(List<euw> $$0, List<exr> $$1) {
      super($$0, $$1);
   }

   @Override
   public eux a() {
      return euu.i;
   }

   @Override
   protected euo a(List<? extends euo> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (euo)$$0.get(0);
         case 2 -> {
            euo $$1 = $$0.get(0);
            euo $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (euo $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eus.a a(euw.a<?>... $$0) {
      return new eus.a($$0);
   }

   public static class a extends euw.a<eus.a> {
      private final Builder<euw> a = ImmutableList.builder();

      public a(euw.a<?>... $$0) {
         for (euw.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eus.a a() {
         return this;
      }

      @Override
      public eus.a b(euw.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public euw b() {
         return new eus(this.a.build(), this.f());
      }
   }
}
