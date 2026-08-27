import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class eic extends ehr {
   public static final Codec<eic> a = a(eic::new);

   eic(List<ehy> $$0, List<eke> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehz a() {
      return ehw.h;
   }

   @Override
   protected ehq a(List<? extends ehq> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ehq)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ehq $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eic.a a(ehy.a<?>... $$0) {
      return new eic.a($$0);
   }

   public static class a extends ehy.a<eic.a> {
      private final Builder<ehy> a = ImmutableList.builder();

      public a(ehy.a<?>... $$0) {
         for (ehy.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eic.a a() {
         return this;
      }

      @Override
      public eic.a c(ehy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ehy b() {
         return new eic(this.a.build(), this.f());
      }
   }
}
