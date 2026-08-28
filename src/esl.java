import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class esl extends esa {
   public static final MapCodec<esl> a = a(esl::new);

   esl(List<esh> $$0, List<evc> $$1) {
      super($$0, $$1);
   }

   @Override
   public esi a() {
      return esf.h;
   }

   @Override
   protected erz a(List<? extends erz> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (erz)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (erz $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static esl.a a(esh.a<?>... $$0) {
      return new esl.a($$0);
   }

   public static class a extends esh.a<esl.a> {
      private final Builder<esh> a = ImmutableList.builder();

      public a(esh.a<?>... $$0) {
         for (esh.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected esl.a a() {
         return this;
      }

      @Override
      public esl.a c(esh.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esh b() {
         return new esl(this.a.build(), this.f());
      }
   }
}
