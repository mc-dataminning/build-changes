import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class elt extends eli {
   public static final Codec<elt> a = a(elt::new);

   elt(List<elp> $$0, List<env> $$1) {
      super($$0, $$1);
   }

   @Override
   public elq a() {
      return eln.h;
   }

   @Override
   protected elh a(List<? extends elh> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (elh)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (elh $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static elt.a a(elp.a<?>... $$0) {
      return new elt.a($$0);
   }

   public static class a extends elp.a<elt.a> {
      private final Builder<elp> a = ImmutableList.builder();

      public a(elp.a<?>... $$0) {
         for (elp.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected elt.a a() {
         return this;
      }

      @Override
      public elt.a c(elp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public elp b() {
         return new elt(this.a.build(), this.f());
      }
   }
}
