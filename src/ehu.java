import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ehu extends ehr {
   public static final Codec<ehu> a = a(ehu::new);

   ehu(List<ehy> $$0, List<eke> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehz a() {
      return ehw.i;
   }

   @Override
   protected ehq a(List<? extends ehq> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ehq)$$0.get(0);
         case 2 -> {
            ehq $$1 = $$0.get(0);
            ehq $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ehq $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ehu.a a(ehy.a<?>... $$0) {
      return new ehu.a($$0);
   }

   public static class a extends ehy.a<ehu.a> {
      private final Builder<ehy> a = ImmutableList.builder();

      public a(ehy.a<?>... $$0) {
         for (ehy.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ehu.a a() {
         return this;
      }

      @Override
      public ehu.a b(ehy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ehy b() {
         return new ehu(this.a.build(), this.f());
      }
   }
}
